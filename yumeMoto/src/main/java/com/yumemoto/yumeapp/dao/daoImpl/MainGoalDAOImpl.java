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

import com.yumemoto.yumeapp.dao.MainGoalDAO;
import com.yumemoto.yumeapp.dbDomain.MainGoalVO;

@Repository
public class MainGoalDAOImpl implements MainGoalDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.yumemoto.yumeapp.mapper.MainGoalMapper";
	
	
	@Override
	public int createMainGoal(MainGoalVO mg) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".createMainGoal", mg);
	}

	@Override
	public MainGoalVO readMainGoal(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".readMainGoal",m_num);
	}

	@Override
	public int updateMainGoal(MainGoalVO mg) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".updateMainGoal",mg);
	}

	@Override
	public int deleteMainGoal(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".deleteMainGoal",m_num);
	}

	@Override
	public List<MainGoalVO> listMainGoal() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listMainGoal");
	}

}
