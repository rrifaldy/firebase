package com.example.firabase;

public class bukuData {

    private String judul;
    private String penulis;

    public bukuData(){}

    public bukuData(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
