package pion;

import papan.Papan;

public class Kuda extends Pion{
    public Kuda(int baris, int kolom, boolean warna) {
        super(baris, kolom, warna);
        if (warna) {
            setTampilan("kp");
        } else {
            setTampilan("kh");
        }
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - baris); 
        int selisihKolom = Math.abs(kolomTujuan - kolom);
        if (selisihBaris == 1 && selisihKolom == 2 || selisihBaris == 2 && selisihKolom == 1) {
            return true;
        } else {
            return false;
        }
    }
}
