[![Workflow Maven Package](https://github.com/drewctaylor/function/workflows/workflow-maven-package/badge.svg)](https://github.com/drewctaylor/function/workflows/workflow-maven-package/badge.svg)
[![Workflow Maven Deploy](https://github.com/drewctaylor/function/workflows/workflow-maven-deploy/badge.svg)](https://github.com/drewctaylor/function/workflows/workflow-maven-deploy/badge.svg)
[![Code Coverage](https://codecov.io/gh/drewctaylor/function/branch/trunk/graph/badge.svg)](https://codecov.io/gh/drewctaylor/function)

# Function

This library provides functions and effects, from 0- to 32-parameters, which support

* composition: 

    ```java
    final F1<String, Integer> length = String::length;
    final F1<String, Boolean> nonEmpty = length.then(i -> i > 0);
    assertFalse(nonEmpty.f(""));
    assertTrue(nonEmpty.f("abc"));
    ```

* constant function: 

    ```java
    final F1<String, Integer> constant0a = F1.constant(0);
    final F1<String, Integer> constant0b = F1.c(0);
    assertEquals(0, constant0a.f("abc"));
    assertEquals(0, constant0b.f("abc"));    
  ```
  
* identity function: 

    ```java
    final F1<Integer, Integer> id1 = F1.identity();
    final F1<Integer, Integer> id2 = F1.c();
    assertEquals(1, id1.f(1));
    assertEquals(1, id2.f(1));
    ```

* no-op effect: 

    ```java
    final E1<Integer> e1 = E1.nop();
    ```
  
* partial application: 

    ```java
    final F2<String, Character, Integer> indexOf = (string, character) -> string.indexOf(String.valueOf(character));
    final F1<Character, Integer> alphabetIndexOf = indexOf.a("abcdefghijklmnopqrstuvwxyz");
    assertEquals(0, alphabetIndexOf.f('a'));
    assertEquals(1, alphabetIndexOf.f('b'));
    ```
  
* reverse parameters: 

    ```java
    final F2<String, Character, Boolean> contains1 = (s, c) -> s.contains(String.valueOf(c));
    final F2<Character, String, Boolean> contains2 = contains1.reverse();
    assertTrue(contains1.f("abc", 'a'));
    assertTrue(contains2.f('a', "abc"));
    ```

* currying:

    ```java
    final F2<String, Character, Boolean> contains1 = (s, c) -> s.contains(String.valueOf(c));
    final F1<String, F1<Character, Boolean>> contains2 = contains1.curry();
    assertTrue(contains1.f("abc", 'a'));
    assertTrue(contains2.f("abc").f('a'));
    ```
  
* uncurrying:

    ```java
    final F1<String, F1<Character, Boolean>> contains1 = s -> c -> s.contains(String.valueOf(c));
    final F2<String, Character, Boolean> contains2 = F2.uncurry(contains1);
    assertTrue(contains1.f("abc").f('a'));
    assertTrue(contains2.f("abc", 'a'));
    ```
  
## To Use

1) Update `~/.m2/settings.xml` to include a github username or github email address and a [github personal access token](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line).

    For example:

    ```xml
    <settings>
        <servers>
            <server>
                <id>function</id>
                <username>github-username-or-email-address</username>
                <password>github-personal-access-token</password>
            </server>
        </servers>
    </settings>
    ```

2) Update `pom.xml` to include a reference to the repository.

    For example:

    ```xml
    <repositories>
        <repository>
            <id>function</id>
            <name>GitHub Packages</name>
            <url>https://maven.pkg.github.com/drewctaylor/function</url>
        </repository>
    </repositories>
    ```

3) Update `pom.xml` to include the dependency. 

    For example:
    
    ```xml
    <dependencies>
        <dependency>
            <groupId>io.github.drewctaylor</groupId>
            <artifactId>function</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
    ```
