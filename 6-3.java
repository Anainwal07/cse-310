/*interface Developer{
    double salary = 6.5;//final , static , public
    void devCode();//abstract , public
    static void playGames(){
        System.out.println("Play Games");
    }    

}
class BEDeveloper implements Developer 
class Main{
    public static void main(String[] args) {
        Developer d = () -> System.out.println("Back End COde");
        d.devCode();
    }
}*/
//class Developer extends Thread
class Developer implements Runnable
{
    public void run(){
        for(int i = 0 ; i<10 ; i++){
            System.out.print(i+" ");
        }
    }
}
class Developer2 implements Runnable
//class Developer extends Thread
{
    public void run (){
        for (int i =90 ;i<=100;i++){
            System.out.print(i+" ");
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        Developer obj1 = new Developer();
        Developer2 obj2 = new Developer2();
        Thread th1 = new Thread(obj1);
        Thread th2 = new Thread(obj2);
        th1.start();
        th2.start();
        //obj1.start();
        //obj2.start();

    }
}
class Main3{
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for(int i = 0 ; i<10 ; i++){
                System.out.print(i+" ");
            }
        };
        Runnable r2 = () -> {
            for(int i = 90 ; i<100; i++){
                System.out.print(i+" ");
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}