package edu.s16222.kata4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrappingFile {
	Scanner sc;
	//
	@SuppressWarnings("finally")
	public ArrayList<String> readFile(String name) {
		ArrayList<String> list = new ArrayList<String>();
		try {

			sc = new Scanner(new File(name));
			while(sc.hasNextLine()) {
				list.add(sc.nextLine());
			}
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			return list;
		}
	}
	public int[] readRow(String row) {
		int[] result = new int [20];
		sc = new Scanner(row);
		for (int i = 0; sc.hasNextInt();i++) {
			result[i] = sc.nextInt();
		}


		return result;


	}
}
