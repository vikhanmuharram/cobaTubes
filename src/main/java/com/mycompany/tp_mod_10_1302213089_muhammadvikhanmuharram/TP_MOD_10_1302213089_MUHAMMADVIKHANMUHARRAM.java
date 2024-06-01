/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_10_1302213089_muhammadvikhanmuharram;
import java.time.LocalDateTime;
import java.time.Month;
/**
 *
 * @author hp
 */
public class TP_MOD_10_1302213089_MUHAMMADVIKHANMUHARRAM {

    public static void main(String[] args) {
        Orang pejanji = new Orang("Vikhan", 1, 10);
        
        LocalDateTime waktuJanji1 = LocalDateTime.of(2022, Month.DECEMBER, 2, 10, 0);
        pejanji.tambahJanji(waktuJanji1, "bos");
        LocalDateTime waktuJanji2 = LocalDateTime.of(2022, Month.DECEMBER, 3, 9, 0);
        pejanji.tambahJanji(waktuJanji2, "temen");
        LocalDateTime waktuJanji3 = LocalDateTime.of(2022, Month.DECEMBER, 4, 18, 30);
        pejanji.tambahJanji(waktuJanji3, "pacar");
        LocalDateTime waktuJanji4 = LocalDateTime.of(2022, Month.DECEMBER, 4, 7, 30);
        pejanji.tambahJanji(waktuJanji4, "dosen");
        LocalDateTime waktuJanji5 = LocalDateTime.of(2022, Month.DECEMBER, 4, 15, 0);
        pejanji.tambahJanji(waktuJanji5, "temen");
        
        pejanji.tampilkanSemuaWaktuDatang();
    }
}
