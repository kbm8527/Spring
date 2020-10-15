package kr.co.winery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.winery.dao.MemberDao;
import kr.co.winery.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	
	public MemberVo selectMember(MemberVo vo) {
		
		return dao.selectMember(vo);
	}
	
}
