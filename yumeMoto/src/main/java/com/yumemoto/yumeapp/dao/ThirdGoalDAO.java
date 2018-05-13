/**
 * This Interface is abstract DAO.
 * It define basic functions which are create, read, update, delete, list..
 */
package com.yumemoto.yumeapp.dao;

import java.util.List;

import com.yumemoto.yumeapp.dbDomain.ThirdGoalVO;

public interface ThirdGoalDAO {

	public int createThirdGoal(ThirdGoalVO tg) throws Exception;
	
	public ThirdGoalVO readThirdGoal(Integer third_num) throws Exception;
	
	public int updateThirdGoal(ThirdGoalVO tg) throws Exception;
	
	public int deleteThirdGoal(Integer third_num) throws Exception;
	
	public List<ThirdGoalVO> listThirdGoal() throws Exception;
	
}
