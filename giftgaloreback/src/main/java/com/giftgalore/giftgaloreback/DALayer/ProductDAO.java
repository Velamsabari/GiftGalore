
package com.giftgalore.giftgaloreback.DALayer;

import java.util.List;

import com.giftgalore.giftgaloreback.model.Category;
import com.giftgalore.giftgaloreback.model.Product;

public interface ProductDAO {
	
	boolean CreateProduct(Product product);
	boolean UpdateProduct(Product product);
	boolean DeleteProduct(Product product);
	Product SelectProduct(int Product_id);
	List<Product> SelectAllProduct();
	List<Product> SelectCatProduct(String Category_Name);


}




