package TemelKavramlar;

import java.util.Scanner;

public class KonsolGirdi {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String input=sc.nextLine();
        System.out.println("Merhaba " + input);
        System.out.println("Yasiniz nedir? ");
        int yas=sc.nextInt();
        System.out.println("Yasiniz " + yas +" dir.");

    }
}
