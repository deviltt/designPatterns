package com.tt.designpattern.designPattern.creational.abstractfactorymethod;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Video videoFactory() {
        return new JavaVideo();
    }

    @Override
    public Article articleFactory() {
        return new JavaArticle();
    }
}
