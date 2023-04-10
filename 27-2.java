//CompareTo method 
class Main{
    public static void main(String[] args) {
        System.out.println("He".compareTo("Hi"));//-4
        System.out.println("Hi".compareTo("Hey"));//4
        System.out.println("Hey".compareTo("Hi"));//-4
        System.out.println("He".compareTo("Hell"));//-2
        System.out.println("Hell".compareTo("He"));//2
    }
}
//Q1 . Display second occurence of a in the string " Java Language".
class Main2 {
    public static void main(String[] args) {
        String st = " Java Language ";
        System.out.println(st.indexOf('a'));//2
        System.out.println(st.lastIndexOf(st,1));
    }
}
//Q2 . Use replace method to replace a substring from a string .
class Main3{
    public static void main(String[] args) {
        String s  = "I am writing the text ";
        System.out.println(s.replace(" am ", " was "));
        String s2 = "I am learning programming ";
        System.out.println(s2.replaceFirst("am", "was"));
    }
}
//trim() method is use to remove the white spaces from a string .
//split() method is use to split the string .
class Main4{
    public static void main(String[] args) {
        String str = "have-fun-in-java@blogspot@in";
        String []s = str.split("-",-2);
        for(String x:s)System.out.println(x);
        s = str.split("-", 3);
        for(String i : s){
            System.out.println(i);
        }
    }
}
class Main5{
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("abcdef");
        b.delete(4, 6);
        b.ensureCapacity(22);
        System.out.println(b.capacity());
        b.ensureCapacity(23);
        System.out.println(b.capacity());
        b.setLength(2);
        System.out.println(b.length());
        System.out.println(b);
    }
}