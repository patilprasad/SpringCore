import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	private Point pointA;
	private Point pointB;
	private Point pointC;
		
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw(){
	System.out.println("pointA = ("+ getPointA().getX()+","+ getPointA().getY()+")");	
	System.out.println("pointB = ("+ getPointB().getX()+","+ getPointB().getY()+")");	
	System.out.println("pointC = ("+ getPointC().getX()+","+ getPointC().getY()+")");	

	}

	public void myInit(){
		System.out.println("myInit method called for triangle");
	}
	public void myCleanUp(){
		System.out.println("myCleanUP method called for triangle");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {	
		System.out.println("Initialization beans init method called for triangle");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable beans destroy method called for triangle");
		
		
		
	}
}
