# What is Design Pattern ?
Design pattern is not a specific piece of code or an algorithm, but a general concept  for solving a problem. 

## History
Design patterns were first formally described by four software engineers, Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides, in their book "Design Patterns: Elements of Reusable Object-Oriented Software" published in 1994. The book presented 23 design patterns that they had observed in real-world software design and development, and organized these patterns into categories based on their functionality.

![Gang of Four](https://github.com/atquil/DesignPattern/blob/main/Gang%20of%20Four.png)
## Why to use Design Pattern?
Design patterns provide a way to encapsulate the best practices and experience of the software development community, and are seen as an essential tool for improving software design and development efficiency.

Here are some reasons why design patterns are widely used in software development:

1. **Reusability**: Design patterns provide a standardized and reusable solution to common software design problems, reducing the time and effort required to design and develop software systems. Thus implementing **DRY(Do not repeat yourself) principle**
2. **Improved Quality**: Design patterns help to improve the quality of the code by providing a well-understood and tested approach to solving design problems, reducing the likelihood of introducing bugs or other issues. 
3. **Increased Flexibility**: Design patterns allow for the creation of flexible and modular software systems, making it easier to modify or extend the system in the future. 
4. **Improved Communication**: Design patterns provide a common vocabulary and understanding for software developers, making it easier for team members to communicate and collaborate on software design and development. 
5. **Better Maintenance**: Design patterns provide a structured approach to software design and development, making it easier to maintain and update the software system over time. 
6. **Faster Development**: Design patterns allow developers to work more efficiently and effectively, reducing the time required to develop software systems and increasing productivity.

Overall, design patterns provide a powerful tool for software developers to create high-quality, flexible, and maintainable software systems. By using design patterns, developers can reduce the time and effort required to design and develop software systems, improve the quality of the code, and increase the efficiency and productivity of their work.

## Criticism of Design Patterns

While design patterns are widely used and recognized as a valuable tool in software development, there are some criticisms of the use of design patterns:

1. **Overreliance**: Some developers may become too dependent on design patterns, using them as a crutch instead of thinking critically about the design problems they are trying to solve. This can lead to suboptimal solutions and decreased creativity in software design.
2. **Inflexibility**: Design patterns are not a one-size-fits-all solution and may not be the best approach for every situation. Developers may become too rigid in their use of design patterns and not consider alternative solutions that may be better suited for a particular problem. 
3. **Overcomplexity**: Some design patterns can be complex and difficult to understand, especially for developers who are new to software development. This can lead to difficulty in maintaining and updating the software system, as well as reduced productivity. 
4. **Lack of Context**: Design patterns are meant to be used as a general solution to common design problems, but they may not be appropriate for every situation. Developers must consider the context of their project and determine whether a design pattern is the best approach or if a custom solution is more appropriate. 
5. **Limited Scope**: Design patterns are meant to address specific design problems and may not be appropriate for other types of problems. Developers must be careful to choose the right design pattern for the right problem, and not try to use a design pattern to solve a problem it was not intended for.

Despite these criticisms, design patterns are still widely used and recognized as a valuable tool in software development. It is important for developers to use design patterns thoughtfully and carefully, and to always consider the context of their project when choosing the appropriate design pattern.

## Classification of Design Pattern
Design patterns can be classified into several categories based on their purpose and application:

1. **Creational Design Patterns**: These patterns deal with the process of object creation. Examples include the Singleton, Factory Method, and Abstract Factory patterns.
2. **Structural Design Patterns**: These patterns deal with the composition of classes and objects. Examples include the Adapter, Bridge, and Decorator patterns.
3. **Behavioral Design Patterns**: These patterns deal with the communication between objects. Examples include the Observer, Command, and State patterns.
4. **Concurrency Design Patterns**: These patterns deal with the synchronization of threads. Examples include the Producer-Consumer, Monitor Object, and Guarded Suspension patterns.
5. **Architectural Design Patterns**: These patterns deal with the overall structure of software systems. Examples include the Model-View-Controller (MVC), Model-View-ViewModel (MVVM), and Model-View-Presenter (MVP) patterns.

Each category of design pattern addresses a different aspect of software design, and developers can use these patterns in combination to build robust and flexible software systems. By understanding the different categories of design patterns and how they can be applied, developers can make informed decisions about how to structure their software systems and ensure that they are maintainable, scalable, and performant.


# Examples for different Design Pattern


## Creational Design Pattern

| Pattern Name           | Applicability  | Language | Example  | What?                                                                                           |
|------------------------|----------------|----------|----------|-------------------------------------------------------------------------------------------------|
| Singleton / Creational |                | Java     | [Link]() | Restricts object creation for a class to **only one instance**                                  |
| Factory Method         | Action Mapping | Java     | [Link]() | Creates objects with a common interface and let's a class defer instantiation to subclass       |
| Builder                | Unit Tests     | Java     | [Link]() | A step-by-step pattern for creating complex objects, separating construction and representation |
| Prototype              | Cloning        | Java     | [Link]() | Supports the copying of existing objects without code becoming dependent on classes             |



## Structural Design Pattern

| Pattern Name | Applicability | Language | Example  | What?                                                                                                                   |
|--------------|---------------|----------|----------|-------------------------------------------------------------------------------------------------------------------------|
| Facade       |               | Java     | [Link]() | Defines a high-level interface to simplify the use of a large body of code                                              |
| Adapter      |               | Java     | [Link]() | How to change or adapt an interface to that of another existing class to allow incompatible interfaces to work together |
| Decorator    |               | Java     | [Link]() | Dynamically extends (adds or overrides) functionality                                                                   |



## Behavioral Design Pattern

| Pattern Name            | Applicability                | Language | Example  | What?                                                                  |
|-------------------------|------------------------------|----------|----------|------------------------------------------------------------------------|
| Strategy                |                              | Java     | [Link]() | Encapsulate an algorithm inside a class                                |
| Observer                | Event Listner                | Java     | [Link]() | Defines how to notify objects of changes to other object(s)            |
| State                   |                              | Java     | [Link]() | How to alter the behaviour of an object when it's state changes        |
| Chain of Responsibility | Exception Hhandling, Logging | Java     | [Link]() | A method for commands to be delegated to a chain of processing objects |


# The Anti-Pattern

An anti-pattern is a common response to a recurring problem that is usually ineffective and risks being highly counterproductive. Anti-patterns are typically characterized by quick-fix solutions that ignore underlying issues and create new problems instead of solving the original problem.

Using anti-patterns can lead to poor software design, increased maintenance costs, and reduced software quality. It is important to be aware of anti-patterns and to avoid them in software development in order to build high-quality, maintainable software systems.

There are many different types of anti-patterns in software development, but some of the most common include:

1. **Copy-and-Paste Programming**: Copying code from one part of a system to another without understanding the implications of the code or making necessary modifications. 
2. **Tight Coupling**: Over-reliance on connections between components, making it difficult to modify or reuse individual components. 
3. **Premature Optimization**: Focusing on optimizing performance before understanding the requirements and constraints of the system. 
4. **Golden Hammer**: Assuming that a single tool or solution can solve all problems, ignoring other potential solutions. 
5. **Shotgun Surgery**: Making many changes to many parts of a system in response to a single problem, leading to increased complexity and decreased maintainability. 
6. **Spaghetti Code**: A complex, difficult-to-read codebase with poor structure and too many dependencies. 
7. **God Object**: A class or object that tries to do too many things and becomes too complex to maintain. 
8. **Magic Numbers**: Hard-coded values that are difficult to understand or modify without deep understanding of the code. 
9. **cargo cult programming**: Copying code or programming practices without understanding why they work or what their limitations are.

These are just a few examples of anti-patterns in software development. It is important to be aware of these anti-patterns and to avoid them in order to build high-quality, maintainable software systems.
