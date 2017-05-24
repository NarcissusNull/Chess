package javaSource;

import java.util.LinkedList;
import java.util.Queue;

public class chessManJu extends chessMan {
    //“车”
    chessManJu(double x, double y, int type) {
        super(x, y, type);
    }

    @Override
    public Queue<Double> getNext() {
        Queue<Double> queue = new LinkedList<>();
        int Y = (int) (x - 177) / 50;
        int X = (int) (y - 77) / 50;
        if (type == 0) {
            for (int i = X-1; i >= 0; i--) {
                //向上寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    if (runType.allChessMan[i][Y] < 100)
                        break;
                    else {
                        queue.offer(x);
                        queue.offer((double) (77 + i * 50));
                        break;
                    }
                }
            }
            for (int i = X+1; i <= 9; i++) {
                //向下寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    if (runType.allChessMan[i][Y] < 100)
                        break;
                    else {
                        queue.offer(x);
                        queue.offer((double) (77 + i * 50));
                        break;
                    }
                }
            }
            for (int i = Y-1; i >= 0; i--) {
                //向左寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    if (runType.allChessMan[X][i] < 100){
                        break;
                    }else {
                        queue.offer((double) (177+i*50));
                        queue.offer(y);
                        break;
                    }
                }
            }
            for (int i = Y+1; i <= 8; i++) {
                //向右寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    if (runType.allChessMan[X][i] < 100)
                        break;
                    else {
                        queue.offer((double) (177+i*50));
                        queue.offer(y);
                        break;
                    }
                }
            }
        } else {
            for (int i = X-1; i >= 0; i--) {
                //向上寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    if (runType.allChessMan[i][Y] > 100)
                        break;
                    else {
                        queue.offer(x);
                        queue.offer((double) (77 + i * 50));
                        break;
                    }
                }
            }
            for (int i = X+1; i <= 9; i++) {
                //向下寻找可移动的坐标
                if (runType.allChessMan[i][Y] == 0) {
                    queue.offer(x);
                    queue.offer((double) (77 + i * 50));
                } else {
                    if (runType.allChessMan[i][Y] > 100)
                        break;
                    else {
                        queue.offer(x);
                        queue.offer((double) (77 + i * 50));
                        break;
                    }
                }
            }
            for (int i = Y-1; i >= 0; i--) {
                //向左寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    if (runType.allChessMan[X][i] > 100)
                        break;
                    else {
                        queue.offer((double) (177+i*50));
                        queue.offer(y);
                        break;
                    }
                }
            }
            for (int i = Y+1; i <= 8; i++) {
                //向右寻找可移动的坐标
                if (runType.allChessMan[X][i] == 0) {
                    queue.offer((double) (177+i*50));
                    queue.offer(y);
                } else {
                    if (runType.allChessMan[X][i] > 100)
                        break;
                    else {
                        queue.offer((double) (177+i*50));
                        queue.offer(y);
                        break;
                    }
                }
            }
        }
        return queue;
    }
}

