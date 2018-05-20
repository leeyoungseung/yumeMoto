package com.yumemoto.yumeapp.service.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yumemoto.yumeapp.dao.MemberDAO;
import com.yumemoto.yumeapp.dbDomain.MemberVO;
import com.yumemoto.yumeapp.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO memberDAO;
	
	@Override
	public int joinMember(MemberVO mvo) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.joinMember(mvo);
	}

	@Override
	public MemberVO readMember(Integer m_num) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.readMember(m_num);
	}

	@Override
	public int updateMember(MemberVO mvo) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.updateMember(mvo);
	}

	@Override
	public int deleteMember(Integer mb_no) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.deleteMember(mb_no);
	}

	@Override
	public List<MemberVO> listMember() throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.listMember();
	}

}
