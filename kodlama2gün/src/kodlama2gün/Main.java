package kodlama2gün;

public class Main {

	public static void main(String[] args) {

//		ders24
//		int[]sayılar= {1,2,5,7,9,6};
//		int aranacak=6;
//		boolean varMı=false;
//		
//		for (int sayı : sayılar) {
//			if(sayı==aranacak) {
//				varMı=true;
//				break;
//			}
//		}
//		String mesaj="";
//		if(varMı) {
//			mesaj="sayı mevcut"+aranacak;
//		mesajVer(mesaj);
//		}else {
//			System.out.println("sayı mevcut değildir="+aranacak);
//		}
//--------------------------------------------------------------------------------------------------------------
//		ders25
//		String sehir=sehirVer();
//		System.out.println(sehir);
//		System.out.println(topla(8, 7));
//------------------------------------------------------------------------------------------------------------
//		ders26
//		int topla2=topla1(1,2,3,4,5,6);
//		System.out.println(topla2);
//-------------------------------------------------------------------------------------------------------------

		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(2, 3));
		System.out.println(dortIslem.cikar(6, 3));
		System.out.println(dortIslem.carp(1, 1));
		System.out.println(dortIslem.bol(10, 1));
//-------------------------------------------------------------------------------------------------------------------------
		Product product = new Product(1, "Laptop", "Asus Bilgisayar", 7500, 3);
//		product.setId(1);
//		product.setName("laptop");
//		product.setDescription("Asus Bilgisayar");
//		product.setPrice(7500);
//		product.setStockAmount(3);
//		

		ProductManager productManager = new ProductManager();
		productManager.add(product);

	//	System.out.println(product.getKod());
//--------------------------------------------------------------------------------------------------------------------------------------------
//		ders35
//		System.out.println(topla1(2,3));
//		System.out.println(topla1(2,3,4));
//-----------------------------------------------------------------------------------------------------------------------------------------
		//Customer customer = new Customer();

		//Employee employee = new Employee();
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add();
	}

	// ders24
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

	// ders24
	public static String sehirVer() {
		return "Ankara";
	}

	// ders25
	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}

	// ders26
	public static int topla1(int... sayılar) {
		int toplam = 0;
		for (int sayı : sayılar) {
			toplam += sayı;
		}
		return toplam;
	}

	// ders35
	public static int topla1(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}

	public static int topla1(int sayı1, int sayı2, int sayı3) {
		return sayı1 + sayı2 + sayı3;
	}

}
