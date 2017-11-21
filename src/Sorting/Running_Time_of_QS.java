package Sorting;
import java.util.*;

public class Running_Time_of_QS {
	public static int shift_count(int[]IS){
		int count = 0;
		for(int i=1;i<IS.length;i++){
			int j = i-1;
			int x = IS[i];
			while(j>=0 && IS[j]>x){
				IS[j+1] = IS[j];
				count++;
				j--;
			}
			IS[j+1] = x;
		}
		return count;
	}
	
	 static int swapCountQS = 0;

	public static int swap_count(int[] QS)
	  {
	    quickSort(QS,0,QS.length-1);
	    return swapCountQS;
	  }
	  
	  private static void quickSort(int[] array, int left, int right)
	  {
	    if(left < right)
	    {
	      int splitPos = partition(array,left,right);
	      
	      quickSort(array,left,splitPos-1);
	      quickSort(array,splitPos+1,right);
	    }
	  }
	  
	  private static int partition(int[] QS, int left, int right)
	  {
	    int pivot = QS[right];
	    int i = left - 1;
	    
	    for(int j = left; j < right; j++)
	    {
	      if(QS[j] <= pivot)
	      {
	        i++;
	        
	        int temp = QS[i];
	        QS[i] = QS[j];
	        QS[j] = temp;
	        
	        swapCountQS++;
	      }
	    }
	    
	    int temp = QS[i+1];
	    QS[i+1] = QS[right];
	    QS[right] = temp;
	    
	    swapCountQS++;
	    
	    return i + 1;
	  }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[]QS = new int[n];
		int[]IS = new int[n];
		for(int i=0;i<n;i++){
			QS[i] = in.nextInt();
			IS[i] = QS[i];
		}
		System.out.println(shift_count(IS)-swap_count(QS));
		in.close();
	}
}
