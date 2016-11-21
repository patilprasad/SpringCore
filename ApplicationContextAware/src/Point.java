import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Point implements ApplicationContextAware, BeanNameAware {
private int x;
private int y;
private ApplicationContext context= null;
private String beanName= null;

public String getBeanName() {
	return beanName;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

void draw(){
 System.out.println(" Point = ("+ getX()+" , "+ getY()+")");

}
@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	this.context = context;
	
}

@Override
public void setBeanName(String beanName) {
	//you can have a member variable here 
	this.beanName= beanName;
}

}
