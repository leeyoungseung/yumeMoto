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

import com.yumemoto.yumeapp.dao.ThirdGoalDAO;
import com.yumemoto.yumeapp.dbDomain.ThirdGoalVO;

@Repository
public class ThirdGoalDAOImpl implements ThirdGoalDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.yumemoto.yumeapp.mapper.ThirdGoalMapper";
	
	@Override
	public int createThirdGoal(ThirdGoalVO tg) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".createThirdGoal", tg);
	}

	@Override
	public ThirdGoalVO readThirdGoal(Integer third_num) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".readThirdGoal",third_num);
	}

	@Override
	public int updateThirdGoal(ThirdGoalVO tg) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".updateThirdGoal",tg);
	}

	@Override
	public int deleteThirdGoal(Integer third_num) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".deleteThirdGoal",third_num);
	}

	@Override
	public List<ThirdGoalVO> listThirdGoal() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listThirdGoal");
	}

}
