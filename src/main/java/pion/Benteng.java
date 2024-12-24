package pion;

import papan.Papan;

public class Benteng extends Pion{
    public Benteng(int baris, int kolom, boolean warna) {
        super(baris, kolom, warna);
        if (warna) {
            setTampilan("bp");
        } else {
            setTampilan("bh");
        }
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papn) {
        int selisihBaris = Math.abs(barisTujuan - baris);
        int selisihKolom = Math.abs(kolomTujuan - kolom);
        if (selisihBaris == 0 && selisihKolom != 0 || selisihBaris != 0 && selisihKolom == 0) {
            return true;
        } else {
            return false;
        }
    }
}
