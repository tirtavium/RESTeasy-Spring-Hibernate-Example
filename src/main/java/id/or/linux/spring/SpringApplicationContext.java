package id.or.linux.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import sun.awt.AppContext;

public class SpringApplicationContext implements ApplicationContextAware{

	
	private static ApplicationContext appContext;
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		appContext = arg0;
		
	}
	
	
	public static Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}


}
