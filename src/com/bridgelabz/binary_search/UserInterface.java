package com.bridgelabz.binary_search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {
	public static UserInterface instance;

	private UserInterface() {

	}

	public static UserInterface getInstance() {
		if (instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	public String[] fileInput() throws FileNotFoundException {
		File file = new File(
				"/home/tsewang/eclipse-workspace/AlgorithmPrograms/src/com/bridgelabz/binary_search/word.txt");
		Scanner sc = new Scanner(file);

		String words = null;
		while (sc.hasNextLine())
			words = sc.nextLine();
		System.out.println(words);

		String[] word = words.toLowerCase().split(",");
		return word;

	}

	public String search(String[] word, String input) {
		String isFound = "word not found";
		for (String a : word) {
			if (input.compareTo(a) == 0) {
				isFound = a + " word found";
			}
		}
		return isFound;
	}
}