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

    public boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - getBaris());
        int selisihKolom = Math.abs(kolomTujuan - getKolom());

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
