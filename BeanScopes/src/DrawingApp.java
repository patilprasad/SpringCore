import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
   public static void main(String[] args) {      
	   ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	   Point point = (Point) context.getBean("pointA");
	   point.draw();
	   point.setX(30);
	   point.draw();
	   Point point1 = (Point) context.getBean("pointA");
	   point1.draw();
   
   }
}