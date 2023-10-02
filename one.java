/**
 * one
 */
public class one {
   final int x = 10;
    String name = "Anurag";

    // public one(int x, String name){
    //     this.x = x;
    //     this.name = name;
    // }

    public static void main(String[] args) {
        one myOne = new one();
        System.out.print(myOne.x + " \n");
        System.out.println(myOne.name);
    }

}


/**
 * Innerone
 */
  class second extends one {
    int number = 23456;
    double value = 9000.9;

    static void call(){
        System.out.println("This is Static method without making object we can call directly" );
    }

    public  void call_public(){
        System.out.println("This is public method with making object we can call directly");
    }
    public static void main(String[] args) {

        second th = new second();
        th.name = "Anurag_Robotics";
        // System.out.println(th.name);
        // System.out.println(th.x);
        // System.out.println(th.value);

        // call();
        // second my = new second();
        // my.call_public();

    }
    
}
