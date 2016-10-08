import static org.junit.Assert.*;
import org.junit.Test;

public class PointTest{
	@Test
	public void distanceFromAtoB() {
		Point point a = new Point(1,1);
		Point point b = new Point(2,2);
		final double result = a.distanceTo(b);
		assertThat(result, is(2));
	}

}