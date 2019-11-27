package com.csdeng.springbootinterceptor.interceptor;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    //方式1：所有使用了AutoIdempotent的地方，全部拦截
    //@Pointcut(value = "@annotation(com.csdeng.springbootinterceptor.annotation.AutoIdempotent)")
    //方式2：按规则拦截
    @Pointcut("execution(* com.csdeng.springbootinterceptor.service.*.*(..))")
    public void annotationPointcut(){

    }

    @Around("annotationPointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();
        System.out.println("pointcut方法名：" + methodName);
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            return null;
        }
    }
}
