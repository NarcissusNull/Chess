package javaSource;

import java.util.LinkedList;
import java.util.Queue;

public class chessManZu extends chessMan{
    //“卒”
    chessManZu(double x, double y, int type) {
        super(x, y, type);
    }

    @Override
    public Queue<Double> getNext(){
        //TODO
        Queue<Double> queue = new LinkedList<>();
        int Y = (int) (x-177)/50;
        int X = (int) (y-77)/50;
        if(type==0){
            if(X==3||X==4){
                //黑卒未过河
                if(runType.allChessMan[X+1][Y] > 100||runType.allChessMan[X+1][Y] == 0){
                    //黑卒向下一格是红棋或者没有棋子
                   queue.offer(x+0) ;
                   queue.offer(y+50);
                }
            }else{
                //黑卒已过河
                if(Y > 0){
                    //可以向左一步
                    if(runType.allChessMan[X][Y-1] > 100||runType.allChessMan[X][Y-1] == 0){
                    //黑卒向左一格是红棋或者没有棋子
                        queue.offer(x-50);
                        queue.offer(y+0);
                    }
                }

                if(Y < 8){
                    //可以向右一步
                    if(runType.allChessMan[X][Y+1] > 100||runType.allChessMan[X][Y+1] == 0){
                        //黑卒向右一格是红棋或者没有棋子
                        queue.offer(x+50);
                        queue.offer(y+0);
                    }
                }

                if(X < 9){
                    //可以向下一步
                    if(runType.allChessMan[X+1][Y] > 100||runType.allChessMan[X+1][Y] == 0){
                       //黑卒向前下一格是红棋或者没有棋子
                        queue.offer(x+0);
                        queue.offer(y+50);
                    }
                }
            }

        }else if(type==1){
            if(X==5||X==6){
                //红兵未过河
                if(runType.allChessMan[X-1][Y] < 100||runType.allChessMan[X-1][Y] == 0){
                    //红兵向上一格是黑棋或者没有棋子
                    queue.offer(x+0) ;
                    queue.offer(y-50);
                }
            }else{
                //红兵已过河
                if(Y > 0){
                    //可以向左一步
                    if(runType.allChessMan[X][Y-1] < 100||runType.allChessMan[X][Y-1] == 0){
                        //红兵向左一格是黑棋或者没有棋子
                        queue.offer(x-50);
                        queue.offer(y+0);
                    }
                }

                if(Y < 8){
                    //可以向右一步
                    if(runType.allChessMan[X][Y+1] < 100||runType.allChessMan[X][Y+1] == 0){
                        //红兵向右一格是黑棋或者没有棋子
                        queue.offer(x+50);
                        queue.offer(y+0);
                    }
                }

                if(X > 0){
                    //可以向上一步
                    if(runType.allChessMan[X-1][Y] < 100||runType.allChessMan[X-1][Y] == 0){
                        //红兵向右一格是黑棋或者没有棋子
                        queue.offer(x+0);
                        queue.offer(y-50);
                    }
                }
            }
        }

        return queue;
    }
}
