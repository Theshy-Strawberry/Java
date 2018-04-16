package swift;

public class JiaMiJieMi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JiaMi jm=new JiaMi();
		String      encrypted = JiaMi.bytesToHex(jm.encrypt("1250"));
		System.out.println(encrypted);
		
		 String      decrypted = new String(jm.decrypt("793d9fa5674648760ec1b97fda14486f"));
		 System.out.println(decrypted);
	}

}
