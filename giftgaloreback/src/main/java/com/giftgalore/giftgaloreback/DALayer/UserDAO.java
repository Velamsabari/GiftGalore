package com.giftgalore.giftgaloreback.DALayer;

import com.giftgalore.giftgaloreback.model.UserDetails;

public interface UserDAO {

	boolean CreateUserDetails(UserDetails userdetails);
	boolean UpdateUserDetails(UserDetails userdetails);
	boolean DeleteUserDetails(UserDetails userdetails);
	UserDetails SelectUser(String Emailid);


}
