/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author TOSHIBA
 */
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 5 / 0; // Pembagian oleh nol akan menghasilkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan: Pembagian oleh nol tidak diperbolehkan.");
        }
    }
}
