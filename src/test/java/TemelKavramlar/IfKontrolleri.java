package TemelKavramlar;

import java.util.Scanner;

public class IfKontrolleri {
    public static void main(String[] args) {

        System.out.println("Yasinizi giriniz");
        Scanner sc=new Scanner(System.in);
        int yas=sc.nextInt();

        if (yas>=18){
            System.out.println("resitsiniz");
        }
        else{
            System.out.println("resit degilsiniz");
        }
        System.out.println("İsminizi giriniz");

        String isim=sc.nextLine();

    //    System.out.println((yas>=18));

   int x=15;
   int y=14;

         // if true  AND true --> true
        // if false AND true --> false

   if(x>15 && ++y==15){
       System.out.println("AND kontrole girildi");
    }

        System.out.println("y: " + y);


         // if true or false --> true
        // if true or true --> true
        // if false or false --> false


        if (x>15 || ++y==15){
            System.out.println("OR kontrolune girildi");
        }
    }
}
