package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	
	public void add(Product product) {
		//Bu katmana sadece db eri�im kodlar� yaz�l�r
		System.out.println("Hibernate ile veritaban�na eklendi");
		}
	

}
