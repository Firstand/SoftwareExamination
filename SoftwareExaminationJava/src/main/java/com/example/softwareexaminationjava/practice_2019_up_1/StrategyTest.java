package com.example.softwareexaminationjava.practice_2019_up_1;

/**
 * @author zhangyu18
 * @since 2022-02-27 20:59
 */
public class StrategyTest {

    public static void main(String[] args) {
        BrakeBehavior brake = new ShortWheelBreak();
        ShortWheelCar car = new ShortWheelCar(brake);
        //(5)
        car.brake();
    }
}
