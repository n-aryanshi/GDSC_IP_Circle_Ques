//dnf algo
class Solution{
    
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    
    public static void sort012(int a[], int n){
        // code here
        int low =0;
        int mid=0;
        int high=n-1;
        
        while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;
                mid++;
                
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a,mid,high);
                high--;
            }
        }
        
    }
}
