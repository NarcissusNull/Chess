package javaSource;

import java.util.Queue;

public abstract class chessMan {
    //所有棋子的父类
    protected double x;
    //坐标x
    protected double y;
    //坐标y
    protected int type;
    //黑棋为0，红棋为1

    chessMan(double x,double y,int type){
        //构造函数
       this.x      = x;
       this.y      = y;
       this.type   = type;
    }
   public abstract Queue<Double> getNext();
    //得到所有可以走的点的左边，按照x1,y1,x2,y2的次序进入队列
}

