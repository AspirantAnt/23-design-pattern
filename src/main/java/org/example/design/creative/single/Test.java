package org.example.design.creative.single;

/**
 *  单例模式，也是最常用的设计模式，单例是一种创建型设计模式， 让你能够保证一个类只有一个实例， 并提供一个访问该实例的全局节点。
 *
 *  常见设计方式：
 *      1、饿汉式：不推荐
 *          -特点：安全，高效，非懒加载，可以通过反射破坏
 *          饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
 *          由于使用了static关键字，保证了在引用这个变量时只执行一次，所以保证了JVM层面的线程安全
 *          -参考：LazySingleton类
 *
 *      2、懒汉式：不推荐
 *          -特点：不安全，不高效，懒加载，可以通过反射破坏
 *          懒汉式是典型的时间换空间,就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间
 *          由于懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断。那么有没有更好的方式实现呢？
 *          -参考：EagerSingleton类
 *
 *      3、双重检查加锁：此方式并不推荐，因为需要强制指定JVM指令顺序，所以没有特别的需要，不要使用。
 *
 *      4、静态内部类实现：比较完美
 *          -特点：安全, 高效, 且懒加载，可以通过反射破坏
 *          JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载，从而保证了懒加载！
 *          内部类变量由于使用了static关键字，保证了在引用这个变量时只执行一次，所以保证了JVM层面的线程安全
 *          -参考：StaticSingleton
 *
 *      5、枚举实现：完美
 *          -特点：安全, 高效, 但非懒加载, 不可以通过反射破坏！
 *          将需要单例的业务类放到枚举类里，枚举类也完全可以像其他类那样定义自己的字段、方法！
 *          这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 *          这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 *          -参考Singleton
 *
 *      总结：那我们什么时候应该用Singleton呢？实际上，很多程序，尤其是Web程序，大部分服务类都应该被视作Singleton，如果全部按Singleton的写法写，会非常麻烦，
 *           所以，通常是通过约定让框架（例如Spring）来实例化这些类，保证只有一个实例，调用方自觉通过框架获取实例而不是new操作符
 *      例如：
 *           @Component // spring中默认单例
 *           public class MyService {
 *               ...
 *           }
 *
 *
 * Author: GL
 * Date: 2021-11-24
 */
public class Test {
    public static void main(String[] args) {
        final Singleton uniqueInstance = Singleton.uniqueInstance;
        final Singleton uniqueInstance2 = Singleton.uniqueInstance;
        uniqueInstance.singletonOperation();
        uniqueInstance2.singletonOperation();
        System.out.println(uniqueInstance == uniqueInstance2);
    }
}

