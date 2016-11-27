package org.prasad;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{
	private Point center;
	private ApplicationEventPublisher publisher;

	@Autowired
	private MessageSource messageSource;
	
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public Point getCenter() {
		return center;
	}
	
	//@Required
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle Point is :( " + center.getX()+","+ center.getY()+")");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
		DrawEvent drawEvent= new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	@PostConstruct
	public void intializeCirle(){
		System.out.println("Initializing Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println(" Destroying Circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}

}
