package org.example.design.behavioral.mediator;

/**
 *  中介者模式是一种行为设计模式， 能让你减少对象之间混乱无序的依赖关系。 该模式会限制对象之间的直接交互， 迫使它们通过一个中介者对象进行合作。
 *  如图：./picture/mediator/mediator.png
 *
 *  常见应用：spring的IOC容器的思想就是简化版中介模式！ 在以往没有spring的时候，我们通常会在控制层引用大量的service，同时各个类中都有重复的引用
 *          springIOC的出现，让所有需要重复使用的类统统注册进IOC容器中，由IOC统一分发给需要的类！不过IOC容器只是负责注册和引用分发，并不负责业务逻辑的处理，所以是简化版的中介模式
 *
 *  优点： 1、降低了类的复杂度，将一对多转化成了一对一。
 *        2、各个类之间的解耦。
 *  缺点：中介者会庞大，变得复杂难以维护。
 *
 *  使用场景：系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。
 *
 *  中介者模式包含如下角色：
 *      Mediator: 抽象中介者
 *      ConcreteMediator: 具体中介者
 *      Colleague: 抽象同事类
 *      ConcreteColleague: 具体同事类
 *
 *  类图: ./picture/mediator/mediator2.jpeg
 *
 *  本案例提供一种数据库场景：
 *
 *      我们来实现一个简化版的案例，有三种数据库 Mysql、Redis、Elasticsearch，其中的 Mysql 作为主数据库，当增加一条数据时需要同步到另外两个数据库中；
 *
 *      Redis作为缓存数据库，当增加一条数据时不需要同步到另外两个个数据库；
 *
 *      Elasticsearch 作为大数据查询数据库，有一个统计功能，当增加一条数据时只需要同步到 Mysql
 *
 *  那么先来看不使用中介模式的代码: 参考usually包
 *  使用中介模式的代码：参考complete包
 *  最后使用中介模式 + 命令模式: 参考perfect包
 *
 * Author: GL
 * Date: 2021-11-10
 */
public class Test {
}
