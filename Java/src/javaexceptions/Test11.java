package javaexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.io.BufferedReader;

public class Test11 {

	static void redData() throws FileNotFoundException {
		FileReader file = new FileReader("");
		BufferedReader fp = new BufferedReader(file);
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Begin");
		try {
			redData();
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("end");
	}

}
