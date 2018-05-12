/**
 * This Class is VO.
 * VO look like DB table that is member.
 * You can use this class by box of data. when you connect DB.
 */
package com.yumemoto.yumeapp.dbDomain;

import java.util.Date;

public class MemberVO {

	private Integer m_num;		//It is primary key.
	private String m_id;		//It is Member's ID.
	private String m_name;		//It is Member Name.
	private String m_mail;		//It is Member's mail.
	private String m_pwd;		//it is Member's password.
	private String m_celphone;	//It is Member's celPhone.
	private Date m_birth;		//It is Member's birthday.
	
	/**
	 * this method is constructor. 
	 * You can use when you need object of MemberVO without parameter's initialization.
	 * 
	 */
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * this method is constructor. and including object's parameter initialization.
	 */
	public MemberVO(Integer m_num, String m_id, String m_name, String m_mail, String m_pwd, String m_celphone,
			Date m_birth) {
		super();
		this.m_num = m_num;
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_mail = m_mail;
		this.m_pwd = m_pwd;
		this.m_celphone = m_celphone;
		this.m_birth = m_birth;
	}
	
	//----------------------getter and setter----------------------------
	
	public Integer getM_num() {
		return m_num;
	}

	public void setM_num(Integer m_num) {
		this.m_num = m_num;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_mail() {
		return m_mail;
	}

	public void setM_mail(String m_mail) {
		this.m_mail = m_mail;
	}

	public String getM_pwd() {
		return m_pwd;
	}

	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}

	public String getM_celphone() {
		return m_celphone;
	}

	public void setM_celphone(String m_celphone) {
		this.m_celphone = m_celphone;
	}

	public Date getM_birth() {
		return m_birth;
	}

	public void setM_birth(Date m_birth) {
		this.m_birth = m_birth;
	}

	//----------------------getter and setter----------------------------	
	
	@Override
	public String toString() {
		return "--------------------------------------------------------------------------------------------------------------"
				+ "MemberVO [m_num=" + m_num + ", m_id=" + m_id + ", m_name=" + m_name + ", m_mail=" + m_mail + ", m_pwd="
				+ m_pwd + ", m_celphone=" + m_celphone + ", m_birth=" + m_birth + "]"
				+ "--------------------------------------------------------------------------------------------------------------";
	}

}
