package javaSource;

import java.util.LinkedList;
import java.util.Queue;

public class chessManMa extends chessMan{
    //“馬”
    chessManMa(double x, double y, int type) {
        super(x, y, type);
    }

    @Override
    public Queue<Double> getNext() {
        //TODO
        Queue<Double> queue = new LinkedList<>();
        int Y = (int) (x-177)/50;
        int X = (int) (y-77)/50;
        if (type==0){
           if(X-1>=0&&runType.allChessMan[X-1][Y]==0){
               //向上不蹩马腿
               if(X-2>=0&&Y-1>=0&&(runType.allChessMan[X-2][Y-1] > 100||runType.allChessMan[X-2][Y-1]==0)){
                   queue.offer(x-50);
                   queue.offer(y-100);
               }
               if (X-2>=0&&Y+1<=8&&(runType.allChessMan[X-2][Y+1] > 100||runType.allChessMan[X-2][Y+1]==0)){
                   queue.offer(x+50);
                   queue.offer(y-100);
               }
           }
           if(X+1<=9&&runType.allChessMan[X+1][Y]==0){
              //向下不蹩马腿
              if(X+2<=9&&Y-1>=0&&(runType.allChessMan[X+2][Y-1] > 100||runType.allChessMan[X+2][Y-1]==0)){
                  queue.offer(x-50);
                  queue.offer(y+100);
              }
              if (X+2<=9&&Y+1<=8&&(runType.allChessMan[X+2][Y+1] > 100||runType.allChessMan[X+2][Y+1]==0)){
                  queue.offer(x+50);
                  queue.offer(y+100);
              }
           }
           if(Y-1>=0&&runType.allChessMan[X][Y-1]==0){
               //向左不蹩马腿
               if(X-1>=0&&Y-2>=0&&(runType.allChessMan[X-1][Y-2] > 100||runType.allChessMan[X-1][Y-2]==0)){
                   queue.offer(x-100);
                   queue.offer(y-50);
               }
               if (X+1<=9&&Y-2>=0&&(runType.allChessMan[X+1][Y-2] > 100||runType.allChessMan[X+1][Y-2]==0)){
                   queue.offer(x-100);
                   queue.offer(y+50);
               }
           }
           if(Y+1<=8&&runType.allChessMan[X][Y+1]==0){
               //向右不蹩马腿
               if(X-1>=0&&Y+2<=8&&(runType.allChessMan[X-1][Y+2] > 100||runType.allChessMan[X-1][Y+2]==0)){
                   queue.offer(x+100);
                   queue.offer(y-50);
               }
               if (X+1<=9&&Y+2<=8&&(runType.allChessMan[X+1][Y+2] > 100||runType.allChessMan[X+1][Y+2]==0)){
                   queue.offer(x+100);
                   queue.offer(y+50);
               }
           }
        }else {
            if(X-1>=0&&runType.allChessMan[X-1][Y]==0){
                //向上不蹩马腿
                if(X-2>=0&&Y-1>=0&&(runType.allChessMan[X-2][Y-1] < 100||runType.allChessMan[X-2][Y-1]==0)){
                    queue.offer(x-50);
                    queue.offer(y-100);
                }
                if (X-2>=0&&Y+1<=8&&(runType.allChessMan[X-2][Y+1] < 100||runType.allChessMan[X-2][Y+1]==0)){
                    queue.offer(x+50);
                    queue.offer(y-100);
                }
            }
            if(X+1<=9&&runType.allChessMan[X+1][Y]==0){
                //向下不蹩马腿
                if(X+2<=9&&Y-1>=0&&(runType.allChessMan[X+2][Y-1] < 100||runType.allChessMan[X+2][Y-1]==0)){
                    queue.offer(x-50);
                    queue.offer(y+100);
                }
                if (X+2<=9&&Y+1<=8&&(runType.allChessMan[X+2][Y+1] < 100||runType.allChessMan[X+2][Y+1]==0)){
                    queue.offer(x+50);
                    queue.offer(y+100);
                }
            }
            if(Y-1>=0&&runType.allChessMan[X][Y-1]==0){
                //向左不蹩马腿
                if(X-1>=0&&Y-2>=0&&(runType.allChessMan[X-1][Y-2] < 100||runType.allChessMan[X-1][Y-2]==0)){
                    queue.offer(x-100);
                    queue.offer(y-50);
                }
                if (X+1<=9&&Y-2>=0&&(runType.allChessMan[X+1][Y-2] < 100||runType.allChessMan[X+1][Y-2]==0)){
                    queue.offer(x-100);
                    queue.offer(y+50);
                }
            }
            if(Y+1<=8&&runType.allChessMan[X][Y+1]==0){
                //向右不蹩马腿
                if(X-1>=0&&Y+2<=8&&(runType.allChessMan[X-1][Y+2] < 100||runType.allChessMan[X-1][Y+2]==0)){
                    queue.offer(x+100);
                    queue.offer(y-50);
                }
                if (X+1<=9&&Y+2<=8&&(runType.allChessMan[X+1][Y+2] < 100||runType.allChessMan[X+1][Y+2]==0)){
                    queue.offer(x+100);
                    queue.offer(y+50);
                }
            }
        }
        return queue;
    }
}
