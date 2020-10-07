package kr.co.winery.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="w_terms")
public class TermsVo {

	@Id  // id값 지정안해주니 어노테이션 익셉션 에러
	private int seq;
	private String terms;
	private String privacy;
	private String location;
	private String finance;
	private String tax;
	
}
