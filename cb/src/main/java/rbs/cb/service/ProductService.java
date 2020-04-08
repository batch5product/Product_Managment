package rbs.cb.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import rbs.cb.pojo.ProductPojo;
@Repository
public interface ProductService {

	ProductPojo save(ProductPojo productpojo);

	List<ProductPojo> list();

	ProductPojo get(int id);
	
	void update(ProductPojo product);

	void deleteProduct(int id);

	List<ProductPojo> list1(String product_name);


	

	

}
