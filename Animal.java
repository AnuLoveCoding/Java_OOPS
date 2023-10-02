public class Animal {
    public void animalsound(){
        System.out.println("The animal make sound");
    }
}


class pig extends Animal {
    public void animalsound(){
        System.out.println("The pig make sound : wee wee");
    }
}

class Dog extends Animal {
    public void animalsound(){
        System.out.println("The dog make sound :: bow bow");
    }
}

class chand{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal mypig = new pig();
        Animal myDog = new Dog();

        myAnimal.animalsound();  
        mypig.animalsound();
        myDog.animalsound();  

        
    }
}