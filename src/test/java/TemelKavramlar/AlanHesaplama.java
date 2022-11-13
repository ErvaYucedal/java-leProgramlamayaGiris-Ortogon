package TemelKavramlar;

import java.util.Scanner;

public class AlanHesaplama {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Cember / Daire --> 0/1");

        int secim=sc.nextInt();

        if (secim==0){
            System.out.println("Yari cap?");
        int yaricap=sc.nextInt();
            System.out.println("Dairenin alani" + (yaricap*yaricap*Math.PI));
        } else{
            System.out.println("1.kenar?");
            int kenar1=sc.nextInt();

            System.out.println("2.kenar?");
            int kenar2=sc.nextInt();

            System.out.println("Dikdortgenin alani \n" + (kenar1*kenar2));

        }
    }
}
