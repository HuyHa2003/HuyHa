package phan_1;

import java.util.Scanner;

public class phan_1 {
	public static void main(String[] args) {
        // Sử dụng Scanner để nhập hai số từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        // Thực hiện các phép toán tổng, hiệu, tích và thương chia lấy dư
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int du = a % b;

        // In kết quả của các phép toán đó ra màn hình
        System.out.println("Tổng của " + a + " và " + b + " là: " + tong);
        System.out.println("Hiệu của " + a + " và " + b + " là: " + hieu);
        System.out.println("Tích của " + a + " và " + b + " là: " + tich);
        System.out.println("Thương của " + a + " và " + b + " là: " + thuong + ", dư " + du);
    }

}
