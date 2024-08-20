import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

	
	public class LogisticsServicesTest{

	@Test
	public void testToCheckIfItReturnsTheRightAllowance(){
	
	LogisticsServices logisticsServices = new LogisticsServices();

	int salary = logisticsServices.checkDailyWage(70);

	assertEquals(40000, salary);

	}
	}