package main.java.org.myapp.mybatis.mapper.java;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import main.java.org.myapp.classes.SimpleObject;

public interface SimpleMapper {

	List<SimpleObject> findAllObjects();
	
	List<SimpleObject> findObjectsWithIds(@Param("list") List<Integer> ids);
	
}
