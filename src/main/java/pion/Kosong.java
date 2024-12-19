package pion;

public class Kosong extends Pion {
    public Kosong(int baris, int kolom, boolean putih) {
        super(baris, kolom, putih);
        setTampilan("..");
    }

    public boolean validasi1() {
        return true;
    }
}
