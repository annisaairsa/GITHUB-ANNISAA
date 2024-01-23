/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author TOSHIBA
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka: ");
            int number = scanner.nextInt();
            System.out.println("Angka yang dimasukkan: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Kesalahan: Input yang dimasukkan tidak sesuai dengan tipe data int.");
        } finally {
            scanner.close();
        }
    }
}