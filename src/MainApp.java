import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj1=(HelloWorld) context.getBean("helloWorld");
		obj1.setMessage("I'm object 1");
		obj1.getMessage();

		System.out.println("Object  "+obj1.hashCode());
		
		HelloWorld obj2=(HelloWorld) context.getBean("helloWorld");
		obj2.getMessage();
		System.out.println("Object  "+obj2.hashCode());
		
		
		
		
	}
}
