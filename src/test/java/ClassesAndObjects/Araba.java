package ClassesAndObjects;

public class Araba {

    //instance variables

    private String renk;
    private int kapasite;
    private boolean benzinli;

    private int hiz;
    private boolean calisiyor;




    // default constructor
    public Araba() {


    }

    //non- default constructor
    public Araba(String renk, int kapasite, boolean benzinTipi) {
        this.renk = renk;
        this.kapasite = kapasite;
        benzinli = benzinTipi;
    }


    public Araba(int kapasite, boolean benzinli, boolean calisiyor) {
        this.kapasite = kapasite;
        this.benzinli = benzinli;
        this.calisiyor = calisiyor;
    }

    public void calistir(){
    calisiyor=true;
    }

    public void durdur(){
        calisiyor=false;
        hiz=0;
    }

    public void hizlandir(){
        hiz+=10;

    }
    public void hizlandir(int kacKm){
        hiz+=kacKm;
    }

    public void yavaslat(){
        if(hiz>10){
            hiz-=10;
        }
        else{hiz=0;
        }
    }

    public void yavaslat(int kacKm){
        if(hiz>kacKm){
            hiz-=kacKm;
        }
        else{hiz=0;
    }}
    public void bilgiAl(){
        System.out.println("renk: "+ renk);
        System.out.println("kapasite: "+ kapasite);
        System.out.println("şu anki hızı: "+ hiz);
        if (benzinli) System.out.println( "benzinli");
        else System.out.println("dizel");
        System.out.println("calisiyor: "+ calisiyor);
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public boolean isBenzinli() {
        return benzinli;
    }

    public void setBenzinli(boolean benzinli) {
        this.benzinli = benzinli;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public boolean isCalisiyor() {
        return calisiyor;
    }

    public void setCalisiyor(boolean calisiyor) {
        this.calisiyor = calisiyor;
    }
}
