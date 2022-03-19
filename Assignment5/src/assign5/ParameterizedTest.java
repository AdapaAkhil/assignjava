package assign5;
import static org.junit.Assert.*;

import org.junit.Test;

public class ParameterizedTest {
	@Test
	public void test() {
		Parameterized obj=new Parameterized("Aki","Student",2001);
		obj.getName();
		obj.getAbout();
		obj.getBirthYear();
	}

}
