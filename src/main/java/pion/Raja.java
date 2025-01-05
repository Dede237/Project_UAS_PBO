package pion;

import papan.Papan;

public class Raja extends Pion{
    public Raja(int baris, int kolom, String warna) {
        super(baris, kolom, warna);
        if (warna.equals("putih")) {
            setTampilan("rp");
        } else {
            setTampilan("rh");
        }
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - baris);
        int selisihKolom = Math.abs(kolomTujuan - kolom);

        if (selisihBaris == 1 && selisihKolom == 0) {
            return true;
        } else if (selisihBaris == 0 && selisihKolom == 1) {
            return true;
        } else if (selisihBaris == 1 && selisihKolom == 1) {
            return true;
        } else {
            return false;
        }
    }
}
