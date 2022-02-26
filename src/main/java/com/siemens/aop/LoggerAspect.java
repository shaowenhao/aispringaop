package com.siemens.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>Create Time: 2022年02月25日 15:46          </p>
 **/

// @Aspect 表示该类是切面类
    // @Component 将该类的对象注入到IOC容器

    // 再交给sping框架的处理的时候 CalImpl 也加@Component
@Aspect
@Component
public class LoggerAspect {

    @Before(value = "execution (public int com.siemens.impl.CalImpl.*(..))")
    public void before(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        System.out.println(method+"method: params:"+ Arrays.toString(joinPoint.getArgs()));
    }


    @After("execution (public int com.siemens.impl.CalImpl.*(..))")
    public void after(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        System.out.println(method+"method done execution");
    }

    @AfterReturning(value = "execution (public int com.siemens.impl.CalImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String method = joinPoint.getSignature().getName();
        System.out.println(method+"result was:"+ result);
    }

    @AfterThrowing(value = "execution (public int com.siemens.impl.CalImpl.*(..))",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception){
        String method = joinPoint.getSignature().getName();
        System.out.println(method+"Exception was:"+ exception);
    }
}
