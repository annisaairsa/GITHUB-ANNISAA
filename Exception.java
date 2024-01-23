/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author TOSHIBA
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka pertama: ");
            int num1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int num2 = scanner.nextInt();

            // Penanganan ArithmeticException (pembagian oleh nol)
            int result = divideNumbers(num1, num2);
            System.out.println("Hasil pembagian: " + result);

            // Penggunaan IllegalArgumentException
            if (result < 0) {
                throw new IllegalArgumentException("Hasil pembagian tidak boleh negatif");
            }

            // Penggunaan NullPointerException
            String[] stringArray = null;
            printArrayElement(stringArray, 0);

        } catch (InputMismatchException e) {
            System.out.println("Error: Input tidak valid. Harap masukkan angka.");
            scanner.nextLine(); // Membersihkan buffer input
        } catch (ArithmeticException e) {
            System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Angka harus lebih besar dari 0.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer ditemukan.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index di luar batas pada array.");
        } finally {
            // Tutup scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static int divideNumbers(int num1, int num2) {
        // Penanganan ArithmeticException (pembagian oleh nol)
        return num1 / num2;
    }

    private static void printArrayElement(String[] array, int index) {
        // Penanganan NullPointerException dan ArrayIndexOutOfBoundsException
        System.out.println("Elemen ke-" + index + ": " + array[index]);
    }
}