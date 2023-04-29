public class School {
    // Declare a method with return type Student class.
    Student m1(){
        System.out.println("m1()");
       /* Student st=new Student();
         return s;*/
        // We can replace line 5 and line 6 code by using a single line of code.
        return new Student(); // This line of code is generally used in the project level.
    }
    Employee m2() {
        System.out.println("m2()");
      /*  Employee emp=new Employee();
        return emp;*/
        return new Employee();
    }
    //Declare static method with return type string
    static String m3(){
        System.out.println("Jack");
        return "Jack";
    }
    public static void main (String[]args){
        School sc=new School();
        // Call m1() method using reference variable s and
        // store returning value by using a variable s.
        Student s=sc.m1();
        System.out.println(s);
        Employee e=sc.m2();
        System.out.println(e);
       // String
    }
}
