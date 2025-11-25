package org.test.ch1_6.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.test.ch1_6.services.ProductService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[LOG BEFORE] Method called: " + joinPoint.getSignature());
    }

    @AfterReturning("execution(* org.test.ch1_6.services.ProductService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[LOG AFTER] Method finished: " + joinPoint.getSignature());
    }
}
