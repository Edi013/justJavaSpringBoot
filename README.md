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