package PrimitiveDatatypes;

import java.time.LocalDate;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		LocalDate ld = LocalDate.now();
		
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		ZonedDateTime instant = ZonedDateTime.now();
		
		System.out.println(instant);
		
		ZonedDateTime instantInUTC = instant.withZoneSameInstant(ZoneId.of("UTC"));
		
		System.out.println(instantInUTC);
				

		
		
		
		
				}

}
