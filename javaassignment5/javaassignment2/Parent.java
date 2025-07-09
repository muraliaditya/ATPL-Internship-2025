class Parent1 {
    Parent1()
    {
         System.out.println("Parent"); 
    }
}

class Child extends Parent1 {
    Child() 
    {
        super();
        System.out.println("Child");
    }
}
class Parent {
    public static void main(String[] args) {
        Child c=new Child();
        
    }
}
