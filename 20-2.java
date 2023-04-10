/*Method overloading : - When the parent class and child class have the same method name 
but different scope then it is called method overloading. In this case no objects of 
parent and child class are  necessary to call the method.*/
class Area11 {
    void area(int a){
        int area = a*a;
        System.out.println("Area of square is : "+area);
    }
    void area (int a, int b){
        int area = a*b;
        System.out.println("Area of rectangle is : "+area);
    }
}
class Main1{
    public static void main(String[] args) {
        new Area11().area(5);//calling method without creating object
        new Area11().area(5,8);
    }
}

/*Method overriding:- When the parent and child class have same method name and 
and same scope then it is called method overriding . In this case we have to use 
objects of both parent and child class to class the methods to remove ambiguity.*/
class Car{
    void drive(int speed){
        System.out.println("Driving a car");
    }
}
class WagonR extends Car{
    void drive (int speed){
        System.out.println("Driving a WagonR");
    }
    void fly(){
        System.out.println("Ordered wagon to fly");
    }
}
class Main2{
    public static void main(String[] args) {
        Car c = new Car();
        c.drive(100);
        WagonR w = new WagonR();
        w.drive(60);
        Car cc = new WagonR();//Only in the case of method overriding we can use parent class as refernce and create the object for child class
        cc.drive(120);
        //cc.fly(); It will give error because when the object of child class is drived
        //from the refernce parent class then the method should be overriden 
       // WagonR ww = new Car(); It will give error because the object of a parent class
       // cannot be called from the reference of a child class
       // ww.drive(60); error
    }
}