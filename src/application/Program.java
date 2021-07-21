package application;

import java.util.Scanner;

import model.service.PrintService;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.print("How many value: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("value: ");
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		
		Integer fisrt = ps.first();
		System.out.println(fisrt);
		
		sc.close();
	}

}
