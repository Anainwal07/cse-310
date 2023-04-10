//string handlind in Java
class Main{
    public static void main(String[] args) {
        String uni = "LPU";
        uni = "Lovely Professional University";
        System.out.println(uni);
    }
}
class Main1{
    public static void main(String[] args) {
        String s1 = new String();
        s1 = "University ";
        System.out.println(s1);
        String s2 = new String(s1);
        System.out.println(s2);
        String s3 = new String("Examples");
        System.out.println(s3);
        char arr[] = {'1','b','c','d','e','f'};
        String s4 = new String(arr);
        System.out.println(s4);
        byte brr[] = {74,76,76,56,45,98};
        String s5 = new String(brr);
        System.out.println(s5);
        String s6 = new String(arr,1,5);
        System.out.println(s6);
        String s7 = new String (brr,1,5);
        System.out.println(s7);
        String s8 = "one";
        String s9 = s8.concat("two");
        System.out.println(s9);
        String s10 = "Lovely Professional University";
        char c[] = s10.toCharArray();
        System.out.println(c);
        //convert all the first character of words to capital
        


    }
}
class Main3{
    public static void main(String[] args) {
        String s = "lovely professional university";
        char c[] = s.toCharArray();
        if(c[0]>='a' && c[0]<='z'){
            c[0]-=32;
        }
        for(int i = 1 ; i<c.length;i++){
            if(c[i]>='a' && c[i]<='z' && c[i-1]==' '){
                c[i] -=32;
            }
        }
        s = new String(c);
        System.out.println(s);

        String s2 = "I don't like JAVA";
        s2 = s2.replace("don't ","");
        System.out.println(s2);
        String s3 = "Kamal";
        char b[] = new char[10];
        b[0] = 'N'; b[1] = 'E';
        b[2] = 'E'; b[3] = 'L';
        s.getChars(0, 5, b, 4);
        System.out.println(b);
    }
}
