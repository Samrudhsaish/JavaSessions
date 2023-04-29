public class Number {
    public static void main (String[]args){
        try {
            int[] n = {1, 2, 3, 4};
            System.out.println(n[2]);//present
            System.out.println(n[5]);//not present
        }catch(Exception e){
            System.out.println("5 not found in array");
        }
    }

    void r(String fileName){
       try{
           System.out.println("opens a file C:\\Users\\mangi\\Downloads\\HLR-Practical.html");
           System.out.println("reads a file");
           System.out.println("close a file");
       }catch(Exception e){
           System.out.println("not found file location");
       }

    }
}
