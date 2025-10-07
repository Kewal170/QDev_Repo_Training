class StaticExample {
    static String schoolName = "Navodaya High School";
    static int count;

    StaticExample(){
        count++;
    }

    static int add(int num1 , int num2){
        return num1 + num2;
    }

    static {
        System.out.println("StaticExample class is loaded");
    }
}

public class Practical12 {
    public static void main(String[] args) {
        System.out.println("School name : " + StaticExample.schoolName);

        System.out.println("Adding 10 and 20 : " + StaticExample.add(10, 20));

        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();
        StaticExample s3 = new StaticExample();
        System.out.println(StaticExample.count);
    }    
}
