package pion;

public class Kuda extends Pion{
    public Kuda(int baris, int kolom, boolean putih) {
        super(baris, kolom, putih);
        if (putih) {
            setTampilan("kp");
        } else {
            setTampilan("kh");
        }
    }
}
