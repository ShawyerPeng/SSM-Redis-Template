package aop;

import annotation.RequestLimit;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPInterceptAspect {
    /**
     * 拦截登录
     */
    @Around("within(@org.springframework.stereotype.Controller *) && @annotation(limit)")
    public Object requestLimit(final ProceedingJoinPoint joinPoint, RequestLimit limit) throws Throwable {
        Object[] args = joinPoint.getArgs();
        if (args[0].equals("zone")) {
            System.out.println(limit.count());
            return "jsp/loginFailed";
        }
        return joinPoint.proceed();
    }
}
