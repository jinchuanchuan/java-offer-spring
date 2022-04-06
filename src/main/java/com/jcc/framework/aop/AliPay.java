package com.jcc.framework.aop;

/**
 * @ClassName: AliPay.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 3:23 下午:00
 * @Description: TODO
 */
public class AliPay implements Payment {
    private Payment payment;

    public AliPay(Payment payment) {
        this.payment = payment;
    }

    public void beforePay(){
        System.out.println("从招行取款；");
    }

    @Override
    public void pay() {
        beforePay();
        payment.pay();
        afterPay();
    }

    public void afterPay(){
        System.out.println("付款给技术网站！");
    }
}
