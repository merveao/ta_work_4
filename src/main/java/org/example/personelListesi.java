package org.example;

public class personelListesi {
    public static void main(String[] args){

        personel personel1 = new personel();
        personel personel2 = new personel();
        personel personel3 = new personel();

        personel1.isim ="Merve";
        personel1.soyisim = " Ozturk";
        personel1.departman = " Paketleme ";
        personel1.ID = 111;


        personel2.isim ="Sena";
        personel2.soyisim = " Sezer";
        personel2.departman =" Kalite ";
        personel2.ID = 112;


        personel3.isim ="Ayça";
        personel3.soyisim = " Akpınar";
        personel3.departman = " Üretim ";
        personel3.ID = 113;

        personel1.yazdir();
        personel2.yazdir();
        personel3.yazdir();

    }

}