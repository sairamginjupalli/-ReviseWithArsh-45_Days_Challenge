// The main idea is to use cyclic sort. Then iterate through array to find the repeated number and the missing number


class Solve {
    int[] findTwoElement(int arr[], int n)
    {
        int[] res = new int[2];
 
         int i=0;
         while(i<n)
         {
             if(arr[i]!=arr[arr[i]-1])
             {
                 int temp=arr[i];
                 arr[i]=arr[temp-1];
                 arr[temp-1]=temp;
             }
             else{i++;}
         }
         i=i-1;
      
         for(;i>=0;i--)
         {
             if (arr[i]!=i+1)
             {
                 res[0]=arr[i];
                 res[1]=i+1;
                 break;
             }
         }
         return res;
        
    }
}
