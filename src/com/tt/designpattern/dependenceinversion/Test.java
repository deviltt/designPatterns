package com.tt.designpattern.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        //这种方法的弊端是在学习不同的课程时，每一次都要new一个Tom对象，这样对系统的开销较大
//        Tom tom = new Tom(new JavaCourse());
//        tom.tomCourse();

        Tom tom = new Tom();
        tom.setiCourse(new JavaCourse());
        tom.tomCourse();

        tom.setiCourse(new PythonCourse());
        tom.tomCourse();
    }
}
