package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao  implements ProductDao{
/*JDBC nedir?
Java JDBC (Java DataBase Connectivity) MySQL, Oracle, MS SQL Server gibi 
veritabanlar�na ba�lanmak veri �ekme, listeleme, ekleme, silme, g�ncelleme
gibi i�lemleri yapmak i�in kullan�lan pakettir.*/
	
	public void add(Product product) {
	//Bu katmana sadece db eri�im kodlar� yaz�l�r
	System.out.println("JDBC ile veritaban�na eklendi");
	}
	
			
}
