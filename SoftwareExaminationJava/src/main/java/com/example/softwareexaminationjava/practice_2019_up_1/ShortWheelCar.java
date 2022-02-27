package com.example.softwareexaminationjava.practice_2019_up_1;

/**
 * @author zhangyu18
 * @since 2022-02-27 20:57
 */
public class ShortWheelCar extends Car{
    public ShortWheelCar(BrakeBehavior behavior){
        //(4)
        wheel = behavior;
    }
}
