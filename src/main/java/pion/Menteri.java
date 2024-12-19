package pion;

public class Menteri extends Pion{
    public Menteri(int baris, int kolom, boolean putih) {
        super(baris, kolom, putih);
        if (putih) {
            setTampilan("mp");
        } else {
            setTampilan("mh");
        }
    }
}
