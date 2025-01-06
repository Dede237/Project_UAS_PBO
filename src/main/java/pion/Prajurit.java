package pion;

import papan.Papan;

public class Prajurit extends Pion{
    public Prajurit(int baris, int kolom, String warna) {
        super(baris, kolom, warna);
        if (warna.equals("putih")) {
            setTampilan("pp");
        } else {
            setTampilan("ph");
        }
    }

    public boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = barisTujuan - getBaris();
        int selisihKolom = kolomTujuan - getKolom();

        if (getWarna().equals("putih")) {
            if (getBaris() == 6 && selisihBaris == -2 && selisihKolom == 0) {
                return true;
            } else if (selisihBaris == -1 && selisihKolom == 0) {
                return true;
            } else if (papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("hitam") && selisihBaris == -1 && selisihKolom == 1) {
                return true;
            } else if (papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("hitam") && selisihBaris == - 1 && selisihKolom == -1) {
                return true;
            } else {
                return false;
            }
        } else if (getWarna().equals("hitam")) {
            if (getBaris() == 1 && selisihBaris == 2 && selisihKolom == 0) {
                return true;
            } else if (selisihBaris == 1 && selisihKolom == 0) {
                return true;
            } else if (papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("putih") && selisihBaris == 1 && selisihKolom == 1) {
                return true;
            } else if (papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("putih") && selisihBaris == 1 && selisihKolom == -1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean validasi3(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = barisTujuan - getBaris();
        int selisihKolom = kolomTujuan - getKolom();

        if (getWarna().equals("putih") && selisihBaris == -1 && selisihKolom == 0 && !papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("kosong")) {
            return false;
        } else if (getWarna().equals("hitam") && selisihBaris == 1 && selisihKolom == 0 && !papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("kosong")) {
            return false;
        }

        if (getWarna().equals("putih") && getBaris() == 6 && selisihBaris == -2 && selisihKolom == 0) {
            if (!papan.getPion(barisTujuan + 1, kolomTujuan).getWarna().equals("kosong")) {
                return false;
            } else if (!papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("kosong")) {
                return false;
            }
        } else if (getWarna().equals("hitam") && getBaris() == 1 && selisihBaris == 2 && selisihKolom == 0) {
            if (!papan.getPion(barisTujuan - 1, kolomTujuan).getWarna().equals("kosong")) {
                return false;
            } else if (!papan.getPion(barisTujuan, kolomTujuan).getWarna().equals("kosong")) {
                return false;
            }
        }
        
        return true;
    }
}
