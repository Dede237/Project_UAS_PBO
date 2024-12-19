package pion;

public class Gajah extends Pion{
    public Gajah(int baris, int kolom, boolean putih) {
        super(baris, kolom, putih);
        if (putih) {
            setTampilan("gp");
        } else {
            setTampilan("gh");
        }
    }
}
