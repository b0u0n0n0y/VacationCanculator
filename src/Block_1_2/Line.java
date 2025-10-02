package Block_1_2;


import Block_1_1.Point;

public class Line {

    Point start;
    Point end;

    public Line(Point start,Point end){
        this.start = start;
        this.end = end;
    }


    public String toString(){
        return "Линия от " + start + " до " + end;
    }
}
