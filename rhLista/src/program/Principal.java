package program;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ZonedDateTime now = ZonedDateTime.now();
		ZonedDateTime oldDate = now.minusDays(1).minusMinutes(10);
		Duration duration = Duration.between(oldDate, now);
		System.out.println("ISO-8601: " + duration);
		System.out.println("Minutes: " + duration.toMinutes());

	}

}
