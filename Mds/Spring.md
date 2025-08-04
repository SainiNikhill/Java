Spring Framework Interview Notes
================================

What is Spring Framework?
-------------------------

Spring is a powerful, lightweight Java framework for building scalable, secure, and maintainable backend applications. It provides Dependency Injection (DI), Aspect-Oriented Programming (AOP), and other features that simplify enterprise Java development.

**Key Features:**
- Lightweight and open source
- Inversion of Control (IoC)
- Dependency Injection (DI)
- Aspect-Oriented Programming (AOP)
- Model-View-Controller (MVC) architecture
- Integrates with technologies like JPA, Hibernate, Security, etc.
- Facilitates easy testing and integration

Spring Core
-----------

Spring Core is the foundation module of the Spring Framework, providing the IoC container and dependency management.

| Concept                  | Description                                                    |
|--------------------------|----------------------------------------------------------------|
| IoC (Inversion of Control)   | Framework handles object creation, not the developer            |
| DI (Dependency Injection)    | Dependencies are injected automatically (constructor, setter)     |
| Bean                      | Object managed by the Spring container                         |
| ApplicationContext         | Container managing bean lifecycle and configuration             |
| Bean Lifecycle             | Covers initialization, destruction, scope, etc.                |
| @Component/@Bean           | Annotations to register objects with the container             |
| @Autowired                 | For automatic dependency injection                             |

High-Frequency Spring Interview Topics
--------------------------------------

**Core Concepts**
- What is Spring Framework?
- Difference between Spring and Spring Boot
- IoC and DI, bean lifecycle and scopes
- Spring annotations: @Component, @Autowired, @Bean, etc.
- ApplicationContext vs BeanFactory

**Spring Boot**
- @SpringBootApplication annotation
- Auto-configuration and starter dependencies
- Profiles and configuration files
- Difference: Spring Boot vs Spring MVC

**Spring MVC**
- Request lifecycle
- Controllers, services, repositories
- REST API development
- Exception handling: @ControllerAdvice, @ExceptionHandler
- ModelAndView, ViewResolvers

**Spring Data JPA**
- CrudRepository vs JpaRepository
- Entity relationships: @OneToMany, @ManyToOne
- JPQL vs Native Queries

**Spring Security**
- Authentication vs authorization
- Security filters and SecurityContext
- JWT-based authentication
- Access control by role

**Advanced Topics**
- Aspect-Oriented Programming (AOP)
- Transactions and @Transactional
- Hibernate integration
- Caching in Spring
- Testing with Spring Boot

Understanding Spring's Purpose
------------------------------

Spring is a comprehensive, modular Java framework that simplifies enterprise application development, offering infrastructure support for web apps, microservices, and REST APIs.

**Core Principles:**
- Loose coupling
- Separation of concerns
- Simplified dependency management
- Reduced boilerplate code

**Why use Spring?**
- Efficient, flexible object management
- Modular architecture—only use what you need
- Annotation-based configuration
- Seamless integration with Spring Boot for rapid development
- Test-friendly design
- Massive community and documentation

Spring vs Spring Boot Comparison
-------------------------------

| Feature               | Spring Framework                  | Spring Boot                           |
|-----------------------|-----------------------------------|---------------------------------------|
| Setup                 | Manual configuration              | Auto-configuration, minimal setup     |
| Project Start         | Slower, more complex              | Quick, easy startup (Spring Initializr)|
| Embedded Server       | Not included                      | Built-in (Tomcat, Jetty, Undertow)    |
| Dependency Handling   | Manual                            | Starter dependencies                  |
| Testing               | Requires setup                    | Out-of-the-box support                |
| Development Tools     | Added manually                    | Built-in DevTools                     |
| XML Configuration     | Common                            | Rare, relies on annotations           |

*Spring Boot builds on top of Spring, providing a production-ready environment with minimal configuration.*

Spring Bean Fundamentals
------------------------

A Bean is an object managed by the Spring IoC Container. Any class that is instantiated, assembled, and managed by Spring is considered a "bean".

**Defining a Bean:**

1. **Annotation-Based:**
   ```java
   @Component
   public class MyService { }
   ```

2. **Manual Java Configuration:**
   ```java
   @Configuration
   public class AppConfig {
       @Bean
       public MyService myService() {
           return new MyService();
       }
   }
   ```

