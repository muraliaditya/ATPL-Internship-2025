class Inherit2{
    public static void main(String args[]){
       Teacher t=new Teacher();
       t.details();
       Person p=new Person();
       p.details();
       Student s=new Student();
       s.details();
    }
}
class Person{
    String name="Ram";
    String gender="Male";
    public void details(){
        System.out.println(name);
        System.out.println(gender);
    }
}
class Student extends Person{
    String name="Raj";
    int rollno=111;
    int age=11;
    public  void details(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(age);
    }
}
class Teacher extends Person{
    String name="Roy";
    String dept="Science";
    public void details(){
        System.out.println(name);
        System.out.println(dept);
    }
}
