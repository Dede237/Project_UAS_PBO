package pion;

import papan.Papan;

public class Prajurit extends Pion{
    public Prajurit(int baris, int kolom, boolean warna) {
        super(baris, kolom, warna);
        if (warna) {
            setTampilan("pp");
        } else {
            setTampilan("ph");
        }
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = barisTujuan - baris;
        int selisihKolom = kolomTujuan - kolom;

        if (isWarna()) {
            System.out.println("test");
            if (baris == 6 && selisihBaris == -2 && selisihKolom == 0) {
                return true;
            } else if (selisihBaris == -1 && selisihKolom == 0) {
                return true;
            } else if (!papan.getPion(barisTujuan, kolomTujuan).isWarna() && selisihBaris == -1 && selisihKolom == 1) {
                return true;
            } else if (!papan.getPion(barisTujuan, kolomTujuan).isWarna() && selisihBaris == - 1 && selisihKolom == -1) {
                return true;
            } else {
                return false;
            }
        } else if (!isWarna()) {
            System.out.println("Test hitam");
            if (baris == 1 && selisihBaris == 2 && selisihKolom == 0) {
                return true;
            } else if (selisihBaris == 1 && selisihKolom == 0) {
                return true;
            } else if (papan.getPion(barisTujuan, kolomTujuan).isWarna() && selisihBaris == 1 && selisihKolom == 1) {
                return true;
            } else if (papan.getPion(barisTujuan, kolomTujuan).isWarna() && selisihBaris == 1 && selisihKolom == -1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
