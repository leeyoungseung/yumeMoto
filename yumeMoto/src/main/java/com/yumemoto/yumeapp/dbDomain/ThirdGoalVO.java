/**
 * This Class is VO.
 * VO look like DB table that is thirdgoal.
 * You can use this class by box of data. when you connect DB.
 */
package com.yumemoto.yumeapp.dbDomain;

import java.util.Date;

public class ThirdGoalVO {

	private Integer third_num;			//It is primary key. 
	private Integer third_mem_num;		//It is member's primary key and using foreign key when you want to link table of member.
	private Integer third_m_num;		//It is maingoal's primary key and using foreign key when you want to link table of maingoal.
	private Integer third_second_num;	//It is secondgoal's primary key and using foreign key when you want to link table of secondgoal.
	private String third_content;		//This parameter deal with content data of thirdgoal.
	private Integer third_type;			//This parameter divide Active and Passive.
	private Date third_createDate;		//It is createDate.
	private Date third_updateDate;		//It is updateDate origin value is createDate.
	private Integer third_good;			//It can count good.
	private Date third_dateOfActive;	//It save day of set active.
	
	/**
	 * this method is constructor. 
	 * You can use when you need object of MemberVO without parameter's initialization.
	 * 
	 */
	public ThirdGoalVO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * this method is constructor. and including object's parameter initialization.
	 */
	public ThirdGoalVO(Integer third_num, Integer third_mem_num, Integer third_m_num, Integer third_second_num,
			String third_content, Integer third_type, Date third_createDate, Date third_updateDate, Integer third_good,
			Date third_dateOfActive) {
		super();
		this.third_num = third_num;
		this.third_mem_num = third_mem_num;
		this.third_m_num = third_m_num;
		this.third_second_num = third_second_num;
		this.third_content = third_content;
		this.third_type = third_type;
		this.third_createDate = third_createDate;
		this.third_updateDate = third_updateDate;
		this.third_good = third_good;
		this.third_dateOfActive = third_dateOfActive;
	}

	//----------------------getter and setter----------------------------
	
	public Integer getThird_num() {
		return third_num;
	}


	public void setThird_num(Integer third_num) {
		this.third_num = third_num;
	}


	public Integer getThird_mem_num() {
		return third_mem_num;
	}


	public void setThird_mem_num(Integer third_mem_num) {
		this.third_mem_num = third_mem_num;
	}


	public Integer getThird_m_num() {
		return third_m_num;
	}


	public void setThird_m_num(Integer third_m_num) {
		this.third_m_num = third_m_num;
	}


	public Integer getThird_second_num() {
		return third_second_num;
	}


	public void setThird_second_num(Integer third_second_num) {
		this.third_second_num = third_second_num;
	}


	public String getThird_content() {
		return third_content;
	}


	public void setThird_content(String third_content) {
		this.third_content = third_content;
	}


	public Integer getThird_type() {
		return third_type;
	}


	public void setThird_type(Integer third_type) {
		this.third_type = third_type;
	}


	public Date getThird_createDate() {
		return third_createDate;
	}


	public void setThird_createDate(Date third_createDate) {
		this.third_createDate = third_createDate;
	}


	public Date getThird_updateDate() {
		return third_updateDate;
	}


	public void setThird_updateDate(Date third_updateDate) {
		this.third_updateDate = third_updateDate;
	}


	public Integer getThird_good() {
		return third_good;
	}


	public void setThird_good(Integer third_good) {
		this.third_good = third_good;
	}


	public Date getThird_dateOfActive() {
		return third_dateOfActive;
	}


	public void setThird_dateOfActive(Date third_dateOfActive) {
		this.third_dateOfActive = third_dateOfActive;
	}

	//----------------------getter and setter----------------------------
	
	@Override
	public String toString() {
		return "-------------------------------------------------------------------------------------------------------------\n"
				+ "ThirdGoalVO [third_num=" + third_num + ", third_mem_num=" + third_mem_num + ", third_m_num="
				+ third_m_num + ", third_second_num=" + third_second_num + ", third_content=" + third_content
				+ ", third_type=" + third_type + ", third_createDate=" + third_createDate + ", third_updateDate="
				+ third_updateDate + ", third_good=" + third_good + ", third_dateOfActive=" + third_dateOfActive + "]\n"
				+ "-------------------------------------------------------------------------------------------------------------\n";
	}
	
	
	
	
	
}
