public class intersectionOfArrays {
    //intersection of 2 arrays. 
    public static void intersection(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int min = Math.min(n,m);
        int arr[]=new int[min];
        int index=0;



        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    arr[index++]=arr2[j];
                    break;
                }
            }
        }
        for(int i=0;i<index;i++) System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,3,5,6};
        intersection(arr1, arr2);
    }
}
