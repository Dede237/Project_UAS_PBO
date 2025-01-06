package pion;

import papan.Papan;

public class Menteri extends Pion{
    public Menteri(int baris, int kolom, String warna) {
        super(baris, kolom, warna);
        if (warna.equals("putih")) {
            setTampilan("mp");
        } else {
            setTampilan("mh");
        }
    }

    public boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - getBaris());
        int selisihKolom = Math.abs(kolomTujuan - getKolom());

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

    public boolean validasi3(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - getBaris());
        int selisihKolom = Math.abs(kolomTujuan - getKolom());
        int barisAwal = getBaris();
        int kolomAwal = getKolom();

        if (selisihBaris == selisihKolom) {
            int deltaBaris = (barisTujuan > barisAwal) ? 1 : -1;
            int deltaKolom = (kolomTujuan > kolomAwal) ? 1 : -1;

            int baris = barisAwal + deltaBaris;
            int kolom = kolomAwal + deltaKolom;

            while (baris != barisTujuan && kolom != kolomTujuan) {
                if (!papan.getPion(baris, kolom).getWarna().equals("kosong")) {
                    return false;
                }

                baris += deltaBaris;
                kolom += deltaKolom;
            }
        } else if (selisihBaris == 0) {
            int deltaKolom = (kolomTujuan > kolomAwal) ? 1 : -1;
            int kolom = kolomAwal + deltaKolom;

            while (kolom != kolomTujuan) {
                if (!papan.getPion(getBaris(), kolom).getWarna().equals("kosong")) {
                    return false;
                }
                kolom += deltaKolom;
            }
        } else if (selisihKolom == 0) {
            int deltaBaris = (barisTujuan > barisAwal) ? 1 : -1;
            int baris = barisAwal + deltaBaris;

            while (baris != barisTujuan) {
                if (!papan.getPion(baris, getKolom()).getWarna().equals("kosong")) {
                    return false;
                }
                baris += deltaBaris;
            }
        }
        return true;
    }
}
