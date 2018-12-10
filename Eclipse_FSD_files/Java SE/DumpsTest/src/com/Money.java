package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/*class Money1 {
	private String country="A", name;
	public String getCountry() { return country; }
	
}

	class Yen extends Money1 {
		public int getCountry(int x) { return 5; }
	}

	class Euro extends Money1 {
		public String getCountry(String timeZone) {
			return super.getCountry();
		}
	}*/
	
public class Money{
	public static void main(String[] args) throws ParseException, IOException {
		//Money1 m = new Money1();
		//System.out.println(m.getCountry());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        //Date startDate = sdf.parse("28-07-2017 09:00");
        
        System.out.println("Enter Created on date(dd-MM-yyyy HH:mm):");
        String inp=br.readLine();
        LocalDateTime ld1=LocalDateTime.parse(inp,DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        LocalDateTime ld2=LocalDateTime.parse("28-07-2017 09:00",DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        System.out.println(ChronoUnit.MINUTES.between(ld1, ld2));
        
        LocalDate ld3 = LocalDate.parse(inp, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        LocalDate ld4 = LocalDate.parse("28-07-2017 09:00", DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        Period p = Period.between(ld3, ld4);
        System.out.println(p.getDays());
		}
}