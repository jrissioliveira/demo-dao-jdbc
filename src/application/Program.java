package application;

import java.util.Date;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import modal.entities.Department;
import modal.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail", new Date(), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
	}

}
