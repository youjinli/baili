package com.chenbaili.practice;

public class SingleTon {

    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {
    }

    /**
     * 饿汉模式
     *
     * @return
     */
    public SingleTon getInstanceHungry() {
        return singleTon;
    }

    /**
     * 懒汉模式
     *
     * @return
     */
    public SingleTon getInstancLazy() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    /**
     * 加锁模式
     *
     * @return
     */
    public SingleTon getInstancSync() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

}
