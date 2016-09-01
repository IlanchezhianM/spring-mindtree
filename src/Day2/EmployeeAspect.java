package Day2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class EmployeeAspect {
	
//	@Before("execution(public * *(..))")
//	public void getNameAdv(){
//		System.out.println("-------In getNameAdvice-----");
//	}
//	
	
	@Before("execution(* Day2.Employee.set*(..)) && target(bean) && args(salary)")
	public void getExtraAdv(Object bean, int salary){
		if ( Employee.class.isInstance(bean)){
		Employee e = (Employee)bean;
		
		System.out.println("-------In setSalary-----" + e.getSalary()+ "New salary" + salary);
		}
	}
	
//	@After("execution(* Day2.Employee.get*())")
//	public void getExtraAdv(){
//		System.out.println("-------In getExtraAdvice-----");
//	}
//	
//	@AfterReturning("execution(* Day2.Employee.get*())")
//	public void getMoreExtraAdv(){
//		System.out.println("-------In getMoreExtraAdvice-----");
//	}
	
//	@Around("execution(* Day2.Employee.get*())")
//	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
//        // start stopwatch
//		System.out.println("Before start");
//		Object retVal = 1;
//		
//		if (false){
//        retVal = pjp.proceed(); // joint point invocation
//		}
//		
//        // stop stopwatch
//        System.out.println("After finish");
//        return retVal;
//    }

}

