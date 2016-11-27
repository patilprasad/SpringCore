import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{
	private Point center;
	public Point getCenter() {
		return center;
	}
	
	//@Required
	@Resource(name="point3")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle Point is :( " + center.getX()+","+ center.getY()+")");
		
	}
	
	@PostConstruct
	public void intializeCirle(){
		System.out.println("Initializing Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println(" Destroying Circle");
	}

	
}
