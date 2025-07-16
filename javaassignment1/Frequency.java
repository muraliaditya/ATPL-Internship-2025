class Frequency {
    public static void main(String[] args) {
        int arr1[]={10,20,20,10,30,10};
        int exist=0;
        for(int i=0;i<arr1.length-1;i++){
            int count=1;
            if(arr1[i]==exist){
                continue;
            }
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    count++;
                    arr1[j]=exist;
                }
            }
            System.out.println(arr1[i]+"frequency is"+count);
        }
        
    }
}

