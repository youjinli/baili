package com.chenbaili.practice.dubbo;

public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
