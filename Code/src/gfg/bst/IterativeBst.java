package gfg.bst;

public class IterativeBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,3,5,8,9,22,33,55};
		int toFindXIndex=22;
		int idexOfX=IterativeBst(arr,arr.length,toFindXIndex);
		
		System.out.println("Index of x is "+idexOfX+" "+(idexOfX!=-1?arr[idexOfX]:" x is not found"));
		
		int idexOfX1=recursiveBst(arr,0,arr.length-1,toFindXIndex);
		
		System.out.println("Index of x is "+idexOfX1+" "+(idexOfX1!=-1?arr[idexOfX1]:" x is not found"));
		

	}

	// bst operates on sorted array
	public static int IterativeBst(int[] arr, int n, int x) {

		int low = 0;
		int high = n - 1;

		while (low < high) {

			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	
	// bst operates on sorted array
	public static int recursiveBst(int[] arr, int low, int high, int x) {
		if(low>high)
			return -1;
		
		int mid = (low + high) / 2;

		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] > x) {
			return recursiveBst(arr, low, mid - 1, x);
		} else {
			return recursiveBst(arr, mid + 1, high, x);
		}

	}

}
