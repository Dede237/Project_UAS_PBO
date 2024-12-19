package pion;

public class Benteng extends Pion{
    public Benteng(int baris, int kolom, boolean putih) {
        super(baris, kolom, putih);
        if (putih) {
            setTampilan("bp");
        } else {
            setTampilan("bh");
        }
    }

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan) {
        int selisihBaris = Math.abs(barisTujuan - baris);
        int selisihKolom = Math.abs(kolomTujuan - kolom);
        if (selisihBaris == 0 && selisihKolom != 0 || selisihBaris != 0 && selisihKolom == 0) {
            return true;
        } else {
            return false;
        }
    }
}
