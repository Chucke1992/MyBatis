package main.java.org.myapp.mybatis.mapper.java;

import java.util.List;

import main.java.org.myapp.classes.SimpleObject;

public interface SimpleMapper {

	List<SimpleObject> findAllObjects();

	SimpleObject findObjectByIdAndText(SimpleObject so);
	
	SimpleObject findObjectByIdAndTextMultiple(Integer id, String text);
	
}
