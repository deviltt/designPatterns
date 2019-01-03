package com.tt.designpattern.openclose;

public class Test {
    public static void main(String[] args) {
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(23, "从入门到精通java", 326d);
        //javaCourse.getOriginalCourse();   不可以调用接口中没有定义的方法

        System.out.println("课程ID:" + javaDiscountCourse.getId() + " 课程名称:" + javaDiscountCourse.getName() + " 课程原价:" + javaDiscountCourse.getOriginalPrice() + " 课程折后价格:" + javaDiscountCourse.getPrice());
    }
}
