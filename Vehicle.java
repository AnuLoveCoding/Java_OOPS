public class Vehicle {
    protected String brand = "Honk";
    public void honk(){
        System.out.println("Tutt, Tuut");
    }

    public void bulletproof(){
        System.out.println(true);;
    }
}

class car extends Vehicle {
    private String modelname = "Mustang";
    public int  speed (){
        return  120;
    }

    public static void main(String[] args) {
        car myObj = new car();
        myObj.honk();
        System.out.println(myObj.brand+ "" + myObj.modelname + " " + myObj.speed());
        myObj.bulletproof();
    }
}
