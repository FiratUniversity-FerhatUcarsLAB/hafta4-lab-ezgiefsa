/*
* Ad Soyad: EZGİ EFSA GÜLEÇ
* Ogrenci No: 250541023
* Tarih: 24.10.2025
* Aciklama: GEOMETRİK HESAP
* Bu program kullanıcıdan dairenin 
* yarıcapını alır ve dairenin alanı,
* çevresi,capı ile küreye ait hacim 
* ve yüzey alanını hesaplar.
*
*/

import java.util.Scanner;

public class GeometrikHesap {
	public static void main (String[] args) {
		Scanner input= new Scanner(System.in);
		
		 // sabit değer tanımlama
		final double pi = 3.14159;
		
		 System.out.println("===Geometrik Hesaplayıcı===");
		 System.out.print("Dairenin yarıçapını girin (cm): ");
		 double yaricap = input.nextDouble();
		 
		 //hesaplamalar
		 
		 double alan = pi*yaricap*yaricap;
		 double cevre = 2* pi *yaricap;
		 double cap = 2* yaricap;
		 double hacim = 4.0/3.0 * pi * Math.pow(yaricap, 3);
		 double yuzeyalani = 4 * pi* yaricap* yaricap;
		 
		 //yazdırma
		 System.out.println("\nSonuclar");
		 System.out.println("==========");
		 System.out.printf("Daire Alanı:%.2f cm^2\n", alan);
		 System.out.printf("Dairenin Çevresi:%.2f cm\n", cevre);
		 System.out.printf("Dairenin Çapı:%.2f cm\n", cap);
		 System.out.printf("Dairenin Hacmi:%.2f cm^3\n", hacim);
		 System.out.printf("Dairenin Yüzeyalanı:%.2f cm^2\n", yuzeyalanı);
		 
		 
		 input.close();
		 	
	} 
	

}
