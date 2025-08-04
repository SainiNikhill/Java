# 🌱 Spring Framework Notes

---

## 🌀 What is Spring Framework?

Spring is a powerful, lightweight Java framework used to build scalable, secure, and maintainable backend applications. It provides **Dependency Injection (DI)**, **Aspect-Oriented Programming (AOP)**, and several other features to simplify enterprise Java development.

### ✨ Features of Spring:
- Lightweight and open source
- Inversion of Control (IoC)
- Dependency Injection
- AOP (Aspect-Oriented Programming)
- MVC architecture
- Integrated with popular technologies: JPA, Hibernate, Security, etc.
- Easy testing and integration

---

## 🔧 What is Spring Core?

Spring Core is the **foundation module** of the entire Spring Framework. It provides the **IoC (Inversion of Control) Container** and **Dependency Injection** which are the backbone of Spring.

### Key Concepts in Spring Core:

| Concept               | Description                                                                 |
|-----------------------|-----------------------------------------------------------------------------|
| **IoC (Inversion of Control)** | Framework controls object creation instead of manual instantiation       |
| **DI (Dependency Injection)**  | Dependencies are automatically injected (via constructor, setter, etc.)   |
| **Bean**              | Object managed by Spring container                                           |
| **ApplicationContext**| The container that manages lifecycle and configuration of beans             |
| **Bean Lifecycle**    | Initialization, destruction, scope, etc.                                     |
| **@Component/@Bean**  | Annotations to register objects with the container                          |
| **@Autowired**        | Used for automatic dependency injection                                     |

---

## 🧠 Most Important Spring Topics (For Interviews)

Here’s a list of high-frequency Spring topics asked in interviews:

### ✅ Core Concepts
- What is Spring Framework?
- Difference between Spring and Spring Boot
- IoC vs DI
- Bean lifecycle and scopes
- Spring Annotations (`@Component`, `@Autowired`, `@Bean`, etc.)
- ApplicationContext vs BeanFactory

### ✅ Spring Boot
- `@SpringBootApplication` annotation
- Auto-configuration
- Starter dependencies
- Spring Boot vs Spring MVC
- Profiles and configuration files

### ✅ Spring MVC
- Request flow in Spring MVC
- Controllers, Services, and Repositories
- REST API with Spring MVC
- Exception Handling (`@ControllerAdvice`, `@ExceptionHandler`)
- ModelAndView, ViewResolvers

### ✅ Spring Data JPA
- `CrudRepository` vs `JpaRepository`
- Entity Relationships (`@OneToMany`, `@ManyToOne`)
- JPQL vs Native Queries

### ✅ Spring Security
- Authentication vs Authorization
- Filters and SecurityContext
- JWT-based authentication
- Role-based access control

### ✅ Advanced Topics
- AOP (Aspect-Oriented Programming)
- Transactions and `@Transactional`
- Integration with Hibernate
- Caching with Spring
- Testing with Spring Boot

---

# Spring
---

## 🌿 What is Spring and Why Do We Use It?

### ✅ What is Spring?

Spring is a comprehensive, modular Java framework designed to simplify enterprise application development. It provides infrastructure support for developing Java applications — especially web apps, microservices, and REST APIs.

It promotes:
- **Loose coupling**
- **Separation of concerns**
- **Simplified dependency management**
- **Boilerplate reduction**

---

### 🔥 Why Spring is Important

1. **Dependency Injection (DI) & Inversion of Control (IoC)**
   - Handles object creation and wiring, reducing tight coupling.
   - Promotes better design and testability.

2. **Modular Design**
   - You can use only the modules you need: Spring MVC, Spring Data, Spring Security, etc.

3. **Annotation-Based Configuration**
   - Reduces XML configuration using annotations like `@Component`, `@Autowired`, etc.

4. **Spring Boot Integration**
   - Helps build stand-alone production-ready apps with minimal configuration.

5. **Ease of Testing**
   - Spring provides test-friendly architecture for writing unit and integration tests easily.

6. **Community Support**
   - Massive community, documentation, and ongoing evolution (Spring 6+ and Spring Boot 3+)

---

### 🧰 Why Use Spring Framework?

| Reason                           | Explanation                                                                 |
|----------------------------------|-----------------------------------------------------------------------------|
| ✅ Loose Coupling & Easy Testing | Follows SOLID principles via DI & interfaces                                |
| ✅ Lightweight                   | No heavy container needed like J2EE; just use Spring’s own context          |
| ✅ Rapid Development             | Spring Boot cuts setup and dev time drastically                            |
| ✅ Scalable & Maintainable       | Best for enterprise and microservice-based apps                             |
| ✅ Integration with Tools        | Works with JPA, Hibernate, MySQL, RabbitMQ, Kafka, Redis, and more          |
| ✅ Declarative Programming       | Use annotations to handle config, transactions, caching, validation, etc.   |

---
---

## 🌿 Spring vs Spring Boot

| Feature                | Spring Framework                             | Spring Boot                                      |
|------------------------|----------------------------------------------|--------------------------------------------------|
| 🔧 Setup               | Requires manual configuration (XML or Java) | Auto-configuration with minimal setup            |
| 🚀 Project Start       | Slower, complex setup                       | Quick start with Spring Initializr               |
| 🌐 Embedded Server     | No embedded server, need external setup     | Comes with embedded Tomcat/Jetty/Undertow        |
| 📦 Dependency Handling | Manual                                        | Uses starter dependencies (e.g. `spring-boot-starter-web`) |
| 🧪 Testing             | Slightly more setup                         | Built-in testing support                         |
| 🔁 Dev Tools           | Need to add manually                        | Comes with Spring Boot DevTools                  |
| 🧱 XML Config          | Common (older style)                        | Mostly annotation-based                          |

