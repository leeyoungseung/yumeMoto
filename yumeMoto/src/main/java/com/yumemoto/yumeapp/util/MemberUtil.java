package com.yumemoto.yumeapp.util;

import java.util.HashMap;
import java.util.List;

import com.yumemoto.yumeapp.dbDomain.MemberVO;

public class MemberUtil {

	private MemberVO memberVO;
	
	public MemberUtil(MemberVO mvo) {
		// TODO Auto-generated constructor stub
		this.memberVO = mvo; 
	}
	
	
	/**
	 * @author Lee
	 * This method can support function of Login.
	 * @param memberList
	 * @return
	 * @throws Exception
	 */
	public HashMap loginCheck(List<MemberVO> memberList) throws Exception{
		HashMap resultHash = new HashMap<>();
		String resultMsg = "Error occured";
		//null check
		if(memberList.isEmpty() || memberList.size()==0){
			resultMsg = "Don't have MemberInfo";
			resultHash.put("resultMsg", resultMsg);
			return resultHash;
		}
		for(MemberVO mvo : memberList){
			if(mvo.getM_id()==memberVO.getM_id() ){
				System.out.println("Finding ID");
				if(mvo.getM_pwd()==memberVO.getM_pwd()){
					System.out.println("PW OK Login OK");
					resultMsg = "Succeed Login Welcome to Yumemoto";
					resultHash.put("resultMsg", resultMsg);
					resultHash.put("memberInfo", memberVO);
					break;
				}else{
					System.out.println("PW Not Collect");
					resultMsg = "Password Fail";
					resultHash.put("resultMsg", resultMsg);
					break;
				}
			}else {
				System.out.println("Not Finding ID");
			}
		}
		return resultHash;
	}
	
	
}
