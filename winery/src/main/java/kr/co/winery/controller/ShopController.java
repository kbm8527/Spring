package kr.co.winery.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.winery.vo.MemberVo;
import kr.co.winery.vo.TermsVo;
import kr.co.winery.persistence.MemberRepo;
import kr.co.winery.persistence.TermsRepo;


@Controller
public class ShopController {


	@GetMapping("/shop/list")
	public String list() {
		
		
		
		
		return "/shop/list";
	}
	
	@GetMapping("/shop/view")
	public String view() {
		
		
		
		
		return "/shop/view";
	}
	
	@GetMapping("/shop/winelist")
	public String winelist() {
		
		
		
		
		return "/shop/winelist";
	}
	
	@GetMapping("/shop/wineview")
	public String wineview() {
		
		
		
		
		return "/shop/wineview";
	}
	
	@GetMapping("/shop/order")
	public String order() {
		
		
		
		
		return "/shop/order";
	}
	
	@GetMapping("/shop/payment")
	public String payment() {
		
		
		
		
		return "/shop/payment";
	}
	
	
}
