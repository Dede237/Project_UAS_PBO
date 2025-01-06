package pion;

import papan.Papan;

public class Benteng extends Pion{
    public Benteng(int baris, int kolom, String warna) {
        super(baris, kolom, warna);
        if (warna.equals("putih")) {
            setTampilan("bp");
        } else {
            setTampilan("bh");
        }
    }

    public boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - getBaris());
        int selisihKolom = Math.abs(kolomTujuan - getKolom());

        if (selisihBaris == 0 && selisihKolom != 0 || selisihBaris != 0 && selisihKolom == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validasi3(int barisTujuan, int kolomTujuan, Papan papan) {
        int selisihBaris = Math.abs(barisTujuan - getBaris());
        int selisihKolom = Math.abs(kolomTujuan - getKolom());
        int barisAwal = getBaris();
        int kolomAwal = getKolom();

        if (selisihBaris == 0) {
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
