package main.java.org.myapp.mybatis;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory;

	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("org/myapp/mybatis/mybatis-config.xml");
				System.out.println("----");
				sqlSessionFactory = new SqlSessionFactoryBuilder()
						.build(inputStream);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				throw new RuntimeException(e.getCause());
			}
		}
		return sqlSessionFactory;
	}

	public static SqlSession openSession() {
		return getSqlSessionFactory().openSession();
	}
}