package kr.co.winery.vo;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Setter
@Entity
@Table(name ="w_member")
public class MemberVo {
	
	private int type; //일반,판매자회원 나누기위해
	@Id
	private String member_id; 
	private String member_pw; 
	private String member_name; 
	private int gender; 
	private String member_hp; 
	private String member_email; 
	private int point; 
	private int grade; 
	private String zip; 
	private String addr1; 
	private String addr2;  
	private String birth_y; 
	private String birth_m; 
	private String birth_d; 
	private String ip; 
	private String rdate;
	private int del_yn;
	
}
