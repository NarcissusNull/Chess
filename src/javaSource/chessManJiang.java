package javaSource;

import java.util.LinkedList;
import java.util.Queue;

public class chessManJiang extends chessMan {
    //“将”
    chessManJiang(double x, double y, int type) {
        super(x, y, type);
    }

    @Override
    public Queue<Double> getNext() {
        Queue<Double> queue = new LinkedList<>();
        int Y = (int) (x - 177) / 50;
        int X = (int) (y - 77) / 50;
        if (type == 0) {
            if (X - 1 >= 0 && (runType.allChessMan[X - 1][Y] > 100 || runType.allChessMan[X - 1][Y] == 0)) {
                //向上走
                queue.offer(x);
                queue.offer(y - 50);
            }
            if (X + 1 <= 2 && (runType.allChessMan[X + 1][Y] > 100 || runType.allChessMan[X + 1][Y] == 0)) {
                //向下走
                queue.offer(x);
                queue.offer(y + 50);
            }
            if (Y - 1 >= 3 && (runType.allChessMan[X][Y - 1] > 100 || runType.allChessMan[X][Y - 1] == 0)) {
                //向左走
                queue.offer(x - 50);
                queue.offer(y);
            }
            if (Y + 1 <= 5 && (runType.allChessMan[X][Y + 1] > 100 || runType.allChessMan[X][Y + 1] == 0)) {
                //向右走
                queue.offer(x + 50);
                queue.offer(y);
            }
        } else {
            if (X - 1 >= 7 && (runType.allChessMan[X - 1][Y] < 100 || runType.allChessMan[X - 1][Y] == 0)) {
                //向上走
                queue.offer(x);
                queue.offer(y - 50);
            }
            if (X + 1 <= 9 && (runType.allChessMan[X + 1][Y] < 100 || runType.allChessMan[X + 1][Y] == 0)) {
                //向下走
                queue.offer(x);
                queue.offer(y + 50);
            }
            if (Y - 1 >= 3 && (runType.allChessMan[X][Y - 1] < 100 || runType.allChessMan[X][Y - 1] == 0)) {
                //向左走
                queue.offer(x - 50);
                queue.offer(y);
            }
            if (Y + 1 <= 5 && (runType.allChessMan[X][Y + 1] < 100 || runType.allChessMan[X][Y + 1] == 0)) {
                //向右走
                queue.offer(x + 50);
                queue.offer(y);
            }
        }
        return queue;
    }
}
