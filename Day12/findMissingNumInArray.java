public class findMissingNumInArray{
    public static void main(String[] args) {
        
    
    int arr[]={1,2,4,5,6};
    int n=arr.length+1;

    int TotalSum=n*(n+1)/2;
    int ActualSum=0;

    for(int i=0;i<arr.length;i++){
        ActualSum+=arr[i];
      
    }

     int  Missingnum = TotalSum-ActualSum;
     System.out.println(Missingnum);

}}