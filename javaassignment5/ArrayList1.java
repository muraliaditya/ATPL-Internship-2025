import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<String> array1=new ArrayList<>();
        array1.add("Ram");
        array1.add("Jay");
        array1.add("Raj");
        array1.add("Roy");
        array1.add("Dev");

        for(int i=0;i<array1.size();i++){
            String names=array1.get(i);
             System.out.println(names);
         }

        // for(String name:ar){
        //     System.out.println(name);
        // }
        System.out.println("Using Enhanced for loop and removing 3rd element");

        array1.remove(2);
        
        for(String name:array1){
             System.out.println(name);
        }

    }
}
