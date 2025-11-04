/*
* Ad Soyad: EZGİ EFSA GÜLEÇ
* Ogrenci No: 250541023
* Tarih: 24.10.2025
* Aciklama: MAAŞ BORDROSU
* Bu program çalışanın bilgilerini ve
* maaş bilgilerini alır ,
* gelirler ve kesintileri hesaplayarak
* net maası ve istatistikleri gösterir.
*/

import java.util.Scanner;

public class MaasBordrosu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//sabitler(final)
		final double SGK_ORANI = 0.14;
		final double GELIR_VERGISI_ORANI = 0.15;
		final double DAMGA_VERGISI_ORANI = 0.00759;
		
		//kullanıcıdan bilgi alın 
		System.out.print("Çalışan Adı Soyadı: ");
		String adSoyad = input.nextLine();
		
		System.out.print("Aylık Brüt Maaş(TL): ");
		double brutMaas = input.nextDouble();
		
		System.out.print("Haftalık Çalışma Saati: ");
		double haftalikCalismaSaati = input.nextInt();
		
		System.out.print("Mesai Saati Sayısı: ");
		int mesaiSaati = input.nextInt();
		
		
		// hesaplamalar
		double mesaiUcreti = (brutMaas / 160)* mesaiSaati*1.5;
		double toplamGelir = brutMaas + mesaiUcreti;
		
		double sgk = toplamGelir * SGK_ORANI;
		double gelirVergisi = toplamGelir* GELIR_VERGISI_ORANI;
		double damgaVergisi = toplamGelir* DAMGA_VERGISI_ORANI;
		double toplamKesinti = sgk + gelirVergisi +damgaVergisi;
		
		double netMaas = toplamGelir - toplamKesinti;
		
		//istatistikler
		double kesintiOrani = (toplamKesinti/ toplamGelir) * 100;
		double saatlikNetKazanc = netMaas / 176;
		double gunlukNetKazanc = netMaas / 22;
		
		//çıktı
		System.out.println("\n=========================");
		System.out.println("  MAAŞ BORDROSU RAPORU    ");
		System.out.println("=========================");
		System.out.println("Çalışan: "+ adSoyad);
		
		System.out.println("\nGELIRLER:  ");
		System.out.printf("  Brüt Maaş                :  %.2f TL%n", brutMaas);
		System.out.printf("  Mesai Ücreti (10 Saat)   :  %.2f TL%n", mesaiUcreti);
		System.out.println("-----------------------------");
		System.out.printf("  TOPLAM GELİR             :  %.2f TL%n", toplamGelir);
		
		System.out.println("\nKESİNTİLER:  ");
		System.out.printf("  SGK Kesintisi(14.0%%)              :  %.2f TL%n ", sgk);
		System.out.printf(" Gelir Vergisi (15.0%%)    :  %.2f TL%n", gelirVergisi);
		System.out.printf("  Damga Vergisi (0.8%%)     :  %.2f TL%n", damgaVergisi);
		System.out.println("-----------------------------");
		System.out.printf("  TOPLAM KESİNTİ           :  %.2f TL%n " , toplamKesinti);
		System.out.println("-----------------------------");
		System.out.printf("NET MAAŞ                   :  %.2f TL%n ", netMaas);
		System.out.println("=============================");
		System.out.println( "\nİSTATİSTİKLER:  ");
		System.out.printf("  Kesinti Oranı             : %.2f TL%n", kesintiOrani);
		System.out.printf("  Saatlik Net Kazanç        : %.2f TL%n", saatlikNetKazanc);
		System.out.printf("  Günlük Net Kazanç         : %.2f TL%n", gunlukNetKazanc);
		System.out.println("\n=========================");
		
		
		
		input.close();	
	}
	
}
