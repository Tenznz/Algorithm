package com.bridgelabz.binary_search;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearch {
	// 2.Binary Search the Word from Word List

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		UserInterface UI = UserInterface.getInstance();
		String[] word = UI.fileInput();
		System.out.println("Enter search word from file");
		String input = sc.nextLine();
		String check = UI.search(word, input);
		System.out.print(check);
	}
}