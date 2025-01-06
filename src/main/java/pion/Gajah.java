package pion;

import papan.Papan;

public class Gajah extends Pion{
    public Gajah(int baris, int kolom, String warna) {
        super(baris, kolom, warna);
        if (warna.equals("putih")) {
            setTampilan("gp");
        } else {
            setTampilan("gh");
        }
    }

    public boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - getBaris());
        int selisihKolom = Math.abs(kolomTujuan - getKolom());

        if (selisihBaris == selisihKolom) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validasi3(int barisTujuan, int kolomTujuan, Papan papan) {
        int barisAwal = getBaris();
        int kolomAwal = getKolom();

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

        return true;
    }
}
