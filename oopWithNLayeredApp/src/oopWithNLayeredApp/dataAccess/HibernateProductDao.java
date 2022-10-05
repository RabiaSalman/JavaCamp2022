package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	
	public void add(Product product) {
		//Bu katmana sadece db eriþim kodlarý yazýlýr
		System.out.println("Hibernate ile veritabanýna eklendi");
		}
	

}
