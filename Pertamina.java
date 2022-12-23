package sesi9;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;

public class Pertamina {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int kendaraan = 00;
        ArrayDeque <String> spbu = new ArrayDeque<>();

        while(true){
            int r = rand.nextInt(3);

            for(int i = 0; i < r; i++){
                spbu.add("kendaraan ke- " + (++kendaraan));
            }

            if(r == 0) continue;
            System.out.println(spbu);
            System.out.print("Mengisi bahan bakar kendaraan? y/n:  ");
            char masukan = sc.nextLine().charAt(0);
            
            if(spbu.size() == 15){
                System.out.println("Antrian sudah penuh program keluar");
                break;
            }

            if(masukan == 'y'){
                spbu.pop();
            }
        }
    }
}
