Treinamento JUnit - Academia S2IT
==========

# JUnit
[http://junit.org/]

[FAQ](http://junit.org/faq.html)

## Convenções


### Nome de Classes
O nome da classe de teste deve ser o nome da classe a ser testada seguido do sufixo Test.
Ex.:

Classe a ser testada :  Person.java
```java
public class Person {
  
}
```

Classe de testes : PersonTest.java
```java
public class PersonTest {
 
}
```

### Nome de métodos
Os métodos a serem testados devem possuir o prefixo "test" e serem anotatos com @Test.

Classe a ser testada :  Calculator.java
```java
public class Calculator {
  
  public int sum(int a , int b){
  	return a+b;
  }
}
```

Classe de testes : CalculatorTest.java
```java
public class CalculatorTest {
  
  @Test
  public void testSum(){
  	//Teste da função de soma
  } 
}
```
Outra pratica que vem ganhando espaço com praticas de BDD, é iniciar os testes com "should", mas neste caso devemos descrever um cenário.

```java
public class CalculatorTest {
  
  @Test
  public void shouldSumTwoNumbers(){
  	//Teste da função de soma
  } 
  @Test
  public void shouldSumWithZero(){
  	//Teste da função de soma com Zero
  } 
}
```
[referência](http://stackoverflow.com/questions/4491952/prefix-for-testing-methods-in-unit-test-vs-should)

## Framework
- @Test
- @BeforeClass
- @Before
- @After
- @AfterClass
- Asserts - Afirmar
- @RunWith
- @Ignore
- @Rule - [Docs](https://github.com/junit-team/junit/wiki/Rules)
- @Test(expected = Exception.class)

# Hamcrest
[Tutorial](https://code.google.com/p/hamcrest/wiki/Tutorial)

- Matchers

# Mockito
[http://mockito.org/]

- @Mock
- @InjectMocks
- .when()
- .thenReturn()

# Spring

## IoC
Inversão de controle.
- @Configuration
- @ComponentScan(basePackages="br.com.s2it.spring")

## Dependenci Injection
Injeção de dependências.
- @Autowired

## Tests
- @RunWith(SpringJUnit4ClassRunner.class)
- @ContextConfiguration(classes=AppConfig.class)

# TDD
- [TDD - Caelum](http://tdd.caelum.com.br/)
- [TDD - Algaworks - Video](http://cafe.algaworks.com/palestra-tdd/?inf_contact_key=3a275e7555d8cad11da74a6ee96fadddda952b11bc6498468b5409ab26d7e736)

# Maven
- Build lifecycle [Documentação oficial](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)
	- validate - validate the project is correct and all necessary information is available
	- compile - compile the source code of the project
	- test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
	- package - take the compiled code and package it in its distributable format, such as a JAR.
	- integration-test - process and deploy the package if necessary into an environment where integration tests can be run
	- verify - run any checks to verify the package is valid and meets quality criteria
	- install - install the package into the local repository, for use as a dependency in other projects locally
	- deploy - done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.
- Gerenciamento de Dependências

	```console
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.10</version>
		</dependency>
	```
- Executando

	```console
		mvn test
	```
