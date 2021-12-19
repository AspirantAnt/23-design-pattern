package org.example.design.structural.facade;

/**
 *  外观模式是一种结构型设计模式，能为程序库、框架或其他复杂类提供一个简单的接口。
 *
 *  外观模式主要目的是隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 *
 *  最常见的就是JavaEE的MVC架构：当controller层对外提供订单接口，当收到一个订单请求后，后续会有大量复杂的业务操作，这就是外观模式
 *
 *  例如：以注册公司为例，假设注册公司需要四步：
 *      1、向工商局申请公司营业执照, 获得工商ID；
 *      2、通过工商ID在银行开设账户，获得账户ID；
 *      3、通过账户ID在税务局开设纳税号，获得纳税ID；
 *      4、公司注册成功；
 *
 *  那么光工商局/银行/税务局就需要三个接口和三个实现类，同时用户在使用上需要分别创建这三个类并依次调用三个函数，但是此时我们可以提供一个外观模型接口和外观实现类，
 *  里面只有一个注册公司函数直接实现了上述的四个步骤，那么对用户而言只需要调用外观模型的一个类的一个函数即可解决注册公司的需求，对用户而言是黑盒，无需关心内部处理逻辑！
 *
 *  结构：
 *
 *     银行接口         公司接口            工商接口           纳税机关接口               外观类接口 -> 接口提供对外函数
 *    ┌──────┐       ┌─────────┐       ┌──────────┐        ┌───────┐                   ┌────────┐
 *    │ Bank │       │ Company │       │ Industry │        │ Taxes │                   │ Facade │
 *    └──────┘       └─────────┘       └──────────┘        └───────┘                   └────────┘
 *        ▲              ▲                  ▲                  ▲                            ▲
 *        │              │                  │                  │                            │
 *  ┌────────────┐ ┌───────────────┐ ┌────────────────┐ ┌─────────────┐              ┌──────────────┐
 *  │NanShanBank │ │NanShanCompany │ │NanShanIndustry │ │NanShanTaxes │              │NanShanFacade │ -> 内部实现：registerCompany函数提供注册公司的简化操作
 *  └────────────┘ └───────────────┘ └────────────────┘ └─────────────┘              └──────────────┘
 *
 *  详见代码
 *
 * Author: GL
 * Date: 2021-10-30
 */
public class FacadeTest {
    public static void main(String[] args) {
        System.out.println(new NanShanFacade().registerCompany("腾讯"));
    }
}
