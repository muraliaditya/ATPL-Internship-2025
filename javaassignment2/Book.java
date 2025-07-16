public class Book {
    String title;
    String author;
    int price;
    float discountpercentage;

    public void price_after_discount(String title,String author,int price,float discountpercentage){
        System.out.println(price-(discountpercentage*(discountpercentage/100)));
    }
    public static void main(String args[]){
        Book a=new Book();
        a.price_after_discount("Light","James",1110,11.11f);
        Book b=new Book();
        b.price_after_discount("wings of fire","kalam",1000,25.0f);
        Book c=new Book();
        c.price_after_discount("GOT","Stark",2300,50.0f);
    }
    
}
