package com.example.softwareexaminationjava.practice_2019_up_1;

/**
 * @author zhangyu18
 * @since 2022-02-27 20:39
 */
public class LongWheelBreak implements BrakeBehavior {
    @Override
    public void stop() {
        System.out.println("模拟长轮胎刹车痕迹！");
    }
}
