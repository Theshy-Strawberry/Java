package thread;
import java.io.File;

public class Soort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//冒泡
		int[] unsorted = { 41, 32, 23, 5, 9 };
	/*	for (int n = 0; n < a.length; n++) {
			for (int m = 0; m < a.length-1; m++) {
				if (a[m] > a[m+1]) {
					int temp = a[m];
					a[m] = a[m+1];
					a[m+1] = temp;
				}
			}
		}
		*/
		 for (int i = 0; i < unsorted.length; i++)
         {
             for (int j = i; j < unsorted.length; j++)
             {
                 if (unsorted[i] > unsorted[j])
                 {
                     int temp = unsorted[i];
                     unsorted[i] = unsorted[j];
                     unsorted[j] = temp;
                 }
             }
         }
		for (int n = 0; n < unsorted.length; n++) {
			System.out.println(unsorted[n]);
		}

	/*	File f= new File("C:\\log");
		for(File one : f.listFiles()){
			System.out.println(one.getName());
		}*/
	}

}
