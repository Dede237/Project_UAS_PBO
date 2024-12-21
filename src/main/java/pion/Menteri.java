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

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan) {
        int selisihBaris = Math.abs(barisTujuan - baris);
        int selisihKolom = Math.abs(kolomTujuan - kolom);
        if (selisihBaris == selisihKolom) {
            return true;
        } else if (selisihBaris == 0 && selisihKolom != 0) {
            return true;
        } else if (selisihBaris != 0 && selisihKolom == 0) {
            return true;
        } else {
            return false;
        }
    }
}
