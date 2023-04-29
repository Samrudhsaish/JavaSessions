public class Test {
    int square(int num){
        return num*num;
    }
    int rec(int x,int y){
        return x*y;
    }
    public static void main (String[]args){
        Test t=new Test();
        System.out.println(t.square(3));
        System.out.println(t.rec(5,(3)));
    }
}
