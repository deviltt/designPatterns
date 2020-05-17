package com.tt.designpattern.designPattern.creational.abstractfactorymethod;

/**
 * 针对产品族
 */
public abstract class CourseFactory {
    //视频和手记
    public abstract Video videoFactory();
    public abstract Article articleFactory();
}
