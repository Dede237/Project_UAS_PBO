package com.example;

import java.util.Scanner;

import papan.Papan;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Papan papan = new Papan();

        papan.menampilkanPapan();
        System.out.print("Masukkan baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan kolom: ");
        int kolom = sc.nextInt();
        System.out.print("Masukkan baris Tujuan: ");
        int barisTujuan = sc.nextInt();
        System.out.print("Masukkan kolom Tujuan: ");
        int kolomTujuan = sc.nextInt();

        papan.getPion(baris, kolom).bergerak(papan, barisTujuan, kolomTujuan);

        papan.menampilkanPapan();
    }
}
