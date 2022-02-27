package com.example.softwareexaminationjava.practice_2019_up_1;

/**
 * @author zhangyu18
 * @since 2022-02-27 20:55
 */
abstract class Car {
    /**
     * (2)
     */
    protected BrakeBehavior wheel;

    public void brake(){
        //(3)
        wheel.stop();
    }
}
