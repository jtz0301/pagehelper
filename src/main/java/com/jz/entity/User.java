package com.jz.entity;

public class User {
	
	
	private int id;
	private String code;
	private String name;
	private String phone;
	private String pwd;
	private int score;
	private String salt;
	private String openId;
	private int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String code, String name, String phone, String pwd, int score, String salt, String openId,
			int age) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.pwd = pwd;
		this.score = score;
		this.salt = salt;
		this.openId = openId;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", code=" + code + ", name=" + name + ", phone=" + phone + ", pwd=" + pwd + ", score="
				+ score + ", salt=" + salt + ", openId=" + openId + ", age=" + age + "]";
	}
	

}
