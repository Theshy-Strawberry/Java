package swift;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LastDayOfMonth {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int ym=20160606;
	    Calendar calendar  =   new  GregorianCalendar();
		   calendar.set( Calendar.DATE,  1 );
		   SimpleDateFormat simpleFormate  =   new  SimpleDateFormat( " yyyy-MM-dd " );
		   System.out.println(simpleFormate.format(calendar.getTime()));
		    
		    // 本月的最后一天 
		   calendar.set( Calendar.DATE,  1 );
		  calendar.roll(Calendar.DATE,  - 1 );
		  System.out.println(simpleFormate.format(calendar.getTime()));
//	}
		  Calendar c=Calendar.getInstance();
		  Calendar a=Calendar.getInstance();
		  c.set(Calendar.YEAR,2016);
		  c.set(Calendar.MONTH,7);
		  c.set(Calendar.DAY_OF_MONTH,1);
		  a.set(Calendar.DATE, 20160707);
		  Calendar c1=(Calendar)c.clone();
		  System.out.println(c.get(Calendar.YEAR)+""+(c.get(Calendar.MONTH)+1)+""+c.get(Calendar.DAY_OF_MONTH));
		  
		  c.add(Calendar.DAY_OF_MONTH,1);
		  if(c.get(Calendar.MONTH)!=c1.get(Calendar.MONTH))
		  {
		   System.out.println("是最后一天");
		  }
		  else
		  {
		   System.out.println("不是取后一天");
		   
		  }
}}
