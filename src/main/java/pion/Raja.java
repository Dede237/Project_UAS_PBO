package pion;

public class Raja extends Pion{
    public Raja(int baris, int kolom, boolean putih) {
        super(baris, kolom, putih);
        if (putih) {
            setTampilan("rp");
        } else {
            setTampilan("rh");
        }
    }
}
