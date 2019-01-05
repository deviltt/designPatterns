package com.tt.designpattern.dependenceinversion;

public class PythonCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("learn python course");
    }
}
