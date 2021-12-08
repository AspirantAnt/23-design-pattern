## 23-design-pattern介绍：
    
    此项目详细记载23种设计模式的代码实现，力求用最少的代码和语言让大众理解设计模式的奇妙之处！
            
    除了23种设计模式以外，此项目还新增other设计模式，例如同步回调/异步回调(callback)等javaEE中常用的设计模式！
            
    此外项目还将设计模式的六大原则收录其中！ 
   
    每个package包中都有对每一个设计模式的详细介绍和本人的理解，同时每个package下都有针对此设计模式而单独运行的Test样例类，开箱即用！
            
## 设计模式介绍(详细解释见design包)：

    设计模式，即Design Patterns，是指在软件设计中，被反复使用的一种代码设计经验。使用设计模式的目的是为了可重用代码，提高代码的可扩展性和可维护性。
        
        目前总共有 23 种设计模式。这些模式可以分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural Patterns）、行为型模式（Behavioral Patterns）。
        
        不过此项目
        
            一、创建型模式关注点是如何创建对象，其核心思想是要把对象的创建和使用相分离，这样使得两者能相对独立地变换。
        
            创建型模式包括：
            
            工厂方法：Factory
            抽象工厂：Abstract
            建造者：Builder
            原型：Prototype
            单例：Singleton
            
            二、结构型模式主要涉及如何组合各种对象以便获得更好、更灵活的结构。虽然面向对象的继承机制提供了最基本的子类扩展父类的功能，但结构型模式不仅仅简单地使用继承，而更多地通过组合与运行期的动态组合来实现更灵活的功能。
              
              结构型模式有：
              
              适配器: Adapter
              桥接: Bridge
              组合: Composite
              装饰器: Decorator
              外观: Facade
              享元: Cache
              代理: Proxy
              
            三、行为型模式主要涉及算法和对象间的职责分配。通过使用对象组合，行为型模式可以描述一组对象应该如何协作来完成一个整体任务。
              
              行为型模式有：
              
              责任链: Responsibility
              命令: Command
              监听器: Listener
              迭代器: Iterator
              中介: Mediator
              备忘录: Memento
              观察者: Observer
              状态: State
              策略: Strategy
              模板方法: Template
              访问者: Visitor
              

## 设计模式六大原则介绍(详细解释见principle包)：             
            
            单一职责原则（类和方法，接口）
            开闭原则（扩展开放，修改关闭）
            里氏替换原则（基类和子类之间的关系）
            依赖倒置原则（依赖抽象接口，而不是具体对象）
            接口隔离原则（接口按照功能细分）
            迪米特法则（类与类之间的亲疏关系）  
    
### 项目结构
![github](https://raw.githubusercontent.com/gl0726/-23-design-pattern/master/picture/struct.jpg "github")
    
            


