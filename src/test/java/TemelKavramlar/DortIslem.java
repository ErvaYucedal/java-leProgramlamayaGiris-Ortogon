package TemelKavramlar;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DortIslem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(true){

        System.out.println("islem seciniz:");
        System.out.println("0 --> carp, 1-->böl, 2-->topla 3-->cikart");

        double input=sc.nextInt();

        System.out.println("1. sayiyi giriniz");
        double sayi1=sc.nextInt();

        System.out.println("2. sayiyi giriniz");
        double sayi2=sc.nextInt();

        if (input==0){
            System.out.println("Carpma:" + (sayi1*sayi2));
        } else if (input==1){
            System.out.println("bolme:" + (sayi1/sayi2));}
        else if (input==2){
            System.out.println("toplama:" + (sayi1+sayi2));
        }
        else {
            System.out.println("cikarma:" + (sayi1 - sayi2));
        }
        System.out.println("devam etmek ister misiniz? 0-->evet, 1-->hayir");
        input=sc.nextInt();
        if(input!=0){
            break;
    }
}
        System.out.println("güle güle...");
    }

}