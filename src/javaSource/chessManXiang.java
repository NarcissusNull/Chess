package javaSource;

import java.util.LinkedList;
import java.util.Queue;

public class chessManXiang extends chessMan{
    //“象”
    chessManXiang(double x, double y, int type) {
        super(x, y, type);
    }

    @Override
    public Queue<Double> getNext(){
        Queue<Double> queue = new LinkedList<>();
        int Y = (int) (x-177)/50;
        int X = (int) (y-77)/50;
        if(type==0){
           if(X-2>=0&&Y-2>=0&&runType.allChessMan[X-1][Y-1]==0&&(runType.allChessMan[X-2][Y-2] > 100||runType.allChessMan[X-2][Y-2]==0)) {
               //向左上角走
               queue.offer(x-100);
               queue.offer(y-100);
           }
           if(X-2>=0&&Y+2<=8&&runType.allChessMan[X-1][Y+1]==0&&(runType.allChessMan[X-2][Y+2] > 100||runType.allChessMan[X-2][Y+2]==0)) {
               //向右上角走
               queue.offer(x+100);
               queue.offer(y-100);
           }
           if(X+2<=4&&Y-2>=0&&runType.allChessMan[X+1][Y-1]==0&&(runType.allChessMan[X+2][Y-2] > 100||runType.allChessMan[X+2][Y-2]==0)) {
               //向左下角走
               queue.offer(x-100);
               queue.offer(y+100);
           }
           if(X+2<=4&&Y+2<=8&&runType.allChessMan[X+1][Y+1]==0&&(runType.allChessMan[X+2][Y+2] > 100||runType.allChessMan[X+2][Y+2]==0)) {
               //向右下角走
               queue.offer(x+100);
               queue.offer(y+100);
           }
        }else {
            if(X-2>=5&&Y-2>=0&&runType.allChessMan[X-1][Y-1]==0&&(runType.allChessMan[X-2][Y-2] < 100||runType.allChessMan[X-2][Y-2]==0)) {
                //向左上角走
                queue.offer(x-100);
                queue.offer(y-100);
            }
            if(X-2>=5&&Y+2<=8&&runType.allChessMan[X-1][Y+1]==0&&(runType.allChessMan[X-2][Y+2] < 100||runType.allChessMan[X-2][Y+2]==0)) {
                //向右上角走
                queue.offer(x+100);
                queue.offer(y-100);
            }
            if(X+2<=9&&Y-2>=0&&runType.allChessMan[X+1][Y-1]==0&&(runType.allChessMan[X+2][Y-2] < 100||runType.allChessMan[X+2][Y-2]==0)) {
                //向左下角走
                queue.offer(x-100);
                queue.offer(y+100);
            }
            if(X+2<=9&&Y+2<=8&&runType.allChessMan[X+1][Y+1]==0&&(runType.allChessMan[X+2][Y+2] < 100||runType.allChessMan[X+2][Y+2]==0)) {
                //向右下角走
                queue.offer(x+100);
                queue.offer(y+100);
            }
        }
        return queue;
    }
}
