package kr.co.kmarket.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.ProductsCartVo;
import kr.co.kmarket.vo.ProductsOrderVo;
import kr.co.kmarket.vo.TermsVo;

@Repository
public interface ProductsCartRepo extends JpaRepository<ProductsCartVo, Integer> {

}
