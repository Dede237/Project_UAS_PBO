package pion;

import papan.Papan;

public class Kosong extends Pion {
    public Kosong(int baris, int kolom, String warna) {
        super(baris, kolom, warna);
        setTampilan("..");
    }

    public boolean validasi1(int barisTujuan, int kolomTujuan, Papan papan) {
        return true;
    }
}
