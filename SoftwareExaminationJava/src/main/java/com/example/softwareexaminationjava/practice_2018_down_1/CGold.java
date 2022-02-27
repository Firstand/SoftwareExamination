package com.example.softwareexaminationjava.practice_2018_down_1;

/**
 * 金卡会员
 *
 * @author zhangyu18
 * @since 2022-02-27 23:19
 */
public class CGold extends CState {
    @Override
    public double travel(int miles, FrequentFlyer frequentFlyer) {
        if (frequentFlyer.flyMiles >= 25000 && frequentFlyer.flyMiles < 50000) {
            frequentFlyer.setState(new CSilver());
        }
        if (frequentFlyer.flyMiles < 25000) {
            frequentFlyer.setState(new CBasic());
        }
        System.out.println("金卡会员");
        //累计里程
        return (miles + 0.5 * miles);
    }
}
