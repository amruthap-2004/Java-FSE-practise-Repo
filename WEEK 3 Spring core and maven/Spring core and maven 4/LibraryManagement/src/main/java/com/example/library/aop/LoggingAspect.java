package com.example.library.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.library.service.*.*(..))")
    public void logBefore() {
        System.out.println("A method in BookService is about to be called");
    }
} 