package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.core.io.FileSystemResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			      /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");//This API loads beans configuration file and eventually based on the provided API, it takes care of creating and initializing all the objects, i.e. beans mentioned in the configuration file.
			      Hello obj = (Hello) context.getBean("hello"); 
			      obj.getMessage();
	}*/ 

BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
Hello e=(Hello) beanFactory.getBean("hello");
Hello e1=(Hello) beanFactory.getBean("hello");
Hello e2=(Hello) beanFactory.getBean("hello");
//e.setAddress("blr");
//e.setName("raja");
e.getMessage();
e.getAddress();
e.getName();
//e1.setAddress("bbsr");
//e1.setName("sree");

e1.getAddress();
e1.getName();

System.out.println(Hello.count);
}
}
