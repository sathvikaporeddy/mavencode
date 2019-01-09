package Basic;

import java.io.IOException;

import org.testng.annotations.Test;

public class Child extends Globalisation{

	@Test
	public void signin() throws IOException {
		login();
		System.out.println("inheritance");
		
	}
}