### 🔥 Summary

> **Spring Boot** is a pre-configured version of Spring that makes it easy to create stand-alone, production-grade Spring applications.  
> It builds on top of Spring and removes much of the boilerplate code and configurations required in traditional Spring apps.

---

## 🌱 What is a Bean in Spring?

### ✅ Definition

In Spring, a **Bean** is simply an object that is managed by the **Spring IoC Container**.

Any class that is instantiated, assembled, and otherwise managed by Spring is considered a **Spring Bean**.

---

### 🔧 Ways to Define a Bean

1. **Annotation-Based**

```java
@Component
public class MyService {
    // your code
}
```
2. **Manual**
```java
@Configuration
public class AppConfig{

    @Bean
    public MyService(){
        return new MyService();
    }
}
```
---

## 🔁 Spring Bean Lifecycle

The **Spring Bean Lifecycle** refers to the sequence of events a bean goes through from **creation to destruction** in the Spring IoC container.

Understanding this helps in managing resources, logging, cleanup, or initializing logic.

---

### 🔄 Full Lifecycle Flow

1. **Instantiation**  
   - Spring creates an object of the bean.

2. **Populate Properties (Dependency Injection)**  
   - Spring injects dependencies into the bean using `@Autowired`, setters, or constructors.

3. **`BeanNameAware` & `BeanFactoryAware` callbacks (optional)**  
   - Set the bean name and factory if needed.

4. **`ApplicationContextAware` callback (optional)**  
   - Spring injects the context.

5. **Pre-initialization (`BeanPostProcessor#postProcessBeforeInitialization`)**

6. **Initialization**
   - Custom logic using `@PostConstruct` or implementing `InitializingBean#afterPropertiesSet()`.

7. **Post-initialization (`BeanPostProcessor#postProcessAfterInitialization`)**

8. **Bean is Ready for Use**

9. **Destruction**
   - Triggered when application context is closed using `@PreDestroy` or `DisposableBean#destroy()`.

---

### 🧪 Example with Annotations

```java
@Component
public class MyBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean is initialized");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Bean is being destroyed");
    }
}
```

---

## ⚙️ Spring Configuration

Spring configuration defines how Spring manages objects (beans) and how it wires dependencies together. There are **three primary ways** to configure Spring applications:

---

### 🛠️ 1. XML-Based Configuration (Legacy)

Used heavily before Spring 3. Now less common due to annotations and Spring Boot.

```xml
<!-- applicationContext.xml -->
<beans xmlns="http://www.springframework.org/schema/beans"
       ...>

    <bean id="myService" class="com.example.MyService"/>
    
</beans>
```
 load the file into context 
```java
ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
```
### 🧩 2. Java-Based Configuration (Modern)

Use @Configuration classes and define beans with @Bean.
```java
@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```

load the config
```java
    AnnotationConfigApplicationContext context = 
    new AnnotationConfigApplicationContext(AppConfig.class);
```
### 🪄 3. Annotation-Based Configuration (Most Popular)

used in Springboot projects
``` java
@Component
public class MyService {
    ...
}

@Service
public class MyBusinessService {
    @Autowired
    private MyService myService;
}
```


---

## 📦 Spring Container

The **Spring Container** is the core of the Spring Framework. It is responsible for:

- Creating objects (beans)
- Managing their entire lifecycle
- Injecting dependencies
- Configuring objects via metadata (XML, annotations, Java config)

It uses **Dependency Injection (DI)** to manage the relationships between components.

---

### 🧠 Responsibilities of the Spring Container

| Responsibility         | Description                                                    |
|------------------------|----------------------------------------------------------------|
| 🧬 Instantiates Beans   | Creates objects as needed                                      |
| 🔗 Injects Dependencies | Injects required dependencies using constructor/setter/autowire |
| 🔁 Manages Lifecycle    | Handles init, post-init, and destroy phases                    |
| 🔍 Configures Beans     | Using metadata (annotations/XML/config classes)                |
| 📥 Provides Context     | Gives access to beans using ApplicationContext                 |

---

### 🧰 Types of Spring Containers

| Container Type         | Interface Used              | Description                                         |
|------------------------|-----------------------------|-----------------------------------------------------|
| **BeanFactory**        | `org.springframework.beans.factory.BeanFactory` | Basic container, lazy initialization              |
| **ApplicationContext** | `org.springframework.context.ApplicationContext` | Full-featured container, preferred in most cases |

---

### 🔄 BeanFactory vs ApplicationContext

| Feature                 | BeanFactory                       | ApplicationContext                   |
|------------------------|------------------------------------|--------------------------------------|
| Initialization         | Lazy (on demand)                   | Eager (on startup)                   |
| Internationalization   | ❌ Not supported                   | ✅ Supported                          |
| Event Handling         | ❌ Not supported                   | ✅ Supported                          |
| Bean Post Processors   | ❌ Manual registration needed      | ✅ Automatically handled              |
| Web Applications       | ❌ Not suitable                    | ✅ Preferred                          |

---

### 🛠 Creating a Container (Example)

**Using `ApplicationContext`:**
```java
ApplicationContext context =
    new AnnotationConfigApplicationContext(AppConfig.class);

MyService service = context.getBean(MyService.class);
```
