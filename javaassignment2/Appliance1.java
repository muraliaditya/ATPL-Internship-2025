abstract class Appliance {
    abstract void turnon();
    abstract void turnoff();
}

class Fan extends Appliance {
    void turnon()
    { 
        System.out.println("fan on");
    }
    void turnoff()
    { 
        System.out.println("fan off"); 
    }
}

class TV extends Appliance {
    void turnon()
    { 
        System.out.println("tv on"); 
    }
    void turnoff() 
    {
         System.out.println("tv off");
    }
}
class Appliance1 {
    public static void main(String[] args) {
        
    Fan f=new Fan();
    f.turnon();
    f.turnoff();

    TV t=new TV();
    t.turnon();
    t.turnoff();
    }

}