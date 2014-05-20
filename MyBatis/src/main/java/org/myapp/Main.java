package main.java.org.myapp;

import java.util.Arrays;
import java.util.List;

import main.java.org.myapp.classes.SimpleObject;
import main.java.org.myapp.mybatis.mapper.java.SimpleMapper;
import main.java.org.myapp.service.SimpleService;


public class Main {

	public static void main(String[] args) {
		System.out.println("MASTER");
		
		System.out.println("All objects");
		SimpleMapper simpleService = new SimpleService();
		List<SimpleObject> sObjects = simpleService.findAllObjects();
		for(int i = 0; i < sObjects.size(); i++)
			System.out.println(sObjects.get(i).getId() + "; " + sObjects.get(i).getText());
		
		System.out.println("Certain indices");
		Integer[] ids = { 1, 5, 7 };
		List<SimpleObject> sObjectIds = simpleService.findObjectsWithIds(Arrays.asList(ids));
		for(int i = 0; i < sObjectIds.size(); i++)
			System.out.println(sObjectIds.get(i).getId() + "; " + sObjects.get(i).getText());
		
		System.out.println("Even numbers");
		List<SimpleObject> sObjectEven = simpleService.findEvenNumbers();
		for(int i = 0; i < sObjectEven.size(); i++)
			System.out.println(sObjectEven.get(i).getId() + "; " + sObjectEven.get(i).getText());
	}

}
