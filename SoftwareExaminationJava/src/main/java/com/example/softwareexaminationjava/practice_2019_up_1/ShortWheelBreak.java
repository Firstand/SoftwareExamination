package com.example.softwareexaminationjava.practice_2019_up_1;

/**
 * @author zhangyu18
 * @since 2022-02-27 20:52
 */
public class ShortWheelBreak implements BrakeBehavior{
    @Override
    public void stop() {
        System.out.println("模拟短轮胎刹车痕迹！");
    }
}
