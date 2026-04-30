package Basics;

public class Classconceept {
    public static void main(String[] args){
      Student chandan;
      chandan= new Student();
     // chandan.printthename(chandan.name);
      chandan.printthename2(chandan);//object full print
        Student kunal;
            // kunal = new Student(chandan);//for one object assgine the other object value
        kunal= new Student("kunal",23,69.36);
        chandan.printthename2(kunal);
    }
}

class Student{
    String name;
    int roll_no;
    double marks;
//    Student (){
//        name="Chandan";
//        roll_no=12;
//        marks=93.02;
//        //this is like defult
//    }
    Student(){
        this ("name",00,00.00);
        //now it is defult
        //and onr thing its like call constuctor inside the constuctar
    }
    Student(Student other1){
        this.name=other1.name;
        this.roll_no=other1.roll_no;
        this.marks=other1.marks;
    }
    Student(String name, int roll_no,double marks){
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
     void printthename( String name){
        System.out.println("The name is " +name);
    }
    void printthename2( Student other){
        System.out.println("my name is " +other.name);
        System.out.println("my roll number is " +other.roll_no);
        System.out.println("my marks is " +other.marks);
    }

}
