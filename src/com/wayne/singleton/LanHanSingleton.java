package com.wayne.singleton;

/**
 * @program: singleton
 * @description: 懒汉式单例模式
 * @author: Mr.Wang
 * @create: 2021-03-29 19:31
 **/
public class LanHanSingleton {
    /**
     * 说明：先不创建实例，当第一次被调用时候再创建，所以被称为懒汉模式
     * 优点：延迟了实例化，如果不需要使用该类，则不会被实例化，节约了系统资源
     * 缺点：线程不安全。多线程环境下，如果多个线程同时进入了if(instance == null)，
     * 若此时还未实例化，也就是uniqueInstance == null，那么就会有多个线程执行 uniqueInstance = new Singleton();
     * 就会实例化多个实例
     */
    private static LanHanSingleton instance;

    private LanHanSingleton(){
    }

    public static LanHanSingleton getInstance(){
        if(instance == null){
            instance = new LanHanSingleton();
        }
        return instance;
    }
}
