package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Word");
		
		//de�i�ken isimleri java'da camelCase yaz�l�r
		String ortaMetin="�lginizi �ekebilir";
		String altMetin="Vade S�resi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		
		int vade=12;
		double dolarDun=18.20;
		double dolarBugun=18.20;
		boolean dolarDustuMu=true;
		
		String okYonu="";
		
		//�art bloklar�
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
		
		
		String[] krediler= {"H�z� Kredi","Maa��n� Halbanktan Alanlar","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		

	}

}
