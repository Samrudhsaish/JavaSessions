//cannot divide gold in java
//you can give it anyone of them
//mother dont want to show gold to rama
//but her child want to show  gold to rama by creating interface
class Mother {
    String gold="1 kg";
    //2 sons =sam,sri
    public void giving(){
        System.out.println("Giving 1kg  gold to sam");
    }
    }
class child extends Mother{
    String silver="1/2 kg";//he is having already 1/2 kg silver
    public void show(){
        System.out.println("showing gold");
    }
    public static void main (String[]args){
        child c=new child();
        c.giving();//sam
    }

}
