package com.tt.designpattern.designPattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        JavaVideoFactory javaVideoFactory=new JavaVideoFactory();

        Video javaVideo=javaVideoFactory.getVideo();

        javaVideo.produce();
    }
}
