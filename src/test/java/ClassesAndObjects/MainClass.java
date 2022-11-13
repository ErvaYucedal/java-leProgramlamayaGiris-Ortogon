package ClassesAndObjects;

public class MainClass {
    public static void main(String[] args) {

        Araba ahmetinArabasi=new Araba();

        Araba benimArabam=new Araba("kirmizi",5,true);
        /*
        kapsullemeden once
        benimArabam.benzinli=false;
        benimArabam.calisiyor=false;
        benimArabam.kapasite=4;
        benimArabam.renk="beyaz";
        */

        benimArabam.setBenzinli(true);
        benimArabam.setKapasite(5);
        benimArabam.setRenk("mavi");

        benimArabam.calistir();
        benimArabam.hizlandir(30);
        benimArabam.hizlandir(30);
        benimArabam.bilgiAl();

        benimArabam.yavaslat(20);
        benimArabam.bilgiAl();
        benimArabam.yavaslat(20);
        benimArabam.bilgiAl();

        benimArabam.yavaslat(20);
        benimArabam.durdur();
        benimArabam.bilgiAl();


    Otobus bursaAnkara=new Otobus();
    bursaAnkara.aktif=true;
    bursaAnkara.kapasite=20;
    bursaAnkara.nereden="Bursa";
    bursaAnkara.nereye="Ankara";

        for (int i = 0; i < 30; i++) {
            bursaAnkara.yolcuAl();
        }
        bursaAnkara.bilgiAl();
        bursaAnkara.yolcuCikart();
        bursaAnkara.yolcuCikart();
        bursaAnkara.yolcuCikart();
        bursaAnkara.bilgiAl();


        OrtalamaHesaplayici hesaplayici=new OrtalamaHesaplayici();
        System.out.println(hesaplayici.hesapla(123.44, 56.34, 45));
    }
}
