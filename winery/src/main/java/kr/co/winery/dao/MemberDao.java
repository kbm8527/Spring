package kr.co.winery.dao;

import org.springframework.stereotype.Repository;

import kr.co.winery.vo.MemberVo;

@Repository
public interface MemberDao {

	public MemberVo selectMember(MemberVo vo);
}