Spring Bean Lifecycle
---------------------

Understanding the bean lifecycle helps with proper resource management, logging, initialization, and cleanup.

**Lifecycle Steps:**

1. Instantiation
2. Dependency injection (via @Autowired, constructor, or setter)
3. Optional callbacks: BeanNameAware, BeanFactoryAware
4. Optional ApplicationContextAware callback
5. Pre-initialization (BeanPostProcessor#postProcessBeforeInitialization)
6. Initialization (@PostConstruct or InitializingBean#afterPropertiesSet)
7. Post-initialization (BeanPostProcessor#postProcessAfterInitialization)
8. Ready for use
9. Destruction (@PreDestroy or DisposableBean#destroy, when context is closed)

**Annotation Example:**
```java
@Component
public class MyBean {
    @PostConstruct
    public void init() { System.out.println("Initialized"); }
    @PreDestroy
    public void cleanup() { System.out.println("Destroyed"); }
}
```

Spring Configuration Approaches
-------------------------------

There are three main ways to configure Spring applications:

1. **XML-Based (Legacy):**
   ```xml
   
   ```
   ```java
   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
   ```

2. **Java-Based (Modern):**
   ```java
   @Configuration
   public class AppConfig {
       @Bean
       public MyService myService() { return new MyService(); }
   }
   ```
   ```java
   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
   ```

3. **Annotation-Based (Popular in Spring Boot):**
   ```java
   @Component
   public class MyService { }

   @Service
   public class MyBusinessService {
       @Autowired
       private MyService myService;
   }
   ```

Spring Container Overview
-------------------------

The Spring Container is core to the framework, responsible for:

- Creating and configuring beans
- Injecting dependencies
- Managing bean lifecycle
- Providing application context

**Container Responsibilities:**
- Instantiates beans as needed
- Injects required dependencies
- Manages entire bean lifecycle
- Configures beans using metadata (annotations/XML/config classes)
- Provides context access via ApplicationContext

**Types of Containers:**

| Type               | Interface                                      | Description                    |
|--------------------|------------------------------------------------|--------------------------------|
| BeanFactory        | org.springframework.beans.factory.BeanFactory   | Basic, lazy initialization     |
| ApplicationContext | org.springframework.context.ApplicationContext  | Full-featured, preferred type  |

**Comparison: BeanFactory vs ApplicationContext**

| Feature              | BeanFactory              | ApplicationContext           |
|----------------------|-------------------------|-----------------------------|
| Initialization       | Lazy (on demand)        | Eager (on startup)          |
| Internationalization | Not supported           | Supported                   |
| Event Handling       | Not supported           | Supported                   |
| BeanPostProcessors   | Manual registration     | Automatic                   |
| Web Applications     | Not suitable            | Preferred                   |

**Typical Use Example:**
```java
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
MyService service = context.getBean(MyService.class);
```

Inversion of Control (IoC) and Dependency Injection (DI)
--------------------------------------------------------

**IoC** is a design principle where control over object creation and dependency management is transferred from the programmer to a container (Spring).

**DI** is a pattern used to achieve IoC: instead of classes creating their dependencies, dependencies are "injected" by Spring.

**Types of Injection:**

| Type           | Description                             | Example                                         |
|----------------|-----------------------------------------|-------------------------------------------------|
| Constructor    | Injected via constructor                | Recommended for immutability                    |
| Setter         | Injected via setter method              | Useful for optional dependencies                |
| Field          | Injected directly into fields           | Common with @Autowired, but less test-friendly  |

**Constructor Injection Example:**
```java
@Component
public class Car {
    private final Engine engine;
    @Autowired
    public Car(Engine engine) { this.engine = engine; }
}
```

**Setter Injection Example:**
```java
@Component
public class Car {
    private Engine engine;
    @Autowired
    public void setEngine(Engine engine) { this.engine = engine; }
}
```

**Field Injection Example:**
```java
@Component
public class Car {
    @Autowired
    private Engine engine;
}
```

**Why Use IoC and DI?**
- Facilitates loose coupling
- Makes code easy to test (dependencies can be mocked easily)
- Improves modularity and reusability
- Centralizes dependency management
- Encourages SOLID principles (especially Dependency Inversion Principle)

