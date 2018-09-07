package huy.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("nhap so nguyen duong : ");
		int n= new Scanner(System.in).nextInt();
		int Tong = 0;
		for (int i=1;i<=n;i++) {
			Tong = Tong + i;
			}
		System.out.println("Tong la "+Tong );
	}
}

