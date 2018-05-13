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

import com.yumemoto.yumeapp.dao.MemberDAO;
import com.yumemoto.yumeapp.dbDomain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.yumemoto.yumeapp.mapper.MemberMapper";
	
	
	@Override
	public int joinMember(MemberVO mvo) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".createMember", mvo);
	}

	@Override
	public MemberVO readMember(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".readMember",m_num);
	}

	@Override
	public int updateMember(MemberVO mvo) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".updateMember",mvo);
	}

	@Override
	public int deleteMember(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".deleteMember",m_num);
	}

	@Override
	public List<MemberVO> listMember() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listMember");
	}

}
