package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao  implements ProductDao{
/*JDBC nedir?
Java JDBC (Java DataBase Connectivity) MySQL, Oracle, MS SQL Server gibi 
veritabanlarýna baðlanmak veri çekme, listeleme, ekleme, silme, güncelleme
gibi iþlemleri yapmak için kullanýlan pakettir.*/
	
	public void add(Product product) {
	//Bu katmana sadece db eriþim kodlarý yazýlýr
	System.out.println("JDBC ile veritabanýna eklendi");
	}
	
			
}
