package Basics.A;

import static Basics.A.hello.message;//how the import is work

public class B {
    public static void main(String [] args){
        System.out.println("This the message from her ");
        message();//how the system import the pakages

        Human chandan=new Human("chandan dutta",22,false);

    }
}
class Human{
    String name;
    int age;
    boolean married;
    //when we use the static if something common for all
    static int population;
    Human(String name,int age , boolean married){
       this.name =name;
       this.age=age;
       this.married=married;
       Human.population +=1;//if some thing staic variable use class name not "this"
    }
}
