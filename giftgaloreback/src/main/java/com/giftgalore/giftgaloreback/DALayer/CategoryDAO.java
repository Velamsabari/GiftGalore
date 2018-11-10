
package com.giftgalore.giftgaloreback.DALayer;

import java.util.List;

import com.giftgalore.giftgaloreback.model.Category;


public interface CategoryDAO {
	
	boolean CreateCategory(Category c);
	boolean UpdateCategory(Category category);
	boolean DeleteCategory(Category category);
	List<Category> ViewAllCategory();
	Category ViewOneCategory(String category_Name);


}





