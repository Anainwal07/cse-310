class Cricket{
    class Prizes{

        static final int prizeMoney=10000;//static can only be used outside the method . not inside the method

        void distributionPrizes(){//we can access the variables and method of outer classs in the inner calss
            System.out.println(numberOfPlayers);
            System.out.println(score);
            calculateScore(100); 
            System.out.println(prizeMoney);
            
        }
    }

    int numberOfPlayers;
    static int score = 50;
    
    void calculateScore(int x ){
        score+=x;
        System.out.println("New score is : "+score);
        /*Prizes p = new Prizes();
        p.distributionPrizes();*///we can create the object of hte inner class inside the outer class(for that we don't need the instance of the outer class) . But the method should not be static 
    }
    /*staic void calculateScore(){
        Prizes p = new Cricket().new Prizes();// if the mehtod is static 
    } */
}
class Main{
    public static void main(String[] args) {
        Cricket c = new Cricket();
        Cricket.Prizes p = c.new Prizes();// Syntax : - to create the object of hte inner class 
        p.distributionPrizes();//Accessing the member of the inner class using object of the inner class
    }
}

//create a class named as person .. add  methodu get_Adhar() 
class Person{
    class Aadhar{
        long num=23432432532423L;
        void display(){
            System.out.println(num);
        }
    }
    Aadhar a = new Aadhar();
    Aadhar getAadhar(){
        try{
            return a ;
        }catch(Exception x){
            return new Aadhar();
        }
    }
}
class Main2{
    public static void main(String[] args) {
        new Person().getAadhar().display();
    }
}

class Student{
    void calMarks(){
        class Subjects{
             static int i = 10;s
        }
    }
}