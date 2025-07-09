public class Laptop {
    String brand;
    int ram;
    int processor;
    public Laptop(){

    }
    public Laptop(String brand,int ram,int processor){
          this.brand=brand;
          this.ram=ram;
          this.processor=processor;  
          System.out.println("brand :"+brand+" ram :"+ram+"gb processor :"+processor);
    }
    public static void main(String args[]){
        Laptop l=new Laptop();
        Laptop l1=new Laptop("Lenovo",8,11);
    }

}
