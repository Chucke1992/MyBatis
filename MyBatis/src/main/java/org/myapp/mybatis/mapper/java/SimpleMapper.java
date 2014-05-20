package main.java.org.myapp.mybatis.mapper.java;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import main.java.org.myapp.classes.SimpleObject;

public interface SimpleMapper {

	List<SimpleObject> findAllObjects();
	
	List<SimpleObject> findObjectsWithIds(@Param("list") List<Integer> ids);

	@Select("SELECT * from testschema.\"XSimpleTable\" WHERE (id % 2) = 0")
	List<SimpleObject> findEvenNumbers();
	
	SimpleObject findObjectByIdAndText(SimpleObject so);
	
	SimpleObject findObjectByIdAndTextMultiple(@Param("index")Integer id, @Param("data")String text);
	
}
