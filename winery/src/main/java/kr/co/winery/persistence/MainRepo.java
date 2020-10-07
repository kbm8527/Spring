package kr.co.winery.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.winery.vo.Category1Vo;

@Repository
public interface MainRepo extends JpaRepository<Category1Vo, Integer> {

}
