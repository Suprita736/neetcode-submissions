class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int[] a = new int[m+n];
        int i = 0,j = 0,k = 0;
        while(i < m && j < n){
            if(num1[i] <= num2[j]){
                a[k++] = num1[i];
                i++;
            }
            else{
                a[k++] = num2[j];
                j++;
            }
        }
        if(i < m){
            while(i < m){
                a[k++] = num1[i++];
            }
        }
        if(j < n){
            while(j < n){
                a[k++] = num2[j++];
            }
        }
        for(int l=0;l<a.length;l++){
            num1[l] = a[l];
        }
    }
}