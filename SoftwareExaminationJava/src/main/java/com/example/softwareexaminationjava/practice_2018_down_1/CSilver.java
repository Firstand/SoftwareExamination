package com.example.softwareexaminationjava.practice_2018_down_1;

/**
 * 银卡会员
 *
 * @author zhangyu18
 * @since 2022-02-27 23:20
 */
public class CSilver extends CState {
    @Override
    public double travel(int miles, FrequentFlyer frequentFlyer) {
        if (frequentFlyer.flyMiles <= 25000) {
            frequentFlyer.setState(new CBasic());
        }
        if (frequentFlyer.flyMiles > 50000) {
            frequentFlyer.setState(new CGold());
        }
        System.out.println("银卡会员");
        //累计里程
        return (miles + 0.25 * miles);
    }
}
