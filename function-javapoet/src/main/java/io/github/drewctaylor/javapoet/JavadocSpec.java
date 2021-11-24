package io.github.drewctaylor.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;
import io.github.drewctaylor.require.Require;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static io.github.drewctaylor.javapoet.JavadocSpec.Builder.parameterJavadoc;
import static io.github.drewctaylor.javapoet.JavadocSpec.Builder.throwsJavadoc;
import static io.github.drewctaylor.javapoet.JavadocSpec.Builder.typeVariableJavadoc;
import static java.lang.System.lineSeparator;
import static java.util.Objects.requireNonNull;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.concat;

/**
 * A javadoc spec.
 */
public final class JavadocSpec
{
    private final List<CodeBlock> codeBlockList;
    private final List<ParameterSpec> parameterSpecList;
    private final Map<ParameterSpec, CodeBlock> parameterSpecCodeBlockMap;
    private final List<TypeVariableName> typeVariableNameList;
    private final Map<TypeVariableName, CodeBlock> typeVariableNameCodeBlockMap;
    private final List<TypeName> exceptionTypeNameList;
    private final Map<TypeName, List<CodeBlock>> exceptionTypeNameCodeBlockMap;
    private final Optional<CodeBlock> codeBlockReturn;

    private JavadocSpec(
            List<CodeBlock> codeBlockList,
            List<ParameterSpec> parameterSpecList,
            Map<ParameterSpec, CodeBlock> parameterSpecCodeBlockMap,
            List<TypeVariableName> typeVariableNameList,
            Map<TypeVariableName, CodeBlock> typeVariableNameCodeBlockMap,
            List<TypeName> exceptionTypeNameList,
            Map<TypeName, List<CodeBlock>> exceptionTypeNameCodeBlockMap,
            Optional<CodeBlock> codeBlockReturn)
    {
        this.codeBlockList = codeBlockList;
        this.parameterSpecList = parameterSpecList;
        this.parameterSpecCodeBlockMap = parameterSpecCodeBlockMap;
        this.typeVariableNameList = typeVariableNameList;
        this.typeVariableNameCodeBlockMap = typeVariableNameCodeBlockMap;
        this.exceptionTypeNameList = exceptionTypeNameList;
        this.exceptionTypeNameCodeBlockMap = exceptionTypeNameCodeBlockMap;
        this.codeBlockReturn = codeBlockReturn;
    }

    /**
     * Returns a code block representation of a javadoc spec.
     *
     * @return a code block representation of a javadoc spec
     */
    public CodeBlock toCodeBlock()
    {
        return concat(concat(concat(concat(
                codeBlockList.stream(),
                parameterSpecList.stream().map(parameterSpec -> parameterJavadoc(parameterSpec, parameterSpecCodeBlockMap.get(parameterSpec)))),
                typeVariableNameList.stream().map(typeVariableName -> typeVariableJavadoc(typeVariableName, typeVariableNameCodeBlockMap.get(typeVariableName)))),
                codeBlockReturn.stream()),
                exceptionTypeNameList.stream().flatMap(exceptionTypeName -> exceptionTypeNameCodeBlockMap.get(exceptionTypeName).stream().map(exceptionCodeBlock -> throwsJavadoc(exceptionTypeName, exceptionCodeBlock))))
                        .collect(CodeBlock.joining(lineSeparator()));
    }

    /**
     * A javadoc spec builder.
     */
    public static final class Builder
    {
        private final List<CodeBlock> codeBlockList = new ArrayList<>();
        private final List<ParameterSpec> parameterSpecList = new ArrayList<>();
        private final Map<ParameterSpec, CodeBlock> parameterSpecCodeBlockMap = new HashMap<>();
        private final List<TypeVariableName> typeVariableNameList = new ArrayList<>();
        private final Map<TypeVariableName, CodeBlock> typeVariableNameCodeBlockMap = new HashMap<>();
        private final List<TypeName> exceptionTypeNameList = new ArrayList<>();
        private final Map<TypeName, List<CodeBlock>> exceptionTypeNameCodeBlockMap = new HashMap<>();
        private Optional<CodeBlock> codeBlockReturn = Optional.empty();

