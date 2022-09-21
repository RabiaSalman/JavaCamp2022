package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Word");
		
		//deðiþken isimleri java'da camelCase yazýlýr
		String ortaMetin="Ýlginizi Çekebilir";
		String altMetin="Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		
		int vade=12;
		double dolarDun=18.20;
		double dolarBugun=18.20;
		boolean dolarDustuMu=true;
		
		String okYonu="";
		
		//Þart bloklarý
		if(dolarBugun<dolarDun) {//true
		 okYonu="down.svg";
	     System.out.println(okYonu);
			
		}
		else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
		    System.out.println(okYonu);	
		}
		
		else {

			okYonu="equal.svg";
		    System.out.println(okYonu);
		   }
		
		
		String[] krediler= {"Hýzý Kredi","Maaþýný Halbanktan Alanlar","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		

	}

}
