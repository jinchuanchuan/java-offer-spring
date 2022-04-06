package com.jcc.framework.aop;

/**
 * @ClassName: ProxyDemo.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 3:25 下午:00
 * @Description: TODO
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Payment pay = new AliPay(new RealPayment());
        pay.pay();
    }
}
