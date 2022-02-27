package com.example.softwareexaminationjava.practice_2018_down_1;

/**
 * @author zhangyu18
 * @since 2022-02-27 23:06
 */
abstract class CState {
    /**
     * 里程数
     */
    public int flyMiles;

    /**
     * 会员调整
     * @param miles 里程
     * @param frequentFlyer 里程数计算
     * @return 里程数
     */
    public abstract double travel(int miles, FrequentFlyer frequentFlyer);
}
