package com.yumemoto.yumeapp.service.serviceImpl;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yumemoto.yumeapp.dao.MainGoalDAO;
import com.yumemoto.yumeapp.dao.SecondGoalDAO;
import com.yumemoto.yumeapp.dao.ThirdGoalDAO;
import com.yumemoto.yumeapp.dbDomain.MainGoalVO;
import com.yumemoto.yumeapp.dbDomain.SecondGoalVO;
import com.yumemoto.yumeapp.dbDomain.ThirdGoalVO;
import com.yumemoto.yumeapp.service.MandalArtService;
@Service
public class MandalArtServiceImpl implements MandalArtService {
	
	@Inject
	private MainGoalDAO mainGoalDAO;
	
	@Inject
	private SecondGoalDAO secondGoalDAO;
	
	@Inject
	private ThirdGoalDAO thirdGoalDAO;
	

	/**
	 * ---------------Location of MainGoal Start------------------
	 */
	
	@Override
	public int createMainGoal(MainGoalVO mg) throws Exception {
		// TODO Auto-generated method stub
		return mainGoalDAO.createMainGoal(mg);
	}

	@Override
	public MainGoalVO readMainGoal(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		return mainGoalDAO.readMainGoal(m_num);
	}

	@Override
	public int updateMainGoal(MainGoalVO mg) throws Exception {
		// TODO Auto-generated method stub
		return mainGoalDAO.updateMainGoal(mg);
	}

	@Override
	public int deleteMainGoal(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		return mainGoalDAO.deleteMainGoal(m_num);
	}

	@Override
	public List<MainGoalVO> listMainGoal() throws Exception {
		// TODO Auto-generated method stub
		return mainGoalDAO.listMainGoal();
	}

	/**
	 * ---------------Location of MainGoal End------------------
	 */
	
	
	/**
	 * ---------------Location of SecondGoal Start------------------
	 */
	
	
	@Override
	public int createSecondGoal(SecondGoalVO sg) throws Exception {
		// TODO Auto-generated method stub
		return secondGoalDAO.createSecondGoal(sg);
	}

	@Override
	public SecondGoalVO readSecondGoal(Integer second_num) throws Exception {
		// TODO Auto-generated method stub
		return secondGoalDAO.readSecondGoal(second_num);
	}

	@Override
	public int updateSecondGoal(SecondGoalVO sg) throws Exception {
		// TODO Auto-generated method stub
		return secondGoalDAO.updateSecondGoal(sg);
	}

	@Override
	public int deleteSecondGoal(Integer second_num) throws Exception {
		// TODO Auto-generated method stub
		return secondGoalDAO.deleteSecondGoal(second_num);
	}

	@Override
	public List<SecondGoalVO> listSecondGoal() throws Exception {
		// TODO Auto-generated method stub
		return secondGoalDAO.listSecondGoal();
	}

	
	/**
	 * ---------------Location of SecondGoal End------------------
	 */
	
	
	/**
	 * ---------------Location of ThirdGoal Start------------------
	 */
	
	@Override
	public int createThirdGoal(ThirdGoalVO tg) throws Exception {
		// TODO Auto-generated method stub
		return thirdGoalDAO.createThirdGoal(tg);
	}

	@Override
	public ThirdGoalVO readThirdGoal(Integer third_num) throws Exception {
		// TODO Auto-generated method stub
		return thirdGoalDAO.readThirdGoal(third_num);
	}

	@Override
	public int updateThirdGoal(ThirdGoalVO tg) throws Exception {
		// TODO Auto-generated method stub
		return thirdGoalDAO.updateThirdGoal(tg);
	}

	@Override
	public int deleteThirdGoal(Integer third_num) throws Exception {
		// TODO Auto-generated method stub
		return thirdGoalDAO.deleteThirdGoal(third_num);
	}

	@Override
	public List<ThirdGoalVO> listThirdGoal() throws Exception {
		// TODO Auto-generated method stub
		return thirdGoalDAO.listThirdGoal();
	}
	
	
	/**
	 * ---------------Location of ThirdGoal End------------------
	 */

	
	/**
	 * ---------------Location of MandalArt Start------------------
	 */
	
	@Override
	public HashMap<String, List> MandalList(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, List> goalLists = new HashMap<>();
		goalLists.put("mainList", mainGoalDAO.listMainGoal());
		goalLists.put("secondList", secondGoalDAO.listSecondGoal());
		goalLists.put("thirdList" , thirdGoalDAO.listThirdGoal());
		return goalLists;
	}
	
	
	
	/**
	 * ---------------Location of MandalArt End------------------
	 */
}
