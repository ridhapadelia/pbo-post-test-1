/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
public class Posttest1 {

    public static void main(String[] args) {
        // membuat array list untuk menyimpan objek Kostputri
        ArrayList<Kostputri> kosts = new ArrayList<>();

        // Mengisi ArrayList dengan objek Kostputri menggunakan constructor
        kosts.add(new Kostputri("Kost Syauqina", "Pramuka 1", 800));
        kosts.add(new Kostputri("Kost Sekar", "Pramuka 5", 600));
        kosts.add(new Kostputri("Kost Femina", "Perjuangan baru", 900));
        kosts.add(new Kostputri("Kost Varinda", "Pramuka 19", 850));
        kosts.add(new Kostputri("Kost Griya", "Perjuangan 1", 700));

        // Melakukan perulangan untuk menampilkan informasi Kostputri
        for (Kostputri kostputri : kosts) {
            // menampilkan informasi kostputri dengan string concatenation
            System.out.println("Kostputri dengan nama \"" + kostputri.nama + 
                               "\" berlokasi di \"" + kostputri.lokasi + 
                               "\" per bulannya seharga \"" + kostputri.harga + "\"");

        }
    }
}

    
