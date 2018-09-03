package Main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to my Finance Tracker!!");
		System.out.println("\nWhat would you like to do?");
		System.out.println("\n1. Make an entry \n2. View records");
		Scanner sc = new Scanner(System.in);
		sc.hasNext();
		System.out.println(sc.nextLine());
	}

}
