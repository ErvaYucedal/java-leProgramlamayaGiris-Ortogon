package ClassesAndObjects;

public class Otobus {

    int kapasite;
    String nereden;
    String nereye;
    int kaydedilenYolcu;

    boolean aktif;

    public void yolcuAl(){
        if(aktif){

        if(kaydedilenYolcu>=kapasite){
            System.out.println("otobus doldu");
        } else{
            kaydedilenYolcu++;
        }
    }else {
            System.out.println("otobus garajda");}}





    public void yolcuCikart(){
        if (kaydedilenYolcu>0){
            kaydedilenYolcu--;
        }
}

public void bilgiAl(){
    System.out.println("kapasite: " + kapasite);
    System.out.println("kaydedilen yolcu: " + kaydedilenYolcu);
    System.out.println("nereden: " + nereden);
    System.out.println("nereye: " + nereye);
    if (aktif) System.out.println("otobus aktif");
    else System.out.println("otobus pasif");
}}
