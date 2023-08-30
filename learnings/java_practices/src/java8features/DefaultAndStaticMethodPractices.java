package java8features;

interface Sounds{

//    abstrat methods
    void dog();
    void cow();

    //Default method
    default void cat(){
        System.out.println("I Meowwwww.....");
    }

//    static methods
    static void snake(){
        System.out.println("I Hisssss......");
    }
}

public class DefaultAndStaticMethodPractices implements Sounds {
    public static void main(String[] args) {
        Sounds soundOf = new DefaultAndStaticMethodPractices();

//        calling abstract methods of Sounds interface using object
        soundOf.dog();
        soundOf.cow();

//       calling static methods of Sounds interface using class
        Sounds.snake();

//        calling default methods of Sounds interface using object
//        default methods available when object is created
        soundOf.cat();
//        Sounds.cat(); invalid
    }

    @Override
    public void dog() {
        System.out.println("I Bark......");
    }

    @Override
    public void cow() {
        System.out.println("I Moooooo......");
    }
}
