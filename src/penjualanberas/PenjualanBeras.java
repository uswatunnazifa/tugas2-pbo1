/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualanberas;
import crud.koneksi;
import java.text.ParseException;

/**
 *
 * @author ACER
 */
public class PenjualanBeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        koneksi run = new koneksi();
        
        run.HapusDataAdmin(1);
    }
    
}
