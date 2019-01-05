package com.tt.designpattern.dependenceinversion;

public class Tom {
    ICourse iCourse;
//    public Tom(ICourse iCourse){
//        this.iCourse = iCourse;
//    }
    public void setiCourse(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void tomCourse(){
        iCourse.studyCourse();
    }
}
