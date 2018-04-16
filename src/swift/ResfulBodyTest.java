package swift;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResfulBodyTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Calendar calendar = new GregorianCalendar();
//		calendar.set(Calendar.DATE, 1);
//		SimpleDateFormat simpleFormate = new SimpleDateFormat("yyyy-MM");
//		String ym = simpleFormate.format(calendar.getTime());
//		System.out.println(ym);
		String str = "<<body>>higklmnopq<rstu</body>vwxyz";
	 //    jsonStr.substring(jsonStr.indexOf("<body>")+6, jsonStr.lastIndexOf("</body>"));
		str= str.substring(str.indexOf("<body>")+6,str.indexOf("</body>", str.lastIndexOf("<body>")+6));
		 System.out.println(str);
		}
	}

