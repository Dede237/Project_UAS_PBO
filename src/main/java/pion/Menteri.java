package pion;

import papan.Papan;

public class Menteri extends Pion{
    public Menteri(int baris, int kolom, boolean warna) {
        super(baris, kolom, warna);
        if (warna) {
            setTampilan("mp");
        } else {
            setTampilan("mh");
        }
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - baris);
        int selisihKolom = Math.abs(kolomTujuan - kolom);
        if (selisihBaris == selisihKolom) {
            return true;
        } else if (selisihBaris == 0 && selisihKolom != 0) {
            return true;
        } else if (selisihBaris != 0 && selisihKolom == 0) {
            return true;
        } else {
            return false;
        }
    }
}
