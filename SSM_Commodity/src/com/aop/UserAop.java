package com.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class UserAop {
	public static final Logger log=Logger.getLogger(UserAop.class);
	
	/*@Pointcut("execution(public void suibian(..))")
	public void pointCut(){}*/
	
	
	//前置增强方法
	
	/*
	 * public void main(var)
	 *  * com.dao..*.* (..)
	 */
	@Before("execution(* com.service.impl.*.*(..))")
	public void before(JoinPoint jp){
		log.info("===============================================调用："+jp.getTarget()+"的"
				+jp.getSignature().getName()+"方法。==============方法入参："+Arrays.toString(jp.getArgs())+"=======================================");
	}
	 
	//后置增强方法
	@AfterReturning(pointcut="execution(* com.service.impl.*.*(..))",returning="result")
	public void after(JoinPoint jp,Object result){
		log.info("==============================================调用："+jp.getTarget()+"的"
				+jp.getSignature().getName()+"方法。=============返回值："+result+"=======================================");
	}
	

}
