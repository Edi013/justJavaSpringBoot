1. AopExampleMp3 -> Chapters 1-7, containing:
- Aspect oriented programming example implemented in Java
- AOP annotation examples - Before, AfterReturning, Aroung
- custom annotation
- Auto executed code at spring launch time using CommandLineRunner interface - usage example


2. WebAppExample -> Chapter 7-8
- an example of a web app using Spring, Spring Boot and static pages
- example of MVC architecture
- very simple web app, it has only one available route: /home


3. TemplateEngine -> Chapter 8-9
- an example of a web app using dynamic rendering of html content, generated on server side
- an web app that handles both /home route and /products, for the latter both GET and POST


4. Ch9WebScopes -> Chapter 9-10
- Ch9, request, session and application scopes demonstration:
-- request -> a single HTTP request
-- session -> tied to the HTTP session (browser session)
-- application -> exists from Spring context startup until shutdown
- Ch10, REST services:
-- creating endpoints
-- using objects as response body and receiving data from client with @RequestBody
-- setting headers and response status
-- handling exceptions as a centralized option using @RestControllerAdvice


5. ConsumingEndpoints -> Chapter 11
- Ch11 Consuming REST Endpoints by implementing the client side of a REST service

5. 1. OpenFeign  
- Declarative HTTP client by the Spring Cloud project.
- It is the right fit for non-reactive apps;
- Purpose: Makes it easy to call HTTP APIs by just defining interfaces

5. 2. RestTemplate 
- Synchronous HTTP client. 
- It is deprecated now in favor of WebClient
- Purpose: tool used to call REST endpoints in Spring apps.       

5. 3. WebClient 
- Reactive, non-blocking HTTP client
- Part of Spring WebFlux.
- Purpose: makes HTTP calls, but supports reactive programming, streams, and asynchronous calls

6. OpenAPI
- Is a formal standard, language agnostic. It has 4 main responsabilities:
- 1. Generates Documentation - Creates interactive, human-readable API docs from the spec/yaml
- Tools like Swagger UI or Redoc can automatically render interactive API docs from OpenAPI
- 2. Describes APIs - Writes down all the rules of how an API works in a file -> defines endpoints, parameters, request/response formats, and authentication. 
- 3. Generates Client Code/Interfaces - Produces ready-to-use classes or interfaces to call the API automatically.
- 4. Generates Interfaces - Provides an universal contract

7. DataSourcesCh12
- Ch12 : DataSources, DataSources2 and DataSources3 (Data Sources in Spring Apps using JDBC)
- Ch13 : Ch13Transactions (Transactions using JDBC) 
 -> Rollback = The transaction ends with rollback when the app restores the data to the way it looked at the beginning of the transaction to avoid data inconsistencies.
 -> Commit = The successful end of a transaction when the app stores all the changes made by the transaction's mutable operations.
- Ch14 : DataSpringCh14 https://spring.io/projects/spring-data (Data Persistance with Spring Data using JPA) 


8. DataSpring-Ch14 -> Also Ch15 : Testing a Spring app 

8. 1. 1.  Unit tests
- Focus only on an isolated piece of logic
- Integration tests : Focus on validating that multiple components correctly interact with each other
- A CI tool, such as Jenkins or TeamCity, runs the tests every time a developer changes the app by pushing to remote
- About unit tests, you ll find these three steps (assumptions, call, and validations) named a bit differently:'arrange, act, and assert' or ' given, when, and then'.

8. 1. 2. Dependencies:
- JUnit Jupiter = Run tests with JUnit 5 (can run independently -> junit-jupiter)
- Mockito Core = Create and verify mocks programmatically (mokito-core has dependency upon -> junit-jupiter )
- Mockito JUnit Jupiter = Allows @Mock/@InjectMocks to be initialized automatically via @ExtendWith(MockitoExtension.class) (need both junit-jupiter and mokito-core to run)

8. 2. Integration Tests
- an integration test looks very similar to a unit test. You still follow the same steps of identifying the assumptions, calling the tested method, and validating the results
- now the test doesn t focus on an isolated piece of logic, so you don t necessarily have to mock all the dependencies
- it is not mandatory anymore, but you can still mock if needed

8. 2. 1. What kind of integrations can we test? We have a few possibilities:
- Integration between two (or more) objects of your app. Testing that the objects interact correctly helps you identify problems in how they collaborate if you change one of them.

- Integration of an object of your app with some capability the framework enhances it with. Testing how an object interacts with some capability the framework provides helps you identify issues that can occur when you upgrade the framework to a new version. The integration test helps you immediately identify if something changed in the framework and the capability the object relies on doesn t work the same way.

- Integration of the app with its persistence layer (the database). Testing how the repository works with the database ensures you quickly identify problems that might occur when upgrading or changing a dependency that helps your app work with persisted data (such as the JDBC driver).

