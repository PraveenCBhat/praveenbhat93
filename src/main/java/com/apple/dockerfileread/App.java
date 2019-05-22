package com.apple.dockerfileread;

/**
 * Hello world!
 *
 */

	
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.Set;

	public class App {
	 
	public static void main(String[] args) throws FileNotFoundException {
	        Scanner scanner = new Scanner(new FileReader("/Users/praveena.c/Documents/praveenbhat/PraveenBhat/Dockerfile"));

	        HashMap<String, String> map = new HashMap<String, String>();

	        while (scanner.hasNextLine()) {
	            String[] columns = scanner.nextLine().split(" ");
	            map.put(columns[0], columns[1]);
	        }

	        System.out.println(map);
	        scanner.close();
	    }

	}

