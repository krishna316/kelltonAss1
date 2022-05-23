package Assessment;

public class questionNo2 {

	public static void main(String[] args) {

	       
	       int arr[] = {2,3,1,0,-4,-1};
	       int sum = 4;
	 
	      
	       int low = 0;
	       int high = arr.length - 1;
	 
	       while(low < high) { 
	 
	          if((arr[low] + arr[high]) > sum) {
	                high--;
	 
	          } else if ((arr[low] + arr[high]) < sum) {
	                low++;
	 
	          } else if((arr[low] + arr[high]) == sum) {
	                System.out.println(" Pair (" + arr[low] + " , " + arr[high] + " )");
	                low++;
	                high--;
	          }
	       }
	   }

	}


