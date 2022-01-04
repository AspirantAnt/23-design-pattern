package org.example.design.behavioral.responsibility;

/**
 *  责任链模式是一种行为设计模式, 允许你将请求沿着处理者链进行发送. 收到请求后, 每个处理者均可对请求进行处理, 或将其传递给链上的下个处理者.
 *  详见图片：./picture/chain_of_responsibility/chain-of-responsibility.png
 *
 *  在实际场景中, 财务审批就是一个责任链模式. 假设某个员工需要报销一笔费用, 审核者可以分为：
 *      Manager：直属领导只能审核1000元以下的报销；
 *      Director：主任只能审核2000元以下的报销；
 *      CEO：可以审核任意额度.
 *
 *  用责任链模式设计此报销流程时, 每个审核者只关心自己责任范围内的请求, 并且处理它. 对于超出自己责任范围的, 扔给下一个审核者处理, 这样, 将来继续添加审核者的时候, 不用改动现有逻辑.
 *
 *  适用场景：
 *      1、当程序需要使用不同方式处理不同种类请求, 而且请求类型和顺序预先未知时, 可以使用责任链模式：该模式能将多个处理者连接成一条链. 接收到请求后, 它会 “询问” 每个处理者是否能够对其进行处理. 这样所有处理者都有机会来处理请求.
 *      2、当必须按顺序执行多个处理者时, 可以使用该模式：无论你以何种顺序将处理者连接成一条链, 所有请求都会严格按照顺序通过链上的处理者.
 *
 *  实现：责任链模式有较多实现变体, 大体可以分成两种：
 *      1、分离[separate包]：将处理责任链的逻辑单独抽离出来, 内部维护一个队列或优先级队列, 然后通过调用处理函数进行循环队列进行处理
 *      2、连接[connect包]：将每一个处理器handler内部都维护一个下一个handler的变量, 只需调用最外层的handler即可在内部不断判断, 如果通过则返回, 不通过则用变量的handler处理, 依次调用
 *
 * Author: GL
 * Date: 2021-12-31
 */
public class Explain {
}
