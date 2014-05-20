package main.java.org.myapp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.org.myapp.classes.SimpleObject;
import main.java.org.myapp.mybatis.mapper.java.SimpleMapper;
import main.java.org.myapp.service.SimpleService;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("MASTER");
		
		SimpleMapper simpleService = new SimpleService();
		List<SimpleObject> sObjects = simpleService.findAllObjects();
		System.out.println("List of objects");
		for(int i = 0; i < sObjects.size(); i++)
			System.out.println(sObjects.get(i).getId() + "; " + sObjects.get(i).getText());
		
		Integer[] ids = { 1, 5, 7 };
		List<SimpleObject> sObjectIds = simpleService.findObjectsWithIds(Arrays.asList(ids));
		
		System.out.println("List of objects with some ids");
		for(int i = 0; i < sObjectIds.size(); i++)
			System.out.println(sObjectIds.get(i).getId() + "; " + sObjects.get(i).getText());
	}

}
