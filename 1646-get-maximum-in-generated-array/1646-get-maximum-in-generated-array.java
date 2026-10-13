class Solution {
    public int getMaximumGenerated(int n) {
        int arr[]=new int[n+1];
       
     
        int i=1;
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
     arr[0]=0;
        arr[1]=1;
        for(i=1;i<n;i++)
        { if(arr.length-1>=(2*i)){
            arr[2*i]=arr[i];} 
            else{
                break;
            }
            if(arr.length-1>=(2*i+1)){
            arr[2*i+1]=arr[i]+arr[i+1];
        } else{
            break;

        }} int max=0; 
                
        for(int k:arr){
           max= Math.max(k,max);
        } return max;
    }
}