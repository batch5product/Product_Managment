package rbs.cb.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import rbs.cb.entity.Product;
import rbs.cb.pojo.ProductPojo;
import rbs.cb.repository.ProductRepository;

@Service("productservice")
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrep;

	@Override
	public ProductPojo save(ProductPojo productpojo) {

		Product product = new Product();
		product.setProduct_name(productpojo.getProduct_name());
		product.setProduct_price(productpojo.getProduct_price());
		product.setProduct_exp(productpojo.getProduct_exp());
		productrep.save(product);
		productpojo.setProduct_id(product.getProduct_id());

		return productpojo;
	}

	
	
	@Override
	public List<ProductPojo> list() {

		List<ProductPojo> productpojolist = new ArrayList<ProductPojo>();

		List<Product> productlist = productrep.findAll();
	
		for (Product product : productlist) {
			ProductPojo productpojo = new ProductPojo();
			
			productpojo.setProduct_name(product.getProduct_name());

			productpojo.setProduct_id(product.getProduct_id());

			productpojo.setProduct_price(product.getProduct_price());
			productpojo.setProduct_exp(product.getProduct_exp());
		
			productpojolist.add(productpojo);
		}
		return productpojolist;

	}


	@Override
	public ProductPojo get(int product_id) {
		Product product = productrep.getOne(product_id);
		ProductPojo productpojo = new ProductPojo();
		productpojo.setProduct_name(product.getProduct_name());
		productpojo.setProduct_id(product.getProduct_id());

		productpojo.setProduct_exp(product.getProduct_exp());
		productpojo.setProduct_price(product.getProduct_price());
		return productpojo;
	}

	@Override
	public void update(ProductPojo productpojo) {
		
		Product product = new Product();
		product.setProduct_name(productpojo.getProduct_name());
		product.setProduct_id(productpojo.getProduct_id());
		product.setProduct_price(productpojo.getProduct_price());	
		product.setProduct_exp(productpojo.getProduct_exp());	

		productrep.save(product);
		
	}

	@Override
	public void deleteProduct(int product_id) {
		productrep.deleteById(product_id);

		
	}

	

	
	@Override
	public List<ProductPojo> list1(String product_name) {

		List<ProductPojo> productpojolist = new ArrayList<ProductPojo>();
		
		List<Product> productlist = productrep.searchbyname(product_name);

		for (Product product : productlist) {
			ProductPojo productpojo = new ProductPojo();
			
			productpojo.setProduct_name(product.getProduct_name());

			productpojo.setProduct_id(product.getProduct_id());

			productpojo.setProduct_price(product.getProduct_price());
			productpojo.setProduct_exp(product.getProduct_exp());
		
			productpojolist.add(productpojo);
		}
		

		return productpojolist;

	}
	
	


	
}
	
	
	
	

