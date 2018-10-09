package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.IPersonDao;
import com.example.demo.dao.Person;

@SpringBootApplication
public class MangoSpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MangoSpringBootDemoApplication.class, args);
		
		IPersonDao dao = context.getBean(IPersonDao.class);
		Person person  = new Person();
		String mill = String.valueOf(System.currentTimeMillis());
		person.setUid("U" + mill);
		person.setName("N" + mill);
		person.setSex("S" + mill);
		person.setDesciption("D" + mill);
		
		dao.insert(person);
		
	}
}
