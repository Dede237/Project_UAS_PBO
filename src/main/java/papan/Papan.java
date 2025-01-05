package papan;

import pion.Benteng;
import pion.Gajah;
import pion.Kosong;
import pion.Kuda;
import pion.Menteri;
import pion.Pion;
import pion.Prajurit;
import pion.Raja;

public class Papan {
    private Pion[][] papan;

    public Papan() {
        papan = new Pion[8][8];
        mengisiPapan();
        mengisiPionPutih();
        mengisiPionHitam();
    }

    public Pion getPion(int baris, int kolom) {
        return papan[baris][kolom];
    }

    private void mengisiPapan() {
        for (int i = 0; i < papan.length; i++) {
            for (int j = 0; j < papan[0].length; j++) {
                papan[i][j] = new Kosong(i, j, "kosong");
            }
        }
    }

    private void mengisiPionPutih() {
        papan[7][0] = new Benteng(7, 0, "putih");
        papan[7][1] = new Kuda(7, 1, "putih");
        papan[7][2] = new Gajah(7, 2, "putih");
        papan[7][3] = new Menteri(7, 3, "putih");
        papan[7][4] = new Raja(7, 4, "putih");
        papan[7][5] = new Gajah(7, 5, "putih");
        papan[7][6] = new Kuda(7, 6, "putih");
        papan[7][7] = new Benteng(7, 7, "putih");

        for (int i = 0; i < papan[0].length; i++) {
            papan[6][i] = new Prajurit(6, i, "putih");
        }
    }

    private void mengisiPionHitam() {
        papan[0][0] = new Benteng(0, 0, "hitam");
        papan[0][1] = new Kuda(0, 1, "hitam");
        papan[0][2] = new Gajah(0, 2, "hitam");
        papan[0][3] = new Menteri(0, 3, "hitam");
        papan[0][4] = new Raja(0, 4, "hitam");
        papan[0][5] = new Gajah(0, 5, "hitam");
        papan[0][6] = new Kuda(0, 6, "hitam");
        papan[0][7] = new Benteng(0, 7, "hitam");

        for (int i = 0; i < papan[0].length; i++) {
            papan[1][i] = new Prajurit(1, i, "hitam");
        }
    }

    public void menampilkanPapan() {
        System.out.println("  A  B  C  D  E  F  G  H");
        for (int i = 0; i < papan.length; i++) {
            System.out.print(i + 1  + " ");
            for (int j = 0; j < papan[0].length; j++) {
                System.out.print(papan[i][j].getTampilan() + " ");
            }
            System.out.println();
        }
    }

    public void merubahPosisi(int baris, int kolom, int barisTujuan, int kolomTujuan) {
        papan[barisTujuan][kolomTujuan] = papan[baris][kolom];
        papan[barisTujuan][kolomTujuan].setBaris(barisTujuan);
        papan[barisTujuan][kolomTujuan].setKolom(kolomTujuan);
        papan[baris][kolom] = new Kosong(baris, kolom, "kosong");
    }

    public boolean mengecekRajaPutih() {
        for (int i = 0; i < papan.length; i++) {
            for (int j = 0; j < papan[0].length; j++) {
                if (getPion(i, j).getTampilan().equals("rp")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean mengecekRajaHitam() {
        for (int i = 0; i < papan.length; i++) {
            for (int j = 0; j < papan[0].length; j++) {
                if (getPion(i, j).getTampilan().equals("rh")) {
                    return true;
                }
            }
        }
        return false;
    }
}
