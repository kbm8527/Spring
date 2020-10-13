package kr.co.winery.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.winery.vo.TermsVo;


@Repository
public interface TermsRepo extends JpaRepository<TermsVo, Integer> {

	
	
}
