package com.ksg.persistence;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class AbstractDAO {
	
	private static final String RESOURCE = "com/ksg/persistence/mybatis-config.xml";
	//private static final String RESOURCE = "./mybatis-config.xml";
	protected SqlSessionFactory factory;

	public AbstractDAO() {
		try {

			Reader reder=Resources.getResourceAsReader(RESOURCE);			

			factory = new SqlSessionFactoryBuilder().build(reder);			
			

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
