package com.yumemoto.yumeapp.testController;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MybatisConnectionTest {
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	/**
	 * summary : It check creating SQL session 
	 */
	@Test
	public void testFactory(){
		
		System.out.println(sqlFactory);
	}
	/**
	 * summary : It check connecting DB via Mybatis 
	 */
	@Test
	public void testSession() throws Exception{
		try(SqlSession session = sqlFactory.openSession()){
			
			System.out.println(session);
			System.out.println("------------------------------------------------------------");
			System.out.println("success connection");
			System.out.println("------------------------------------------------------------");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
			System.out.println("fail");
			System.out.println("------------------------------------------------------------");
		}
	}
}
