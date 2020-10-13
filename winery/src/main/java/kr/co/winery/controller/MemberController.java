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
public class MemberController {

	@Autowired
	private TermsRepo termsRepo;
	@Autowired
	private MemberRepo memberRepo;
	
	
	
	@GetMapping("/member/login")
	public String login() {
		
		
		
		return "/member/login";	
	}
	
	@GetMapping("/member/signup")
	public String signup(Model model) {
		
		
		TermsVo vo = termsRepo.findById(0).get(); 
		
		
		model.addAttribute(vo); // view와 공유
			
		
		return "/member/signup";
	}
	

	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	
	@PostMapping("/member/register")
	public String register(MemberVo vo, HttpServletRequest req) {
		
		//String pass = vo.getPass();
		
		//String encPass = pass; // 가공처리
		
		//vo.setPass(encPass);
		vo.setIp(req.getRemoteAddr());
		vo.setRdate(LocalDateTime.now().toString());
		
		memberRepo.save(vo); //insert문
		return "redirect:/member/login";
	}

	@GetMapping("/member/contact")
	public String contact() {
		return "/member/contact";
	}
	

	@GetMapping("/member/review")
	public String review() {
		return "/member/review";
	}
	
}
