package phan_2;

import java.util.Scanner;

public class phan_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        // So sánh hai số với nhau và in kết quả ra màn hình
        System.out.println(a + " == " + b + " là " + (a == b));
        System.out.println(a + " != " + b + " là " + (a != b));
        System.out.println(a + " > " + b + " là " + (a > b));
        System.out.println(a + " < " + b + " là " + (a < b));
        System.out.println(a + " >= " + b + " là " + (a >= b));
        System.out.println(a + " <= " + b + " là " + (a <= b));
    }

}
