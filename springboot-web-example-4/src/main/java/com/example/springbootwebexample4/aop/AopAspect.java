package com.example.springbootwebexample4.aop;

import com.example.springbootwebexample4.annotation.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect     // 使之成为切面类
@Component  // @Component 把切面类加入 IoC 容器中
public class AopAspect {
    // 定义切入点，切入点为有注解 @Log 的所有函数，通过 @Pointcut 声明使用切入点表达式
    @Pointcut("@annotation(com.example.springbootwebexample4.annotation.Log)")
    public void LogAspect() {
    }

    // 在连接点之前执行的通知
    @Before("LogAspect()")
    public void doBeforeLog() {
        System.out.println("执行 controller 前置通知");
    }

    // 使用环绕通知，注意该方法需要返回值
    @Around("LogAspect()")
    public Object doAroundLog(ProceedingJoinPoint pjp) throws Throwable {
        try {
            System.out.println("开始执行 controller 环绕通知");
            Object obj = pjp.proceed();
            System.out.println("结束执行 controller 环绕通知");
            return obj;
        } catch (Throwable e) {
            System.out.println("出现异常");
            throw e;
        }
    }

    // 在连接点执行结束之后执行的通知
    @After("LogAspect()")
    public void doAfterLog() {
        System.out.println("执行 controller 后置结束通知");
    }

    // 在连接点执行结束并返回之后执行的通知
    @AfterReturning("LogAspect()")
    public void doAfterReturnLog(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Log log = method.getAnnotation(Log.class);

        String name = log.name();
        System.out.println(name);

        System.out.println("执行 controller 后置返回通知");
    }

    // 在连接点执行之后执行的通知（异常通知）
    @AfterThrowing(pointcut = "LogAspect()", throwing = "e")
    public void doAfterThrowingLog(JoinPoint joinPoint, Throwable e) {
        System.out.println("====异常通知开始====");
        System.out.println("异常代码：" + e.getClass().getName());
        System.out.println("异常信息：" + e.getMessage());
    }
}
