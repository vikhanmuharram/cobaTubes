/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod_10_1302213089_muhammadvikhanmuharram;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author hp
 */
public class TanggalHelper {
    final static int WAKTU_MACET = 60;
    
    public static String tambahMenit(LocalDateTime waktu, int menit){
        LocalDateTime waktuBaru = waktu.plusMinutes(menit);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return waktuBaru.format(formatter);
    }
    
    public static String tambahJam(LocalDateTime waktu, int jam){
        LocalDateTime waktuBaru = waktu.plusHours(jam);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return waktuBaru.format(formatter);
    }
}
