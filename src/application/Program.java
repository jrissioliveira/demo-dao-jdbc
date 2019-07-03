package application;

import java.util.List;
import java.util.Locale;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import modal.entities.Department;
import modal.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj + "\n");
		}
		
		System.out.println("\n=== TEST 3: seller findByDepartment ===");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj + "\n");
		}
		
	}

}
