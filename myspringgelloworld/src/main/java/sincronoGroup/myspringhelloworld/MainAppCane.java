package sincronoGroup.myspringhelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppCane {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Gatto ga=(Gatto) context.getBean("Gatto");
		HelloWorld hl=(HelloWorld) context.getBean("helloWorld");
		Cane obj= (Cane) context.getBean("Cane");
		
		
		obj.getVerso();
		ga.getRisposta();
		obj.GetVedere();
		obj.getRincorre();
		ga.getScappa();
		
		
	
	
	
	
	
	
	
	}

}
