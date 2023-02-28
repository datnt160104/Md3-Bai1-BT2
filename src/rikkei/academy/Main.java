package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate = 23000.0; // giá trị tỉ giá giữa VND và USD

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị USD cần chuyển đổi: ");
        double usdValue = input.nextDouble();

        double vndValue = usdValue * rate; // tính giá trị VND tương ứng

        System.out.println(usdValue + " USD = " + vndValue + " VND"); // hiển thị kết quả
    }
    }

