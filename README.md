Treinamento JUnit - Academia S2IT
==========

# JUnit
[http://junit.org/]

## Convensções

### Nome de Classes

### Nome de métodos

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
[https://code.google.com/p/hamcrest/wiki/Tutorial]

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
