package main.java.org.myapp.service;

import java.util.List;

import main.java.org.myapp.classes.SimpleObject;
import main.java.org.myapp.mybatis.MyBatisSqlSessionFactory;
import main.java.org.myapp.mybatis.mapper.java.SimpleMapper;

import org.apache.ibatis.session.SqlSession;

public class SimpleService implements SimpleMapper {

	@Override
	public List<SimpleObject> findAllObjects() {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			SimpleMapper simpleMapper = sqlSession.getMapper(SimpleMapper.class);
			return simpleMapper.findAllObjects();
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public List<SimpleObject> findObjectsWithIds(List<Integer> ids) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			SimpleMapper simpleMapper = sqlSession.getMapper(SimpleMapper.class);
			return simpleMapper.findObjectsWithIds(ids);
		} finally {
			sqlSession.close();
		}
	}

}
