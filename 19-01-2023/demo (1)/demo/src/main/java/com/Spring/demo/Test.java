package com.Spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Bank;

public class Test {

	public static void main(String[] args) {
			Resource res = new ClassPathResource("AppContext.xml");
			BeanFactory b = new XmlBeanFactory(res);
			Bank bank = (Bank) b.getBean("bank");
			bank.display();

	}

}
