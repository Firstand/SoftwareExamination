package com.example.softwareexaminationjava.practice_2018_down_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author zhangyu18
 * @since 2022-02-27 23:11
 */
public class FrequentFlyer {
    CState state;
    double flyMiles;

    public FrequentFlyer() {
        state = new CNoCustomer();
        flyMiles = 0;
    }

    public FrequentFlyer(CState stateNew) {
        state = stateNew;
        flyMiles = 0;
    }

    public void setState(CState state) {
        this.state = state;
    }

    public void travel(int miles) {
        double bonusMiles = state.travel(miles, this);
        flyMiles = flyMiles + bonusMiles;
        System.out.println("当前累计里程数：" + flyMiles);
    }

    public static void main(String[] args) {
        FrequentFlyer frequentFlyer = new FrequentFlyer(new CBasic());
        Random random = new Random(1);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(50001);
            sum += number;
            frequentFlyer.travel(number);
            System.out.println("此次里程：" + number + "\n");
        }
        System.out.println("合计：" + sum);
    }
}