        private Builder()
        {
        }

        /**
         * Construct a javadoc builder.
         *
         * @return a javadoc builder
         */
        public static Builder javadocBuilder()
        {
            return new Builder();
        }

        /**
         * Add text to the javadoc.
         *
         * @param  codeBlockString the text
         * 
         * @return                 this javadoc builder
         */
        public Builder add(
                final String codeBlockString)
        {
            requireNonNull(codeBlockString);

            return add(CodeBlock.of(codeBlockString));
        }

        /**
         * Add text to the javadoc.
         *
         * @param  codeBlock the text
         * 
         * @return           this javadoc builder
         */
        public Builder add(
                final CodeBlock codeBlock)
        {
            requireNonNull(codeBlock);

            codeBlockList.add(codeBlock);

            return this;
        }

        /**
         * Add documentation for a parameter.
         *
         * @param  parameterSpec   the parameter spec
         * @param  codeBlockString the description
         * 
         * @return                 this javadoc builder
         */
        public Builder addParameter(
                final ParameterSpec parameterSpec,
                final String codeBlockString)
        {
            requireNonNull(codeBlockString);

            this.parameterSpecList.add(parameterSpec);
            this.parameterSpecCodeBlockMap.put(parameterSpec, CodeBlock.of(codeBlockString));

            return this;
        }

        /**
         * Add documentation for a parameter.
         *
         * @param  parameterSpec the parameter spec
         * @param  codeBlock     the description
         * 
         * @return               this javadoc builder
         */
        public Builder addParameter(
                final ParameterSpec parameterSpec,
                final CodeBlock codeBlock)
        {
            requireNonNull(parameterSpec);
            requireNonNull(codeBlock);

            this.parameterSpecList.add(parameterSpec);
            this.parameterSpecCodeBlockMap.put(parameterSpec, codeBlock);

            return this;
        }

        /**
         * Add documentation for a parameter.
         *
         * @param  parameterSpecCodeBlockStringMap the parameter spec and description
         * 
         * @return                                 this javadoc builder
         */
        public Builder addParameterWithStringDescription(
                final Map<ParameterSpec, String> parameterSpecCodeBlockStringMap)
        {
            requireNonNull(parameterSpecCodeBlockStringMap);

            this.parameterSpecList.addAll(parameterSpecCodeBlockStringMap.keySet());
            parameterSpecCodeBlockStringMap.forEach((
                    parameterSpec,
                    codeBlockString) -> this.parameterSpecCodeBlockMap.put(parameterSpec, CodeBlock.of(codeBlockString)));

            return this;
        }

        /**
         * Add documentation for a parameter.
         *
         * @param  parameterSpecCodeBlockMap the parameter spec and description
         * 
         * @return                           this javadoc builder
         */
        public Builder addParameter(
                final Map<ParameterSpec, CodeBlock> parameterSpecCodeBlockMap)
        {
            requireNonNull(parameterSpecCodeBlockMap);

            this.parameterSpecList.addAll(parameterSpecCodeBlockMap.keySet());
            this.parameterSpecCodeBlockMap.putAll(parameterSpecCodeBlockMap);

            return this;
        }

        /**
         * Add documentation for a parameter.
         *
         * @param  parameterSpecList                             the parameter spec list
         * @param  parameterSpecIntegerCodeBlockStringBiFunction the description function
         * 
         * @return                                               this javadoc builder
         */
        public Builder addParameterWithStringDescription(
                final List<ParameterSpec> parameterSpecList,
                final BiFunction<ParameterSpec, Integer, String> parameterSpecIntegerCodeBlockStringBiFunction)
        {
            requireNonNull(parameterSpecList);
            requireNonNull(parameterSpecIntegerCodeBlockStringBiFunction);

            this.parameterSpecList.addAll(parameterSpecList);
            this.parameterSpecCodeBlockMap.putAll(range(0, parameterSpecList.size()).boxed().collect(Collectors.toMap(parameterSpecList::get, parameterSpecIndex -> CodeBlock.of(parameterSpecIntegerCodeBlockStringBiFunction.apply(parameterSpecList.get(parameterSpecIndex), parameterSpecIndex)))));

            return this;

        }

