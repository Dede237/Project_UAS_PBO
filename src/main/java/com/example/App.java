package com.example;

import java.util.Scanner;

import papan.Papan;

public final class App {
    private App() {
    }

    static int baris(String input) {
        int baris = Integer.parseInt(input.substring(1,2));
        return baris - 1;
    }

    static int kolom(String input) {
        char charInput = input.toLowerCase().charAt(0);
        int kolom = charInput;
        return kolom - 97;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Papan papan = new Papan();
        String giliran = "putih";
        int baris;
        int kolom;

        while (true) {
            papan.menampilkanPapan();

            while (true) {
                System.out.print("Masukkan posisi awal: ");
                String input = sc.nextLine();
                baris = baris(input);
                kolom = kolom(input);

                if (giliran.equals(papan.getPion(baris, kolom).getWarna())) {
                    break;
                } else {
                    System.out.println("Sekarang giliran " + giliran);
                }
            }

            while (true) {
                System.out.print("Masukkan posisi tujuan: ");
                String inputTujuan = sc.nextLine();

                if (inputTujuan.equals("back")) {
                    break;
                }

                int barisTujuan = baris(inputTujuan);
                int kolomTujuan = kolom(inputTujuan);

                if (papan.getPion(baris, kolom).validasi(barisTujuan, kolomTujuan, papan)) {
                    papan.getPion(baris, kolom).bergerak(papan, barisTujuan, kolomTujuan);

                    if (giliran.equals("putih")) {
                        giliran = "hitam";
                    } else {
                        giliran = "putih";
                    }

                    break;
                } else {
                    System.out.println("Posisi tidak valid!");
                }
            }

            if (!papan.mengecekRajaPutih()) {
                System.out.println("Selamat, hitam menang!");
                break;
            } else if (!papan.mengecekRajaHitam()) {
                System.out.println("Selamat, putih menang!");
                break;
            }
        }
        sc.close();
    }
}
