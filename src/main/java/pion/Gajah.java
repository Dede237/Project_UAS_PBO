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

    public boolean validasi1(int baris, int kolom, int barisTujuan, int kolomTujuan) {
        int selisihBaris = Math.abs(barisTujuan - baris);
        int selisihKolom = Math.abs(kolomTujuan - kolom);

        if (selisihBaris == selisihKolom) {
            return true;
        } else {
            return false;
        }
    }
}
