//Created a class named "Main1" with a variable x:
//Here chair and sofa are objects of furniture class
public class Furniture {
    //declared variable with value 2
    int x=2;
    int y;
    public static void main (String[]args){
        //creating object using class Furniture
        Furniture chair=new Furniture();
        System.out.println(chair.x);
        System.out.println(chair.y);

        //creating multiple objects using class Furniture
        Furniture sofa=new Furniture();
        System.out.println(sofa.x);
        System.out.println(sofa.y);
    }

}
