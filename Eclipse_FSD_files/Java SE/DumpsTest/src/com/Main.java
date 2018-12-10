package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "You are tooooo goooooood";
		int max = 0, b = 0;
		
		for(int i=0; i<input.length()-1; i++) {
			int count = 0;
			for(int j=i+1; j<input.length(); j++) {
				if(input.charAt(i) == ' ') break;
				else if(input.charAt(i) == input.charAt(j)) count++;
				else break;
			}
			if(count>max) {
			max = count;
			b = max+1;
			//i += b;
			}		
		}
		System.out.println(b);
	}
}
