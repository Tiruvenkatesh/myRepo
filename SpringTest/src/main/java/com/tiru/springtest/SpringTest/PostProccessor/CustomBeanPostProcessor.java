package com.tiru.springtest.SpringTest.PostProccessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("This is post processor before initialization for bean with name " +beanName +"and its object to String is =" +bean.toString());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("This is post processor after initialization for bean with name " +beanName +"and its object to String is =" +bean.toString());
		return bean;
	}

}
