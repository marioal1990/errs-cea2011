package com.enjava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

import periodico.PeriodicoInternacional;
import periodico.PeriodicoNacional;

import com.enjava.Dependencia;
import com.enjava.Servicio;


public class TestApplication {

	
	
	@Test
	public void pruebaInyeccionDep(){
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(r);
		Servicio servicio = beanFactory.getBean(Servicio.class);
		System.out.println(servicio.trabaja());
	}
	
	
	@Test
	public void pruebaPeriodicoNacional(){
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(r);
		
		PeriodicoNacional periodicoNacional = beanFactory.getBean(PeriodicoNacional.class);
		
		System.out.println(periodicoNacional.dameNoticias());
	}
	
	@Test
	public void pruebaPeriodicoIntenacional(){
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(r);
		
		PeriodicoInternacional periodicoInternacional = beanFactory.getBean(PeriodicoInternacional.class);
		
		System.out.println(periodicoInternacional.dameNoticias());
	}
	
	
}
