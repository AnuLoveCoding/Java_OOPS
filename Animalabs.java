import java.time.LocalDate;

abstract class Animalabs {
    public abstract void animalsound();
    public void sleep(){
        System.out.println("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");


    }
}

class pig extends Animalabs{
    public  void animalsound(){
        System.out.println("This pig says : we wee");
    }
}


class sound{
    public static void main(String[] args) {
        // pig myPig = new pig();
        // myPig.animalsound();
        // myPig.sleep();

        
    
    }
}