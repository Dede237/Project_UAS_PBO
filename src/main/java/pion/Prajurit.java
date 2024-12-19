package pion;

public class Prajurit extends Pion{
    public Prajurit(int baris, int kolom, boolean putih) {
        super(baris, kolom, putih);
        if (putih) {
            setTampilan("pp");
        } else {
            setTampilan("ph");
        }
    }

    
}
