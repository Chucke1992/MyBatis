package main.java.org.myapp;

import java.util.List;

import main.java.org.myapp.classes.SimpleObject;
import main.java.org.myapp.mybatis.mapper.java.SimpleMapper;
import main.java.org.myapp.service.SimpleService;


public class Main {

	public static void main(String[] args) {
		SimpleMapper simpleService = new SimpleService();
		List<SimpleObject> sObjects = simpleService.findAllObjects();
		System.out.println("Database data");
		for(int i = 0; i < sObjects.size(); i++)
			System.out.println(sObjects.get(i).getId() + ";" + sObjects.get(i).getText());
	}

}
