package com.example.softwareexaminationjava.practice_2018_down_1;

/**
 * 非会员
 *
 * @author zhangyu18
 * @since 2022-02-27 23:09
 */
public class CNoCustomer extends CState{
    @Override
    public double travel(int miles, FrequentFlyer frequentFlyer) {
        System.out.println("Your travel will not account for points");
        return miles;
    }
}
