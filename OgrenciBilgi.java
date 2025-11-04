/*
* Ad Soyad: EZGİ EFSA GÜLEÇ
* Ogrenci No: 250541023
* Tarih: 24.10.2025
* Aciklama: ÖĞRENCİ BİLGİ
* 
* Bu program kullanıcıdan öğrenci 
 alır ve düzenli bir formatta ekrana yazdırır.
*/

import java.util.Scanner;

public class OgrenciBilgi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// yazdırma
		System.out.println("Ad: ");
		String ad = input.next();

		System.out.println("Soyad: ");
		String soyad = input.next();

		System.out.println("Öğrenci Numarası: ");
		int ogrenciNumarasi = input.nextInt();

		System.out.println("Yas: ");
		int yas = input.nextInt();

		System.out.println("GPA (0.00 - 4.00): ");
		double gpa = input.nextDouble();

		// çalıştırma
		System.out.println("\n--- Öğrenci Bilgileri ---");
		System.out.println(" ");
		System.out.printf(" Ad Soyad  :%s %s%n", ad, soyad);
		System.out.printf(" Numara    :%d %n ", ogrenciNumarasi);
		System.out.printf("Yas       :%d %n", yas);
		System.out.printf(" GPA       :%.2f%n", gpa);

		input.close();

	}
}
