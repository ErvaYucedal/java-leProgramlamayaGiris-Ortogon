package TemelKavramlar;

import java.util.Scanner;

public class SwitchIfadesi {

    public static void main(String[] args) {

        System.out.println("Menuden bir secenek seciniz:");

        System.out.println("1-->Magazalar;  2-->Urunler  3-->Personel");


        Scanner sc=new Scanner(System.in);

        int girdi=sc.nextInt();

        switch (girdi){
            case 1:
                System.out.println("Seciminiz:Magazalar");
                break;
            case 2:
                System.out.println("Seciminiz: Urunler");
                break;
            case 3:
                System.out.println("Seciminiz: Personel");
                break;
            default:
                break;
        }
        System.out.println("program bitti");

    }
}
