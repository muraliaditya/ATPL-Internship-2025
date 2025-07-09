import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<String> ar=new ArrayList<>();
        ar.add("Ram");
        ar.add("Jay");
        ar.add("Raj");
        ar.add("Roy");
        ar.add("Dev");

        for(int i=0;i<ar.size();i++){
            String names=ar.get(i);
             System.out.println(names);
         }

        // for(String name:ar){
        //     System.out.println(name);
        // }
        System.out.println("Using Enhanced for loop and removing 3rd element");

        ar.remove(2);
        
        for(String i:ar){
             System.out.println(i);
        }

    }
}
