package TestUniqueSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import uniqueSum.UniqueSum;

//import static UniqueSum;


public class TestUniqueSum {
	
		
	@Test
	public void testSumOfDistinct() {
		int a[] =  { 5, 1, 2, 4, 6, 7, 3, 6, 7 };
		int n = a.length; 
		assertEquals( 28 , UniqueSum.sumOfDistinct(a , n),"Sum of Distinct method doesnt work" );
	}
	


}



//@Test
//public void 