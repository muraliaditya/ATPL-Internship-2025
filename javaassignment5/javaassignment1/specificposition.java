public class specificposition {
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        int pos=2;
        int newnum=25;
        int arr1[]=new int[5];
        for(int i=0;i<arr1.length;i++){
            if(i<pos){
                arr1[i]=arr[i];
        
            }
            else if(i==pos){
                arr1[i]=newnum;

            }
            else if(i>pos){
                arr1[i]=arr[i-1];
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    
}
