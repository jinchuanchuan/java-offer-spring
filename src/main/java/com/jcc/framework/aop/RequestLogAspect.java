package com.jcc.framework.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * @ClassName: RequestLogAspect.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 2:57 下午:00
 * @Description: TODO
 */
@Component
@Aspect
public class RequestLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(RequestLogAspect.class);

    @Pointcut("execution(public * com.jcc.framework.web..*.*(..))")
    public void webLog() {

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Map<String, String[]> parameterMap = request.getParameterMap();
        String[] names = parameterMap.get("name");
        logger.info("param : " +  Arrays.toString(names));
        //
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("IP : " + request.getRemoteAddr());
    }

    @AfterReturning(returning = "obj", pointcut = "webLog()")
    public void doAfterReturning(Object obj) {
        logger.info("response : " + obj);
    }
}
