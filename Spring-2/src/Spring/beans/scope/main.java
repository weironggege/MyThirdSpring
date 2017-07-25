package Spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.beans.autowire.Car;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-scope.xml");
		
		Car car = (Car) ctx.getBean("car");
		Car car2 = (Car) ctx.getBean("car");
		
		System.out.println(car == car2);
	}

}
