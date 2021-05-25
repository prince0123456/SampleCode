package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreeting;

public class SpringBasicTest {

	public static void main(String[] args) {
		//located spring beans file and hold it
		System.out.println("-----------------------------------");
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//Create IOC container(XmlBeanFactory)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get Spring beans class object
		Date d=(Date)factory.getBean("dt");
		//print date
		System.out.println("d obj date "+ d);
		System.out.println("=================================");
		WelcomeGreeting greeting=(WelcomeGreeting)factory.getBean("wmg");
		System.out.println("message:: "+greeting.welcome("raja"));
	}

}
