/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author TOSHIBA
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length(); // Akses length dari objek null akan menghasilkan NullPointerException
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Kesalahan: Objek null tidak memiliki properti atau metode yang dapat diakses.");
        }
    }
}