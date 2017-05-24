package javaSource;

import java.util.LinkedList;
import java.util.Queue;

public class chessManPao extends chessMan{
    //“炮”
    chessManPao(double x, double y, int type) {
        super(x, y, type);
    }

    @Override
    public Queue<Double> getNext() {
        //TODO
        Queue<Double> queue = new LinkedList<>();
        int Y = (int) (x-177)/50;
        int X = (int) (y-77)/50;
        if (type == 0) {
            for (int i = X-1; i >= 0; i--) {
                //向上寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    for(int j = i-1;j >=0;j--){
                        if(runType.allChessMan[j][Y] > 100){
                            queue.offer(x);
                            queue.offer((double) (77 + j * 50));
                            break;
                        }
                    }
                    break;
                }
            }
            for (int i = X+1; i <= 9; i++) {
                //向下寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    for(int j = i+1;j <= 9;j++){
                        if(runType.allChessMan[j][Y] > 100){
                            queue.offer(x);
                            queue.offer((double) (77 + j * 50));
                            break;
                        }
                    }
                    break;
                }
            }
            for (int i = Y-1; i >= 0; i--) {
                //向左寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    for(int j = i-1;j >= 0;j--){
                        if(runType.allChessMan[X][j] > 100){
                            queue.offer((double) (177+j*50));
                            queue.offer(y);
                            break;
                        }
                    }
                    break;
                }
            }
            for (int i = Y+1; i <= 8; i++) {
                //向右寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    for(int j = i+1;j <= 8;j++){
                        if(runType.allChessMan[X][j] > 100){
                            queue.offer((double) (177+j*50));
                            queue.offer(y);
                            break;
                        }
                    }
                    break;
                }
            }
        } else {
            for (int i = X-1; i >= 0; i--) {
                //向上寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    for(int j = i-1;j >= 0;j--){
                        if(runType.allChessMan[j][Y] < 100&&runType.allChessMan[j][Y]!=0){
                            queue.offer(x);
                            queue.offer((double) (77 + j * 50));
                            break;
                        }
                    }
                    break;
                }
            }
            for (int i = X+1; i <= 9; i++) {
                //向下寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    for(int j = i+1;j <= 9;j++){
                        if(runType.allChessMan[j][Y] < 100&&runType.allChessMan[j][Y]!=0){
                            queue.offer(x);
                            queue.offer((double) (77 + j * 50));
                            break;
                        }
                    }
                    break;
                }
            }
            for (int i = Y-1; i >= 0; i--) {
                //向左寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    for(int j = i-1;j >= 0;j--){
                        if(runType.allChessMan[X][j] < 100&&runType.allChessMan[X][j]!=0){
                            queue.offer((double) (177+j*50));
                            queue.offer(y);
                            break;
                        }
                    }
                    break;
                }
            }
            for (int i = Y+1; i <= 8; i++) {
                //向右寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    for(int j = i+1;j <= 8;j++){
                        if(runType.allChessMan[X][j] < 100&&runType.allChessMan[X][j]!=0){
                            queue.offer((double) (177+j*50));
                            queue.offer(y);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return queue;
    }
}
