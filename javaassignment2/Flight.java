public class Flight {
    int flightnumber;
    String destination;
    int duration;

    public Flight(){

    }
    public Flight(int flightnumber,String destination,int duration){
        this.flightnumber=flightnumber;
        this.destination=destination;
        this.duration=duration;

        System.out.println("flightnumber: "+flightnumber+"destination"+destination+"duration:"+duration);
    }

    public static void main(String args[]){
        Flight f=new Flight();
        Flight f1=new Flight(1001,"goa",3);
    }
}
