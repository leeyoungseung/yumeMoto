/**
 * This Class is DAO. You can control data of DataBase.
 * For controlling DB, I used annotation that is Inject.
 * It inject Database Connection Object , that is SqlSession , created by Spring framework. 
 * When you use DAO Class.
 * Basic Functions are create, read, update, delete, list.
 * If you want to add other function, you can define this Class. 
 */
package com.yumemoto.yumeapp.dao.daoImpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yumemoto.yumeapp.dao.SecondGoalDAO;
import com.yumemoto.yumeapp.dbDomain.SecondGoalVO;

@Repository
public class SecondGoalDAOImpl implements SecondGoalDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.yumemoto.yumeapp.mapper.SecondGoalMapper";
	
	@Override
	public int createSecondGoal(SecondGoalVO sg) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".createSecondGoal", sg);
	}

	@Override
	public SecondGoalVO readSecondGoal(Integer second_num) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".readSecondGoal",second_num);
	}

	@Override
	public int updateSecondGoal(SecondGoalVO sg) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".updateSecondGoal",sg);
	}

	@Override
	public int deleteSecondGoal(Integer second_num) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".deleteSecondGoal",second_num);
	}

	@Override
	public List<SecondGoalVO> listSecondGoal() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listSecondGoal");
	}

}
