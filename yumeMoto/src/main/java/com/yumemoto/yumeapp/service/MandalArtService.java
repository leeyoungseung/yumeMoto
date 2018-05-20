package com.yumemoto.yumeapp.service;

import java.util.HashMap;
import java.util.List;

import com.yumemoto.yumeapp.dbDomain.MainGoalVO;
import com.yumemoto.yumeapp.dbDomain.SecondGoalVO;
import com.yumemoto.yumeapp.dbDomain.ThirdGoalVO;

public interface MandalArtService {

	
	/**
	 * Function of Associated MainGaol
	 * @param mg
	 * @return
	 * @throws Exception
	 */
	public int createMainGoal(MainGoalVO mg) throws Exception;
	
	public MainGoalVO readMainGoal(Integer m_num) throws Exception;
	
	public int updateMainGoal(MainGoalVO mg) throws Exception;
	
	public int deleteMainGoal(Integer m_num) throws Exception;
	
	public List<MainGoalVO> listMainGoal() throws Exception;
	
	/**
	 * Function of Associated Second Goal
	 * @param sg
	 * @return
	 * @throws Exception
	 */
	public int createSecondGoal(SecondGoalVO sg) throws Exception;
	
	public SecondGoalVO readSecondGoal(Integer second_num) throws Exception;
	
	public int updateSecondGoal(SecondGoalVO sg) throws Exception;
	
	public int deleteSecondGoal(Integer second_num) throws Exception;
	
	public List<SecondGoalVO> listSecondGoal() throws Exception;
	
	/**
	 * Function of Associated Third Goal
	 * @param tg
	 * @return
	 * @throws Exception
	 */
	public int createThirdGoal(ThirdGoalVO tg) throws Exception;
	
	public ThirdGoalVO readThirdGoal(Integer third_num) throws Exception;
	
	public int updateThirdGoal(ThirdGoalVO tg) throws Exception;
	
	public int deleteThirdGoal(Integer third_num) throws Exception;
	
	public List<ThirdGoalVO> listThirdGoal() throws Exception;
	
	/**
	 * Function of Associated MandalArt
	 * @param tg
	 * @return
	 * @throws Exception
	 */
	public HashMap<String , List> MandalList(Integer m_num) throws Exception;
	
}
