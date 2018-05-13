/**
 * This Interface is abstract DAO.
 * It define basic functions which are create, read, update, delete, list..
 */
package com.yumemoto.yumeapp.dao;

import java.util.List;

import com.yumemoto.yumeapp.dbDomain.MemberVO;

public interface MemberDAO {

	public int joinMember(MemberVO mvo) throws Exception;
	
	public MemberVO readMember(Integer m_num)throws Exception;
	
	public int updateMember(MemberVO mvo) throws Exception;
	
	public int deleteMember(Integer mb_no) throws Exception;
	
	public List<MemberVO> listMember() throws Exception;
	
}
