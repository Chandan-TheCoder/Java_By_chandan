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
        super(height ,lenth ,width);
        this.weight= weight;
    }

}
