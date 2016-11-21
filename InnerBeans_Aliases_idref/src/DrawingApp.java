import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
   public static void main(String[] args) {      
	   ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	   Triangle triangle = (Triangle) context.getBean("triangle");
	   Triangle triangle1 = (Triangle) context.getBean("triangle-alias");
	   Triangle triangle2 = (Triangle) context.getBean("triangle-name");

	   triangle.draw();
	   triangle1.draw();
	   triangle2.draw();
   }
}