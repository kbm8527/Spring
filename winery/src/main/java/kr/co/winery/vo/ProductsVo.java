package kr.co.winery.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "w_products")
public class ProductsVo {

	@Id
	private int code;
	private int cate1;
	private int cate2;
	private String member_name;
	private String descript;
	private String company;
	private int price;
	private int discount;
	private int point;
	private int stock;
	private int delivery;
	private String thumb1;  
	private String thumb2;
	private String thumb3;
	private String detail;
	private String status;
	private String dutyFree;
	private String receipt;
	private String bizClass;
	private String origin;
	private String ip;
	private String rdate;
	
	
}
