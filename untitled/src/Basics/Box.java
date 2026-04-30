package Basics;

public class Box {
    int l;
    int w;
    int h;
    Box(){
        this.l=1;
        this.w=1;
        this.h=1;
    }
    Box(int width , int lenth, int height ){
        this.l=lenth;
        this.w= width;
        this.h=height;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    Box(int side){
        this.l=this.w=this.h=side;
    }
}
class BoxWeight extends Box{
    int weight;
    BoxWeight(int height  , int lenth , int width, int weight){
        super(height ,lenth ,width);// used to call parent class constructure
        this.weight= weight;
    }
    BoxWeight(int side , int weight ){
        super(side);
        // super always first to declier before the child parameter other wise it show the r=error
        // if any super class not declerd the defult one is called
        this.weight=weight;
    }

    BoxWeight( BoxWeight other){
        super(other);//what is this ?
        // other is a box weight object but super is box class how it not show error
        // Box box5= new BoxWeight(10,15,58,14); same as parent class can refer the child object;
        this.weight=other.weight;
    }

}
class Boxweight1 extends Box{
    int weight;
    Boxweight1(int side , int weight ){
        super(side);
        this.weight=weight;
    }

}
