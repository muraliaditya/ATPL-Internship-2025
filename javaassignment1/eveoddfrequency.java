
public class eveoddfrequency {
    public static void main(String args[]){
        int arr[]={714,8,42,67,97};
        int eve=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                eve++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even count="+eve+" "+"odd count="+odd);
    }
}