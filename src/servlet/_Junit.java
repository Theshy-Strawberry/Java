package servlet;

import static org.junit.Assert.*;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class _Junit {

	@Test
	public void sendPost() throws URISyntaxException, IOException {
		Desktop desktop = Desktop.getDesktop();
		URI uri = new URI("http://localhost:8080/swift/hello");
		 desktop.browse(uri);
		
	}

}
