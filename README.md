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