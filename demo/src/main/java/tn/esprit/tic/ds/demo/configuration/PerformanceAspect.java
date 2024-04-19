package tn.esprit.tic.ds.demo.configuration;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {

        @Around("execution(* tn.esprit.tic.ds.demo.service.*.*(..))")
        public Object profile(ProceedingJoinPoint pjp)throws Throwable{
            long start = System.currentTimeMillis();
            Object obj = pjp.proceed();
            long elapsedTime = System.currentTimeMillis() - start;
            log.info("Method execution time: " + elapsedTime+ "milliseconds. ");
            return obj;
        }
}