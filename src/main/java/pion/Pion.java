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
    
    public boolean validasi(int barisTujuan, int kolomTujuan, Papan papan) {
        if (validasi1(barisTujuan, kolomTujuan, papan) && validasi2(barisTujuan, kolomTujuan, papan) && validasi3(barisTujuan, kolomTujuan, papan)) {
            return true;
        } else {
            return false;
        }
    }

    public abstract boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan);

    public boolean validasi2(int barisTujuan, int kolomTujuan, Papan papan) {
        if (!getWarna().equals(papan.getPion(barisTujuan, kolomTujuan).getWarna())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validasi3(int barisTujuan, int kolomTujuan, Papan papan) {
        return true;
    }

    public void bergerak(Papan papan, int barisTujuan, int kolomTujuan) {
        papan.merubahPosisi(baris, kolom, barisTujuan, kolomTujuan);
    }
}
