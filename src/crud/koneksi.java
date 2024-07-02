/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author ACER
 */
public class koneksi {
    private String database_name = "penjualan_beras";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB; 
    
    public koneksi(){
    
        try {  
            String lokasi = "jdbc:mysql://localhost/" + database_name;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            //System.out.println("Database Terkoneksi");
            } catch (Exception e) {
            System.out.println(e.getMessage());          
            }
    }
    
    //Tabel Admin
    public void SimpanDataAdmin(int id_admin, String nama_pengguna, String password, String nama_lengkap, String alamat, String email, String telepon){
        try {
            String sql = "INSERT INTO admin (id_admin, nama_pengguna, password, nama_lengkap, alamat, email, telepon) VALUE (?,?,?,?,?,?,?)";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setInt(1, id_admin);
            run.setString(2, nama_pengguna);
            run.setString(3, password);
            run.setString(4, nama_lengkap);
            run.setString(5, alamat);
            run.setString(6, email);
            run.setString(7, telepon);
            
            run.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahDataAdmin(int id_admin, String nama_pengguna, String password, String nama_lengkap, String alamat, String email, String telepon){
        try {
            String sql = "UPDATE admin SET nama_pengguna=?, password=?, nama_lengkap=?, alamat=?, email=?, telepon=? WHERE id_admin=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setString(1, nama_pengguna);
            run.setString(2, password);
            run.setString(3, nama_lengkap);
            run.setString(4, alamat);
            run.setString(5, email);
            run.setString(6, telepon);
            run.setInt(7, id_admin);
            
            run.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusDataAdmin(int id_admin ){
        try {
            String sql = "DELETE FROM admin where id_admin=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);

            run.setInt(1, id_admin);
            
            run.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    //Tabel Kirim Barang
    public void SimpanDataKirim(int id_kirim, String nama_kota, int harga){
        try {
            String sql = "INSERT INTO brg_kirim (id_kirim, nama_kota, harga) VALUE (?,?,?)";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setInt(1, id_kirim);
            run.setString(2, nama_kota);
            run.setInt(3, harga);
           
            run.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahDataKirim(int id_kirim, String nama_kota, int harga){
        try {
            String sql = "UPDATE brg_kirim SET nama_kota=?, harga=? WHERE id_kirim=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setString(1, nama_kota);
            run.setInt(2, harga);
            run.setInt(3, id_kirim);
            
            run.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusDataKirim(int id_kirim ){
        try {
            String sql = "DELETE FROM brg_kirim where id_kirim=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);

            run.setInt(1, id_kirim);
            
            run.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    //Tabel Kategori
    public void SimpanDataKategori(int id_kategori, String nama_kategori){
        try {
            String sql = "INSERT INTO kategori (id_kategori, nama_kategori) VALUE (?,?)";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setInt(1, id_kategori);
            run.setString(2, nama_kategori);
           
            run.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahDataKategori(int id_kategori, String nama_kategori){
        try {
            String sql = "UPDATE kategori SET nama_kategori=? WHERE id_kategori=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setString(1, nama_kategori);
            run.setInt(2, id_kategori);
            
            run.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusDataKategori(int id_kategori ){
        try {
            String sql = "DELETE FROM kategori where id_kategori=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);

            run.setInt(1, id_kategori);
            
            run.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    //Tabel Pelanggan
    public void SimpanDataPelanggan(int id_pelanggan, String email, String password, String nama_lengkap, String alamat, String telepon){
        try {
            String sql = "INSERT INTO pelanggan (id_pelanggan, email, password, nama_lengkap, alamat, telepon) VALUE (?,?,?,?,?,?)";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setInt(1, id_pelanggan);
            run.setString(2, email);
            run.setString(3, password);
            run.setString(4, nama_lengkap);
            run.setString(5, alamat);
            run.setString(6, telepon);
            
            run.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahDataPelanggan(int id_pelanggan, String email, String password, String nama_lengkap, String alamat, String telepon){
        try {
            String sql = "UPDATE pelanggan SET email=?, password=?, nama_lengkap=?, alamat=?, telepon=? WHERE id_pelanggan=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);
            
            run.setString(1, email);
            run.setString(2, password);
            run.setString(3, nama_lengkap);
            run.setString(4, alamat);
            run.setString(5, telepon);
            run.setInt(6, id_pelanggan);
            
            run.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusDataPelanggan(int id_pelanggan ){
        try {
            String sql = "DELETE FROM pelanggan where id_pelanggan=?";
            PreparedStatement run = koneksiDB.prepareStatement(sql);

            run.setInt(1, id_pelanggan);
            
            run.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}