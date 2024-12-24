package pion;

import papan.Papan;

public class Kosong extends Pion {
    public Kosong(int baris, int kolom, boolean warna) {
        super(baris, kolom, warna);
        setTampilan("..");
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan, Papan papan) {
        return true;
    }
}
