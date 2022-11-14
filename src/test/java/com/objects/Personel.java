package com.main;

public class Personel {


    private String isim;
    private int yas;
    private String departman;

    public static int sayac;

    public Personel() {
        sayac++;

    }

    public Personel(String isim, int yas, String departman) {
        sayac++;
        this.isim = isim;
        this.yas = yas;
        this.departman = departman;
    }
    public static int nesnelerinSayisi(){

      return sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
