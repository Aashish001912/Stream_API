package com.aashish.FlatMap;

import java.util.Arrays;
import java.util.List;

class Product
{
	private Integer productId;
    private List<String>listOfProduct;
    
	public Product(Integer productId, List<String> listOfProduct)
	{
		super();
		this.productId = productId;
		this.listOfProduct = listOfProduct;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public List<String> getListOfProduct() {
		return listOfProduct;
	}
	public void setListOfProduct(List<String> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", listOfProduct=" + listOfProduct + "]";
	}
	
    
}
public class FlatMapDemo5 
{
	public static void main(String[] args) 
	{
	  List<Product> listOfProduct = Arrays.asList(new Product(1, Arrays.asList("camera","Mobile","Laptop")),
	  new Product(2, Arrays.asList("pen","Paper","Pencil")),
	  new Product(3, Arrays.asList("Bal","Ball","Pitch")));
	  List<String> list = listOfProduct.stream().flatMap(prod->prod.getListOfProduct().stream())
	  .toList();
	  System.out.println(list);
	}

}
