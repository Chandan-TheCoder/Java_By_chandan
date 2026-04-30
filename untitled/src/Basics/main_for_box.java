package Basics;

public class main_for_box {
    public static void main(String [] args){
        Box box;
        box=new Box(12,25,36);
        System.out.println(" Height " +box.h+" Weight " +box.w+" Lenth " +box.l);

        BoxWeight box1;
        box1= new BoxWeight(12,25,14,36);
        System.out.println(" Height " +box1.h+" Width " +box1.w+" Lenth " +box1.l +"box Weight " +box1.weight);
        // something new
        Box box5= new BoxWeight(10,15,58,14);
        //box5 is the parent class reference and which is objceted to Boxweight is child class object
        //point is I can access to modify and any yo all three parameter of the parent class except the chid class weight
        BoxWeight cube =new BoxWeight(25,25);
    }
}
