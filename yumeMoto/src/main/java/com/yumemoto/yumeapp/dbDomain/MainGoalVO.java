/**
 * This Class is VO.
 * VO look like DB table that is maingoal.
 * You can use this class by box of data. when you connect DB.
 */
package com.yumemoto.yumeapp.dbDomain;

import java.util.Date;

public class MainGoalVO {

	private Integer main_num;		//It is maingoal's primary key.
	private Integer main_mem_num;	//It is member's primary key and using foreign key when you want to link table of member.
	private String main_content;	//This parameter deal with content data of maingoal.
	private Date main_createDate;	//It is createDate.
	private Date main_updateDate;	//It is updateDate origin value is createDate.
	private Integer main_good;		//It can count good.
	
	/**
	 * this method is constructor. 
	 * You can use when you need object of MemberVO without parameter's initialization.
	 * 
	 */
	public MainGoalVO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * this method is constructor. and including object's parameter initialization.
	 */
	public MainGoalVO(Integer main_num, Integer main_mem_num, String main_content, Date main_createDate,
			Date main_updateDate, Integer main_good) {
		
		this.main_num = main_num;
		this.main_mem_num = main_mem_num;
		this.main_content = main_content;
		this.main_createDate = main_createDate;
		this.main_updateDate = main_updateDate;
		this.main_good = main_good;
	}

	//----------------------getter and setter----------------------------
	
	public Integer getMain_num() {
		return main_num;
	}

	public void setMain_num(Integer main_num) {
		this.main_num = main_num;
	}

	public Integer getMain_mem_num() {
		return main_mem_num;
	}

	public void setMain_mem_num(Integer main_mem_num) {
		this.main_mem_num = main_mem_num;
	}

	public String getMain_content() {
		return main_content;
	}

	public void setMain_content(String main_content) {
		this.main_content = main_content;
	}

	public Date getMain_createDate() {
		return main_createDate;
	}

	public void setMain_createDate(Date main_createDate) {
		this.main_createDate = main_createDate;
	}

	public Date getMain_updateDate() {
		return main_updateDate;
	}

	public void setMain_updateDate(Date main_updateDate) {
		this.main_updateDate = main_updateDate;
	}

	public Integer getMain_good() {
		return main_good;
	}

	public void setMain_good(Integer main_good) {
		this.main_good = main_good;
	}

	//----------------------getter and setter----------------------------
	
	@Override
	public String toString() {
		return "-----------------------------------------------------------------------"
				+ "MainGoal [main_num=" + main_num + ", main_mem_num=" + main_mem_num + ", main_content=" + main_content
				+ ", main_createDate=" + main_createDate + ", main_updateDate=" + main_updateDate + ", main_good="
				+ main_good + "]"
				+ "-----------------------------------------------------------------------";
	}
	
	
}
