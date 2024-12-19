package pion;

import papan.Papan;

public abstract class Pion {
    private int baris;
    private int kolom;
    private String tampilan;
    private boolean putih;

    public Pion(int baris, int kolom, boolean putih) {
        this.baris = baris;
        this.kolom = kolom;
        this.tampilan = "";
    }

    public int getBaris() {
        return baris;
    }

    public void setBaris(int baris) {
        this.baris = baris;
    }

    public int getKolom() {
        return kolom;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    public String getTampilan() {
        return tampilan;
    }

    public void setTampilan(String tampilan) {
        this.tampilan = tampilan;
    }
    
    public abstract boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan);

    public void bergerak(Papan papan, int barisTujuan, int kolomTujuan) {
        if (validasi1(baris, kolom, barisTujuan, kolomTujuan)) {
            papan.merubahPosisi(baris, kolom, barisTujuan, kolomTujuan);
        } else {
            System.out.println("Posisi Tidak Valid");
        }
    }
}
