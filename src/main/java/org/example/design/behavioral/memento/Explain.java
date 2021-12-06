package org.example.design.behavioral.memento;

/**
 * 备忘录模式：备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化，存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态
 *
 *  角色：
 *      1、Memento[备忘录]-将需要保存的对象的内部状态存储起来
 *      2、Originator[发起人接口，说白了就是需要保存状态的类继承此接口]-需要子类实现两个接口：1、创建备忘录 2、根据备忘录恢复
 *      3、Caretaker[负责人接口]-负责保存备忘录对象, 可以根据下标返回对应的备忘录
 *
 *  设计关键:
 *      1、备忘录模式是将发起人某个时间节点的状态进行一个快照！而不是将发起人的引用存储进集合！这点尤为重要！所以我们需要让发起人实现Originator接口，由此让不同的发起人内部实现自己的构建快照的逻辑！！
 *      2、负责人接口是为了做成通用性的接口，如果让业务的类自己管理集合，自己写相关函数则不符合类的设计原则，所以需要单独抽离出去进行封装！
 *      3、备忘录类是和负责人接口共同做成通用性而设计！此时就可以不用和业务类绑定，任何业务类需要使用备忘录都可以直接拿来继承使用即可！
 *      4、我们在开发中经常会将发起人的引用单独存储在集合中，但是这种方式并不是快照，这种方式下如果发起人的属性发生改变，那么集合中的元素的属性也会发成改变，
 *          所以我们需要让发起人实现Originator接口，来让不同的发起人实现自己的构建快照的函数！！
 *
 *  注意：
 *      1、备忘录模式中最关键的类是保存各个备忘录的[Caretaker]备忘录负责类！那么此类的特点是要依附于一个使用发送者的一个类！如[simple包]下的Caretaker只在main函数中出现过，这在业务中是不可能的
 *
 *      2、按照命令模式举例： 我们分为: 请求者A、服务器B、命令类1、命令类2; 那么在这个结构中:命令类1,2 就是需要备份的需要实现的Originator子类！ 而请求者A内部则持有Caretaker[备忘录负责人], 参考[complete包]
 *
 *  常见使用区别：
 *
 *      1、标准方式：采用集合list列表作为Caretaker负责人接口中存储备忘录对象集合，可以根据下标直接获取对应的快照类[simple包]
 *
 *      2、结合业务支持撤回操作：采用队列Queue的方式作为Caretaker负责人接口中存储备忘录对象集合，可以支持最近一次撤回和多次撤回，不过撤回后状态只保留到撤回状态![complete包]
 *
 * Author: GL
 * Date: 2021-11-15
 */
public class Explain {
}
