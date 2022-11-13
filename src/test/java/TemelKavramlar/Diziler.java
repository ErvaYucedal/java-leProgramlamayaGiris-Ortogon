package TemelKavramlar;

public class Diziler {

    public static void main(String[] args) {
/*
// DİZİLER

        int tamsayilar[]= new int[5];

        for (int i = 0; i < tamsayilar.length; i++) {
            System.out.println("index: " + i + "deger: " + tamsayilar[i]);
        }

        System.out.println("---------------------------------");
        String [] isimler= new String[5];
        isimler[0]="erva";
        isimler[1]="sila";
        isimler[2]="ayse";
        isimler[3]="fatma";
        isimler[4]="zeynep";

        for (int i = 0; i< stringler.length; i++) {
            System.out.println("index: " + i + "deger: " + stringler[i]);
        }


        for (String isim:isimler) {
            System.out.println(isim);

        }    */

        // COK BOYUTLU DIZILER
        String [][] ilceler=new String[3][];

        //istanbul
        ilceler[0]=new String[]{"kadikoy", "besiktas", "uskudar"};

        // ankara
        ilceler[1]=new String[]{"cankaya", "gop"};

        //bursa
        ilceler[2]=new String[]{"gemlik", "nilufer","ogazi"};

        for (int i = 0; i < ilceler.length; i++) {
            switch (i){
            case 0:
                System.out.println("istanbul:");
                break;
                case 1:
                    System.out.println("Ankara");
                    break;
                case 2:
                    System.out.println("bursa");
                    break;
                default:
                    break;
        }
            System.out.println("-----------------");
            for (int j = 0; j < ilceler[i].length; j++) {
                System.out.println(ilceler[i][j]);
                
            }
        }


        // asagidaki kod java.lang.ArrayIndexOutOfBoundsException hatasi olusturr
        // System.out.println(ilceler[4][5]);
    }
}
