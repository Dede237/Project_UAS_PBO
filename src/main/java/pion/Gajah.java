package pion;

import papan.Papan;

public class Gajah extends Pion{
    public Gajah(int baris, int kolom, boolean warna) {
        super(baris, kolom, warna);
        if (warna) {
            setTampilan("gp");
        } else {
            setTampilan("gh");
        }
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - baris);
        int selisihKolom = Math.abs(kolomTujuan - kolom);

        if (selisihBaris == selisihKolom) {
            return true;
        } else {
            return false;
        }
    }
}
