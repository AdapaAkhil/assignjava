package assign5;
import static org.junit.Assert.*;

import org.junit.Test;
public class SlowApiTest {
	@Test (timeout=1)
	public void testPerformance() {
	SlowApi sa=new SlowApi();
	sa.show();
		}

}
