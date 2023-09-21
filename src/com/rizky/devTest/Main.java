package com.rizky.devTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		for(int row = 1; row <= size; row++) {
			for(int numberOfSpace = size - row; numberOfSpace > 0; numberOfSpace--) {
				System.out.print("  ");
			}
			
			for(int numberOfSymbol = row; numberOfSymbol > 0; numberOfSymbol--) {
				System.out.print("# ");
			}
			
			System.out.println();
		}
	}
}
