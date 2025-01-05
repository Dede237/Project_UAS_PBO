package pion;

import papan.Papan;

public abstract class Pion {
    private int baris;
    private int kolom;
    private String tampilan;
    private String warna;

    public Pion(int baris, int kolom, String warna) {
        this.baris = baris;
        this.kolom = kolom;
        this.warna = warna;
    }

    public void setBaris(int baris) {
        this.baris = baris;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getBaris() {
        return baris;
    }

    public int getKolom() {
        return kolom;
    }

    public String getTampilan() {
        return tampilan;
    }

    public void setTampilan(String tampilan) {
        this.tampilan = tampilan;
    }
    
    public abstract boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papan);

    public void bergerak(Papan papan, int barisTujuan, int kolomTujuan) {
        if (validasi1(baris, kolom, barisTujuan, kolomTujuan, papan)) {
            papan.merubahPosisi(baris, kolom, barisTujuan, kolomTujuan);
        } else {
            System.out.println("Posisi Tidak Valid");
        }
    }
}
