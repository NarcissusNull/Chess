package javaSource;

import java.util.LinkedList;
import java.util.Queue;

public class chessManShi extends chessMan {
    //“士”
    chessManShi(double x, double y, int type) {
        super(x, y, type);
    }

    @Override
    public Queue<Double> getNext() {
        Queue<Double> queue = new LinkedList<>();
        if(type==0){
            if(x == 377){
                //士在九宫中心需要判断九宫四个角
                 if(runType.allChessMan[0][3] > 100||runType.allChessMan[0][3] == 0){
                     queue.offer(327.0);
                     queue.offer(77.0);
                 }
                if(runType.allChessMan[0][5] > 100||runType.allChessMan[0][5] == 0){
                    queue.offer(427.0);
                    queue.offer(77.0);
                }
                if(runType.allChessMan[2][3] > 100||runType.allChessMan[2][3] == 0){
                    queue.offer(327.0);
                    queue.offer(177.0);
                }
                if(runType.allChessMan[2][5] > 100||runType.allChessMan[2][5] == 0){
                    queue.offer(427.0);
                    queue.offer(177.0);
                }
            }else {
                //士不在九宫中心只需判断九宫中心
                if (runType.allChessMan[1][4] > 100 || runType.allChessMan[1][4] == 0) {
                    queue.offer(377.0);
                    queue.offer(127.0);
                }
            }
        }else {
            if(x == 377){
                //士在九宫中心需要判断九宫四个角
                if(runType.allChessMan[9][3] < 100||runType.allChessMan[9][3] == 0){
                    queue.offer(327.0);
                    queue.offer(527.0);
                }
                if(runType.allChessMan[9][5] < 100||runType.allChessMan[9][5] == 0){
                    queue.offer(427.0);
                    queue.offer(527.0);
                }
                if(runType.allChessMan[7][3] < 100||runType.allChessMan[7][3] == 0){
                    queue.offer(327.0);
                    queue.offer(427.0);
                }
                if(runType.allChessMan[7][5] < 100||runType.allChessMan[7][5] == 0){
                    queue.offer(427.0);
                    queue.offer(427.0);
                }
            }else {
                //士不在九宫中心只需判断九宫中心
                if (runType.allChessMan[8][4] < 100 || runType.allChessMan[8][4] == 0) {
                    queue.offer(377.0);
                    queue.offer(477.0);
                }
            }
        }
        return queue;
    }
}
