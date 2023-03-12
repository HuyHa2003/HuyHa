package bai2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int num = scanner.nextInt();

        // Kiểm tra số chẵn hay số lẻ
        if (num % 2 == 0) {
            System.out.println(num + " là số chẵn");
        } else {
            System.out.println(num + " là số lẻ");
        }
    }

}
