import java.time.LocalDate;

public class calcIdade {
	
	static int calcAge(int year) {
		return LocalDate.now().getYear() - year;
	}

}