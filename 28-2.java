//Interfaces in java
interface Macbook{
    //we can only define abstract methods in interfaces or can use default method to define a method
    
    //void work();//abstract method

    //default method
    default void work(){
        System.out.println("Working on default inside Macbook");
    }
    static void PlayGames(){
        System.out.println("Playgames");
    }
    
    void macbook_pro();
    void macbook_air();
    void playGames();

}

interface MacbookPro{
    /*default void work(){
        System.out.println("Working on default inside Macbook Pro");
    }*/
}
@FunctionalInterface interface Mac{// CANNot write more than two methods
    void why();
    //void notwhy();
    //void whynotwhy();
    /*default void work(){
        System.out.println("Working on default inside Macbook Pro");
    }*/
}
interface I1{
    
}
interface I2 extends I1{

}
 class Laptop implements Macbook, MacbookPro{

    
    public void macbook_pro(){
        System.out.println("This is macbook_pro");
    }
    public void macbook_air(){
        System.out.println("This is macbook air");
    }
    public void playGames(){
        System.out.println("Playing Games");
    }
}
class Main{
    public static void main(String[] args) {
        Laptop L = new Laptop();
        L.macbook_pro();
        L.macbook_air();
        L.work();
        L.playGames();
        Macbook.PlayGames();
        L.playGames();

    }    

}