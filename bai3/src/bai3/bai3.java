package bai3;

import java.time.LocalDate;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.print("Nhập năm sinh của bạn: ");
        int yearOfBirth = scanner.nextInt();

        // Tính tuổi
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;

        // In kết quả
        if (age < 16) {
            System.out.println("Bạn " + name + " ở độ tuổi vị thành niên");
        } else if (age >= 16 && age < 18) {
            System.out.println("Bạn " + name + " ở độ tuổi trưởng thành");
        } else {
            System.out.println("Bạn " + name + " đã già");
        }
    }

}
