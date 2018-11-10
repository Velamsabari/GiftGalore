package com.giftgalore.giftgaloreback.DALayer;

import java.util.List;

import com.giftgalore.giftgaloreback.model.Address;
import com.giftgalore.giftgaloreback.model.UserDetails;

public interface AddressDAO {

	boolean CreateAddress(Address address);
	boolean UpdateAddress(Address address);
	boolean DeleteAddress(Address address);
	Address SelectoneAddress(int addressid);
	List<Address> SelectallAddress(int cartid);


}
