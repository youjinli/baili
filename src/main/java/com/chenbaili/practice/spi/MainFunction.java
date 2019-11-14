package com.chenbaili.practice.spi;

import org.junit.Test;

import java.util.ServiceLoader;


public class MainFunction {
    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }


}
