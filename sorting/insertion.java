public class insertion {
    int [] insertionSort(int []ar){
        for(int i=1;i<ar.length;i++){
            int temp = ar[i];
            int j = i-1;
            while(j>=0){
                if(temp < ar[j]){
                    ar[j+1] = ar[j];
                }
                if(temp > ar[j]){
                    break;
                }
                j--;
            }
            if(j != i-1){
                ar[j+1] = temp;
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        insertion in = new insertion();
        int arr[] = {4,7,9,12,3,5,8};
        in.insertionSort(arr);
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