        /**
         * Add documentation for a parameter.
         *
         * @param  parameterSpecList                       the parameter spec list
         * @param  parameterSpecIntegerCodeBlockBiFunction the description function
         * 
         * @return                                         this javadoc builder
         */
        public Builder addParameter(
                final List<ParameterSpec> parameterSpecList,
                final BiFunction<ParameterSpec, Integer, CodeBlock> parameterSpecIntegerCodeBlockBiFunction)
        {
            requireNonNull(parameterSpecList);
            requireNonNull(parameterSpecIntegerCodeBlockBiFunction);

            this.parameterSpecList.addAll(parameterSpecList);
            this.parameterSpecCodeBlockMap.putAll(range(0, parameterSpecList.size()).boxed().collect(Collectors.toMap(parameterSpecList::get, parameterSpecIndex -> parameterSpecIntegerCodeBlockBiFunction.apply(parameterSpecList.get(parameterSpecIndex), parameterSpecIndex))));

            return this;
        }

        /**
         * Add documentation for a type parameter.
         *
         * @param  typeVariableName the type variable
         * @param  codeBlockString  the description
         * 
         * @return                  this javadoc builder
         */
        public Builder addTypeVariable(
                final TypeVariableName typeVariableName,
                final String codeBlockString)
        {
            requireNonNull(typeVariableName);
            requireNonNull(codeBlockString);

            this.typeVariableNameList.add(typeVariableName);
            this.typeVariableNameCodeBlockMap.put(typeVariableName, CodeBlock.of(codeBlockString));

            return this;
        }

        /**
         * Add documentation for a type parameter.
         *
         * @param  typeVariableName the type variable
         * @param  codeBlock        the description
         * 
         * @return                  this javadoc builder
         */
        public Builder addTypeVariable(
                final TypeVariableName typeVariableName,
                final CodeBlock codeBlock)
        {
            requireNonNull(typeVariableName);
            requireNonNull(codeBlock);

            this.typeVariableNameList.add(typeVariableName);
            this.typeVariableNameCodeBlockMap.put(typeVariableName, codeBlock);

            return this;
        }

        /**
         * Add documentation for a type parameter.
         *
         * @param  typeVariableNameCodeBlockStringMap the type variable name and description
         * 
         * @return                                    this javadoc builder
         */
        public Builder addTypeVariableWithStringDescription(
                final Map<TypeVariableName, String> typeVariableNameCodeBlockStringMap)
        {
            requireNonNull(typeVariableNameCodeBlockMap);

            this.typeVariableNameList.addAll(typeVariableNameCodeBlockStringMap.keySet());
            typeVariableNameCodeBlockStringMap.forEach((
                    typeVariableName,
                    codeBlockString) -> typeVariableNameCodeBlockMap.put(typeVariableName, CodeBlock.of(codeBlockString)));

            return this;
        }

        /**
         * Add documentation for a type parameter.
         *
         * @param  typeVariableNameCodeBlockMap the type variable name and description
         * 
         * @return                              this javadoc builder
         */
        public Builder addTypeVariable(
                final Map<TypeVariableName, CodeBlock> typeVariableNameCodeBlockMap)
        {
            requireNonNull(typeVariableNameCodeBlockMap);

            this.typeVariableNameList.addAll(typeVariableNameCodeBlockMap.keySet());
            this.typeVariableNameCodeBlockMap.putAll(typeVariableNameCodeBlockMap);

            return this;
        }

        /**
         * Add documentation for a type parameter.
         *
         * @param  typeVariableNameList                       the type variable name list
         * @param  typeVariableNameIntegerCodeBlockBiFunction the description function
         * 
         * @return                                            this javadoc builder
         */
        public Builder addTypeVariable(
                final List<TypeVariableName> typeVariableNameList,
                final BiFunction<TypeVariableName, Integer, CodeBlock> typeVariableNameIntegerCodeBlockBiFunction)
        {
            requireNonNull(typeVariableNameList);
            requireNonNull(typeVariableNameIntegerCodeBlockBiFunction);

            this.typeVariableNameList.addAll(typeVariableNameList);
            this.typeVariableNameCodeBlockMap.putAll(range(0, typeVariableNameList.size()).boxed().collect(Collectors.toMap(typeVariableNameList::get, typeVariableNameIndex -> typeVariableNameIntegerCodeBlockBiFunction.apply(typeVariableNameList.get(typeVariableNameIndex), typeVariableNameIndex))));

            return this;
        }

