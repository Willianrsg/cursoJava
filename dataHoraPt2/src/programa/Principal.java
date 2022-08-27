package programa;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-26");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-26T14:02:55");
		Instant d06 = Instant.parse("2022-07-26T14:02:55Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));

	}

}
