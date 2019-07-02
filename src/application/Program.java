package application;

import java.util.Locale;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import modal.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
	}

}
