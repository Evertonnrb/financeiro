import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tests {
	public static void main(String[] args) {
	EntityManagerFactory factory =	Persistence.createEntityManagerFactory("FinanceiroEE");
	}
}
