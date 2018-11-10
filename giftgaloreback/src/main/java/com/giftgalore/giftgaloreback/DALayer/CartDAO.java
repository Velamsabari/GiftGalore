
package com.giftgalore.giftgaloreback.DALayer;

import java.util.List;

import com.giftgalore.giftgaloreback.model.Cart;


public interface CartDAO {
	
	boolean CreateCart(Cart cart);
	boolean UpdateCart(Cart cart);
	boolean DeleteCart(int id);
	List<Cart> ViewCart(int cartid);
}





