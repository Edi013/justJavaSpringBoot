package org.test.ch1_6.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(org.test.ch1_6.ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("🔐 SecurityAspect: Before method");

        Object result = joinPoint.proceed();

        logger.info("🔐 SecurityAspect: After method, returned = " + result);

        return result;
    }
}
