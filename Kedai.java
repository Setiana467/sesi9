package sesi9;

import java.util.ArrayList;

public class Kedai {
    public static void main(String[] args) {
        ArrayList<String> makanan = new ArrayList<>();
        ArrayList<String> minuman = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();
        
        makanan.add("Mie Gaul");
        harga.add(3000);
        makanan.add("Papeda");
        harga.add(2000);
        makanan.add("Empek-empek");
        harga.add(1000);
        makanan.add("Seblak");
        harga.add(7000);
        makanan.add("Batagor");
        harga.add(1000);
        makanan.add("Sosis Bakar");
        harga.add(5000);
        makanan.add("Cornet");
        harga.add(1000);
        minuman.add("Pop Ice");
        harga.add(3000);
        minuman.add("Minuman Biasa");
        harga.add(2000);
        minuman.add("Minuman Sederhana");
        harga.add(1000);
         
        System.out.println("MENU MAKANAN");
        for (int i = 0; i < makanan.size(); i++) {
            System.out.println(makanan.get(i) + " : Rp. " + harga.get(i));
        }
        System.out.println("_");
        System.out.println("MENU MINUMAN");
        for (int i = 0; i < minuman.size(); i++) {
            System.out.println(minuman.get(i) + " : Rp. " + harga.get(i));
        }
    }
}
