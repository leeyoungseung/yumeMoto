/**
 * This Class is VO.
 * VO look like DB table that is secondgoal.
 * You can use this class by box of data. when you connect DB.
 */
package com.yumemoto.yumeapp.dbDomain;

import java.util.Date;

public class SecondGoalVO {

	private Integer second_num;			//It is secondgoal's primary key .
	private Integer second_m_num;		//It is maingoal's primary key and using foreign key when you want to link table of maingoal.
	private String second_content;		//This parameter deal with content data of secondgoal.
	private Integer second_mem_num;		//It is member's primary key and using foreign key when you want to link table of member.
	private Date second_createDate;		//It is createDate.
	private Date second_updateDate;		//It is updateDate origin value is createDate.
	private Integer second_good;		//It can count good.
	
	/**
	 * this method is constructor. 
	 * You can use when you need object of MemberVO without parameter's initialization.
	 * 
	 */
	public SecondGoalVO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * this method is constructor. and including object's parameter initialization.
	 */
	public SecondGoalVO(Integer second_num, Integer second_m_num, String second_content, Integer second_mem_num,
			Date second_createDate, Date second_updateDate, Integer second_good) {
		super();
		this.second_num = second_num;
		this.second_m_num = second_m_num;
		this.second_content = second_content;
		this.second_mem_num = second_mem_num;
		this.second_createDate = second_createDate;
		this.second_updateDate = second_updateDate;
		this.second_good = second_good;
	}
	
	//----------------------getter and setter----------------------------
	
	public Integer getSecond_num() {
		return second_num;
	}

	public void setSecond_num(Integer second_num) {
		this.second_num = second_num;
	}

	public Integer getSecond_m_num() {
		return second_m_num;
	}

	public void setSecond_m_num(Integer second_m_num) {
		this.second_m_num = second_m_num;
	}

	public String getSecond_content() {
		return second_content;
	}

	public void setSecond_content(String second_content) {
		this.second_content = second_content;
	}

	public Integer getSecond_mem_num() {
		return second_mem_num;
	}

	public void setSecond_mem_num(Integer second_mem_num) {
		this.second_mem_num = second_mem_num;
	}

	public Date getSecond_createDate() {
		return second_createDate;
	}

	public void setSecond_createDate(Date second_createDate) {
		this.second_createDate = second_createDate;
	}

	public Date getSecond_updateDate() {
		return second_updateDate;
	}

	public void setSecond_updateDate(Date second_updateDate) {
		this.second_updateDate = second_updateDate;
	}

	public Integer getSecond_good() {
		return second_good;
	}

	public void setSecond_good(Integer second_good) {
		this.second_good = second_good;
	}

	//----------------------getter and setter----------------------------
	
	@Override
	public String toString() {
		return "--------------------------------------------------------------------------------\n"
				+ "SecondGoalVO [second_num=" + second_num + ", second_m_num=" + second_m_num + ", second_content="
				+ second_content + ", second_mem_num=" + second_mem_num + ", second_createDate=" + second_createDate
				+ ", second_updateDate=" + second_updateDate + ", second_good=" + second_good + "]\n"
				+ "--------------------------------------------------------------------------------\n";
	}
}
