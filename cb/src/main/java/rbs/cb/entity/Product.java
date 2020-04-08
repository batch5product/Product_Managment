package rbs.cb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product_details")
public class Product {
@Id
@GeneratedValue
private int product_id;

@Column(name="product_name")
private String product_name;



@Column(name="expiry_date")
private String product_exp;

@Column(name="product_price")
private int product_price;


public int getProduct_price() {
	return product_price;
}

public void setProduct_price(int product_price) {
	this.product_price = product_price;
}

public String getProduct_exp() {
	return product_exp;
}

public void setProduct_exp(String product_exp) {
	this.product_exp = product_exp;
}

public int getProduct_id() {
	return product_id;
}

public void setProduct_id(int product_id) {
	this.product_id = product_id;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}


}