        /**
         * Add documentation for a type parameter.
         *
         * @param  typeVariableNameList                             the type variable name list
         * @param  typeVariableNameIntegerCodeBlockStringBiFunction the description function
         * 
         * @return                                                  this javadoc builder
         */
        public Builder addTypeVariableWithStringDescription(
                final List<TypeVariableName> typeVariableNameList,
                final BiFunction<TypeVariableName, Integer, String> typeVariableNameIntegerCodeBlockStringBiFunction)
        {
            requireNonNull(typeVariableNameList);
            requireNonNull(typeVariableNameIntegerCodeBlockStringBiFunction);

            this.typeVariableNameList.addAll(typeVariableNameList);
            this.typeVariableNameCodeBlockMap.putAll(range(0, typeVariableNameList.size()).boxed().collect(Collectors.toMap(typeVariableNameList::get, typeVariableNameIndex -> CodeBlock.of(typeVariableNameIntegerCodeBlockStringBiFunction.apply(typeVariableNameList.get(typeVariableNameIndex), typeVariableNameIndex)))));

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionClass  the exception
         * @param  codeBlockString the description
         * 
         * @return                 this javadoc builder
         */
        public Builder addThrows(
                final Class<?> exceptionClass,
                final String codeBlockString)
        {
            requireNonNull(exceptionClass);
            requireNonNull(codeBlockString);

            if (!this.exceptionTypeNameList.contains(ClassName.get(exceptionClass)))
            {
                this.exceptionTypeNameList.add(ClassName.get(exceptionClass));
                this.exceptionTypeNameCodeBlockMap.put(ClassName.get(exceptionClass), List.of(CodeBlock.of(codeBlockString)));
            }
            else
            {
                this.exceptionTypeNameCodeBlockMap.get(ClassName.get(exceptionClass)).add(CodeBlock.of(codeBlockString));
            }

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionClass      the exception
         * @param  codeBlockStringList the description
         * 
         * @return                     this javadoc builder
         */
        public Builder addThrowsWithStringDescription(
                final Class<?> exceptionClass,
                final List<String> codeBlockStringList)
        {
            requireNonNull(exceptionClass);
            requireNonNull(codeBlockStringList);

            if (!this.exceptionTypeNameList.contains(ClassName.get(exceptionClass)))
            {
                this.exceptionTypeNameList.add(ClassName.get(exceptionClass));
                this.exceptionTypeNameCodeBlockMap.put(ClassName.get(exceptionClass), codeBlockStringList.stream().map(CodeBlock::of).collect(Collectors.toUnmodifiableList()));
            }
            else
            {
                this.exceptionTypeNameCodeBlockMap.get(ClassName.get(exceptionClass)).addAll(codeBlockStringList.stream().map(CodeBlock::of).collect(Collectors.toUnmodifiableList()));
            }

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeName the exception
         * @param  codeBlockString   the description
         * 
         * @return                   this javadoc builder
         */
        public Builder addThrows(
                final TypeName exceptionTypeName,
                final String codeBlockString)
        {
            requireNonNull(exceptionTypeName);
            requireNonNull(codeBlockString);

            if (!this.exceptionTypeNameList.contains(exceptionTypeName))
            {
                this.exceptionTypeNameList.add(exceptionTypeName);
                this.exceptionTypeNameCodeBlockMap.put(exceptionTypeName, List.of(CodeBlock.of(codeBlockString)));
            }
            else
            {
                this.exceptionTypeNameCodeBlockMap.get(exceptionTypeName).add(CodeBlock.of(codeBlockString));
            }

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeName   the exception
         * @param  codeBlockStringList the description
         * 
         * @return                     this javadoc builder
         */
        public Builder addThrowsWithStringDescription(
                final TypeName exceptionTypeName,
                final List<String> codeBlockStringList)
        {
            requireNonNull(exceptionTypeName);
            requireNonNull(codeBlockStringList);

            if (!this.exceptionTypeNameList.contains(exceptionTypeName))
            {
                this.exceptionTypeNameList.add(exceptionTypeName);
                this.exceptionTypeNameCodeBlockMap.put(exceptionTypeName, codeBlockStringList.stream().map(CodeBlock::of).collect(Collectors.toUnmodifiableList()));
            }
            else
            {
                this.exceptionTypeNameCodeBlockMap.get(exceptionTypeName).addAll(codeBlockStringList.stream().map(CodeBlock::of).collect(Collectors.toUnmodifiableList()));
            }

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeName the exception
         * @param  codeBlock         the description
         * 
         * @return                   this javadoc builder
         */
        public Builder addThrows(
                final TypeName exceptionTypeName,
                final CodeBlock codeBlock)
        {
            requireNonNull(exceptionTypeName);
            requireNonNull(codeBlock);

            if (!this.exceptionTypeNameList.contains(exceptionTypeName))
            {
                this.exceptionTypeNameList.add(exceptionTypeName);
                this.exceptionTypeNameCodeBlockMap.put(exceptionTypeName, List.of(codeBlock));
            }
            else
            {
                this.exceptionTypeNameCodeBlockMap.get(exceptionTypeName).add(codeBlock);
            }

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeName the exception
         * @param  codeBlockList     the description
         * 
         * @return                   this javadoc builder
         */
        public Builder addThrows(
                final TypeName exceptionTypeName,
                final List<CodeBlock> codeBlockList)
        {
            requireNonNull(exceptionTypeName);
            requireNonNull(codeBlockList);

            if (!this.exceptionTypeNameList.contains(exceptionTypeName))
            {
                this.exceptionTypeNameList.add(exceptionTypeName);
                this.exceptionTypeNameCodeBlockMap.put(exceptionTypeName, codeBlockList);
            }
            else
            {
                this.exceptionTypeNameCodeBlockMap.get(exceptionTypeName).addAll(codeBlockList);
            }

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeNameCodeBlockStringMap the exception and description
         * 
         * @return                                     this javadoc builder
         */
        public Builder addThrowsWithStringDescription(
                final Map<TypeName, List<String>> exceptionTypeNameCodeBlockStringMap)
        {
            requireNonNull(exceptionTypeNameCodeBlockStringMap);

            exceptionTypeNameCodeBlockStringMap.keySet().stream().forEach(exceptionTypeName -> addThrowsWithStringDescription(exceptionTypeName, exceptionTypeNameCodeBlockStringMap.get(exceptionTypeName)));

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeNameCodeBlockMap the exception and description
         * 
         * @return                               this javadoc builder
         */
        public Builder addThrows(
                final Map<TypeName, List<CodeBlock>> exceptionTypeNameCodeBlockMap)
        {
            requireNonNull(exceptionTypeNameCodeBlockMap);

            exceptionTypeNameCodeBlockMap.keySet().stream().forEach(exceptionTypeName -> addThrows(exceptionTypeName, exceptionTypeNameCodeBlockMap.get(exceptionTypeName)));

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeNameList                             the exception list
         * @param  exceptionTypeNameIntegerCodeBlockStringBiFunction the description function
         * 
         * @return                                                   this javadoc builder
         */
        public Builder addThrowsWithStringDescription(
                final List<TypeName> exceptionTypeNameList,
                final BiFunction<TypeName, Integer, List<String>> exceptionTypeNameIntegerCodeBlockStringBiFunction)
        {
            requireNonNull(exceptionTypeNameList);
            requireNonNull(exceptionTypeNameIntegerCodeBlockStringBiFunction);

            range(0, exceptionTypeNameList.size()).boxed().forEach(typeNameIndex -> addThrows(exceptionTypeNameList.get(typeNameIndex), exceptionTypeNameIntegerCodeBlockStringBiFunction.apply(exceptionTypeNameList.get(typeNameIndex), typeNameIndex).stream().map(CodeBlock::of).collect(Collectors.toList())));

            return this;
        }

        /**
         * Add documentation for an exception.
         *
         * @param  exceptionTypeNameList                       the exception list
         * @param  exceptionTypeNameIntegerCodeBlockBiFunction the description function
         * 
         * @return                                             this javadoc builder
         */
        public Builder addThrows(
                final List<TypeName> exceptionTypeNameList,
                final BiFunction<TypeName, Integer, List<CodeBlock>> exceptionTypeNameIntegerCodeBlockBiFunction)
        {
            requireNonNull(exceptionTypeNameList);
            requireNonNull(exceptionTypeNameIntegerCodeBlockBiFunction);

            range(0, exceptionTypeNameList.size()).boxed().forEach(typeNameIndex -> addThrows(exceptionTypeNameList.get(typeNameIndex), exceptionTypeNameIntegerCodeBlockBiFunction.apply(exceptionTypeNameList.get(typeNameIndex), typeNameIndex)));

            return this;
        }

        /**
         * Add documentation for the return value.
         *
         * @param  codeBlockStringReturn the documentation for the return value
         * 
         * @return                       this javadoc builder
         */
        public Builder setReturn(
                final String codeBlockStringReturn)
        {
            requireNonNull(codeBlockStringReturn);

            this.codeBlockReturn = Optional.of(returnJavadoc(CodeBlock.of(codeBlockStringReturn)));

            return this;
        }

        /**
         * Add documentation for the return value.
         *
         * @param  codeBlockReturn the documentation for the return value
         * 
         * @return                 this javadoc builder
         */
        public Builder setReturn(
                final CodeBlock codeBlockReturn)
        {
            requireNonNull(codeBlockReturn);

            this.codeBlockReturn = Optional.of(returnJavadoc(codeBlockReturn));

            return this;
        }

        /**
         * Returns a javadoc comment.
         *
         * @return a javadoc comment
         */
        public JavadocSpec build()
        {
            return new JavadocSpec(
                    codeBlockList,
                    parameterSpecList,
                    parameterSpecCodeBlockMap,
                    typeVariableNameList,
                    typeVariableNameCodeBlockMap,
                    exceptionTypeNameList,
                    exceptionTypeNameCodeBlockMap,
                    codeBlockReturn);
        }

        /**
         * Returns a parameter clause.
         *
         * @param  parameterSpec        the parameter spec
         * @param  parameterDescription the parameter description
         * 
         * @return                      a parameter clause
         */
        public static CodeBlock parameterJavadoc(
                final ParameterSpec parameterSpec,
                final CodeBlock parameterDescription)
        {
            Require.requireNonNull(parameterSpec, "parameterSpec");
            Require.requireNonNull(parameterDescription, "parameterDescription");

            return CodeBlock.of("@param $N $L", parameterSpec, parameterDescription);
        }

        /**
         * Returns a type variable clause.
         *
         * @param  typeVariableName        the type variable name
         * @param  typeVariableDescription the type variable description
         * 
         * @return                         a type variable clause
         */
        public static CodeBlock typeVariableJavadoc(
                final TypeVariableName typeVariableName,
                final CodeBlock typeVariableDescription)
        {
            Require.requireNonNull(typeVariableName, "typeVariableName");
            Require.requireNonNull(typeVariableDescription, "typeVariableDescription");

            return CodeBlock.of("@param <$L> $L", typeVariableName.name, typeVariableDescription);
        }

        /**
         * Returns a javadoc returns clause.
         *
         * @param  returnDescription the content of the returns clause
         * 
         * @return                   a javadoc returns clause
         */
        public static CodeBlock returnJavadoc(
                final CodeBlock returnDescription)
        {
            Require.requireNonNull(returnDescription, "returnDescription");

            return CodeBlock.of("@return $L", returnDescription);
        }

        /**
         * Returns a javadoc throws clause.
         *
         * @param  exceptionName        the type of the exception
         * @param  exceptionDescription the condition under which the exception occurs
         * 
         * @return                      a javadoc throws clause
         */
        public static CodeBlock throwsJavadoc(
                final TypeName exceptionName,
                final CodeBlock exceptionDescription)
        {
            Require.requireNonNull(exceptionName, "exceptionName");
            Require.requireNonNull(exceptionDescription, "exceptionDescription");

            return CodeBlock.of("@throws $T $L", exceptionName, exceptionDescription);
        }
    }
}
