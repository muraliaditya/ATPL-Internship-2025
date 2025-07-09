public class secondlargest {
    public static void main(String[] args) {
        int arr[]={10,5,20,8,15};
        int max1=arr[0],max2=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max1){
            max2=max1;
            max1=arr[i];
           
        }
         if(arr[i]>max2 && arr[i]<max1){
                max2=arr[i];
            }
        }
        System.out.println(max2);
        System.out.println(max1);
    }
}
