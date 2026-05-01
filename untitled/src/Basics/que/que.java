package Basics.que;

public class que {
    public static void main(String []args){
        String name1="Chandan";
        String name2="Chandan";
        System.out.println(name1==name2);
        //the ans is true so both are same object
        //name1 and name2 refecnce same .
        name1=name1 + " Dutta";
        System.out.println(name1==name2);
        //it's ans false so new name1 object created
        //Reassigning a String variable creates a new object instead of modifying the old one.
        System.out.println(name1);
    }
}
