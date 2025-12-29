public class mergedOfTwoArrays {
    public static void solution(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int merged[] = new int[n+m];

        for(int i=0;i<n;i++){
            merged[i]=arr1[i];
        }

        for(int i=0;i<m;i++){
            merged[i+n]=arr2[i];
        }

        for(int i:merged) System.out.println(i);

    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,44,55,77};
        int arr2[]={44,5,66};
        solution(arr1,arr2);
        
    }
}
