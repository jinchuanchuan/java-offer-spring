package com.jcc.framework.aop;

import org.springframework.context.annotation.Primary;

/**
 * @ClassName: RealPayment.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 3:22 下午:00
 * @Description: TODO
 */
@Primary
public class RealPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("只关心支付！");
    }
}
