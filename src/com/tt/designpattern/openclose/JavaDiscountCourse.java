package com.tt.designpattern.openclose;

public class JavaDiscountCourse extends JavaCourse {
    //默认实现父类的构造器
    public JavaDiscountCourse(Integer id, String name, Double price) {
        //子类构造器调用的父类构造器，即对父类的属性进行了赋值操作
        super(id, name, price);
    }

    public Double getOriginalPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
