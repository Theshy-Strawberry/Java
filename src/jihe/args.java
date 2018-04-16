package jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map test = new HashMap<String, Object>();
		test.put("a", 1);
		test.put("s", 1);
		test.put("d", 1);
		Set keyset = test.keySet();
		if(keyset.contains("s")){
			System.out.println("s");
		}
	}

}
