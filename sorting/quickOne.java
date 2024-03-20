package sorting;

public class quickOne {
	void quickSort(int ar[],int low,int high) {
		
		if(low<high) {
			int pi = low;
			int i = low;
			int j = high;
			
			while(i<j) {
				while(ar[i] <= ar[pi] && i<low) {
					i ++;
				}
				while(ar[j] > ar[pi]) {
					j--;
				}
				if(i<j) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				
				}
			}
			int tent = ar[pi];
			ar[pi] = ar[j];
			ar[j] = tent;
			
			quickSort(ar, low, j-1);
			quickSort(ar, j+1, high);
		}
	}
	void print(int ar[]) {
		for( int k:ar) {
			System.out.print(k+" ");
		}
	}
	public static void main(String[] args) {
		
		quickOne q = new quickOne();
		int ar[] = {11,15,8,13,20,4,3,5,6,9,18,12};
		q.quickSort(ar, 0, ar.length-1);
		
		q.print(ar);
	}

}
