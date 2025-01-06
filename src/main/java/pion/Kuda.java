package pion;

import papan.Papan;

public class Kuda extends Pion{
    public Kuda(int baris, int kolom, String warna) {
        super(baris, kolom, warna);
        if (warna.equals("putih")) {
            setTampilan("kp");
        } else {
            setTampilan("kh");
        }
    }

    public boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - getBaris()); 
        int selisihKolom = Math.abs(kolomTujuan - getKolom());

        if (selisihBaris == 1 && selisihKolom == 2 || selisihBaris == 2 && selisihKolom == 1) {
            return true;
        } else {
            return false;
        }
    }
}
