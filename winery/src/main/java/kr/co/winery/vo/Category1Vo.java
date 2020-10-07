package kr.co.winery.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="w_category1")
public class Category1Vo {

	@Id //code1=pk값 선언
	private int code1;
	private String title;
	
}
