/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demonstrasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author FERDI YANSAH
 */
public class dbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/laundry_app";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Pastikan driver sudah diimpor ke project
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Gagal menghubungkan ke database: " + e.getMessage());
            }
        }
        return connection;
    }
}