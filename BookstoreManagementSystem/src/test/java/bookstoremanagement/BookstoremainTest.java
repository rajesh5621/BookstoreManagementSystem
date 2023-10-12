package bookstoremanagement;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BookstoremainTest {
	@Test
	public void searchTest() {
		Book t1 = new Book(null, null, null, 0, 0);
		t1.Isbn("123");
		String Isbn = "123";
		boolean result = t1.Isbn(Isbn);
		assertTrue(result);
		
		
		
		
		
		
		
		
	}
	

}
