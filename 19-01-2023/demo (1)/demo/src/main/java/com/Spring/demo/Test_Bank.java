package com.Spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Bank_Details;

public class Test_Bank {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("AppContext.xml");
		BeanFactory b = new XmlBeanFactory(res);
		Bank_Details bk = (Bank_Details) b.getBean("bd");
		bk.display();

	}

}
