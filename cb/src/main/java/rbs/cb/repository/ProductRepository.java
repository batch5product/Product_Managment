package rbs.cb.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rbs.cb.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	
	@Query("SELECT c FROM Product c WHERE c.product_name LIKE %:product_name%")
	List<Product> searchbyname(@Param("product_name") String product_name);
	


}
