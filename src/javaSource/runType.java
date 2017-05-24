package javaSource;

public class runType {
    //运行的参数
    //其中对应界面的x是各个数组的y，对应界面的y是各个
    public static int currentType;
    //当前走棋的颜色 奇数-黑棋,偶数-红棋
    public static int heiSum;
    //黑棋被吃总数
    public static int hongSum;
    //红棋被吃总数
//    public static int[][] heiLayOut     = new int[16][2];
//    //当前所有黑棋坐标
    public static int[][] heiReady      = new int[16][2];
    //被吃黑棋坐标
//    public static int[][] hongLayOut    = new int[16][2];
//    //当前所有红棋坐标
    public static int[][] hongReady     = new int[16][2];
    //被吃红棋坐标
    public static int[][] allChessMan   = new int[10][9];
    //每个坐标的棋子类型
    public static int[][] allNext       = new int[17][2];
    //每个next都坐标
    public static int currentChessMan;
    //当前操作的棋子
    // 1-黑将 2-黑士 3-黑象 4-黑车 5-黑馬 6-黑炮 7-黑卒
    //11-红帅 12-红仕 13-红相 14-红车 15-红馬 16-红炮 17-红兵

    public static void initCurrentChessMan() {
        //初始化当前操作棋子
        currentChessMan = 0;
        currentType     = 0;
    }

    public static void initSum(){
        //初始化被吃总数
        heiSum = 0;
        hongSum = 0;
    }

//    public static void initRunType(){
//        //初始化所有棋子的坐标
//        heiLayOut[0][0] = 0;   heiLayOut[0][1] = 0;
//        //heiju1
//        heiLayOut[1][0] = 1;   heiLayOut[1][1] = 0;
//        //heima1
//        heiLayOut[2][0] = 2;   heiLayOut[2][1] = 0;
//        //heixiang1
//        heiLayOut[3][0] = 3;   heiLayOut[3][1] = 0;
//        //heishi1
//        heiLayOut[4][0] = 4;   heiLayOut[4][1] = 0;
//        //heijiang
//        heiLayOut[5][0] = 5;   heiLayOut[5][1] = 0;
//        //heishi2
//        heiLayOut[6][0] = 6;   heiLayOut[6][1] = 0;
//        //heixiang2
//        heiLayOut[7][0] = 7;   heiLayOut[7][1] = 0;
//        //heima2
//        heiLayOut[8][0] = 8;   heiLayOut[8][1] = 0;
//        //heiju2
//
//        heiLayOut[9][0]    = 1;    heiLayOut[9][1]    = 2;
//        //heipao1
//        heiLayOut[10][0]   = 7;    heiLayOut[10][0]   = 2;
//        //heipao2
//
//        heiLayOut[11][0] = 0;   heiLayOut[11][1] = 3;
//        //heizu1
//        heiLayOut[12][0] = 0;   heiLayOut[12][1] = 3;
//        //heizu2
//        heiLayOut[13][0] = 0;   heiLayOut[13][1] = 3;
//        //heizu3
//        heiLayOut[14][0] = 0;   heiLayOut[14][1] = 3;
//        //heizu4
//        heiLayOut[15][0] = 0;   heiLayOut[15][1] = 3;
//        //heizu5
//
//        hongLayOut[0][0] = 0;   hongLayOut[0][1] = 9;
//        //hongju1
//        hongLayOut[1][0] = 1;   hongLayOut[1][1] = 9;
//        //hongma1
//        hongLayOut[2][0] = 2;   hongLayOut[2][1] = 9;
//        //hongxiang1
//        hongLayOut[3][0] = 3;   hongLayOut[3][1] = 9;
//        //hongshi1
//        hongLayOut[4][0] = 4;   hongLayOut[4][1] = 9;
//        //hongshuai
//        hongLayOut[5][0] = 5;   hongLayOut[5][1] = 9;
//        //hongshi2
//        hongLayOut[6][0] = 6;   hongLayOut[6][1] = 9;
//        //hongxiang2
//        hongLayOut[7][0] = 7;   hongLayOut[7][1] = 9;
//        //hongma2
//        hongLayOut[8][0] = 8;   hongLayOut[8][1] = 9;
//        //hongju2
//
//        hongLayOut[9][0]    = 1;    hongLayOut[9][1]    = 7;
//        //hongpao1
//        hongLayOut[10][0]   = 7;    hongLayOut[10][0]   = 7;
//        //hongpao2
//
//        hongLayOut[11][0] = 0;   hongLayOut[11][1] = 6;
//        //hongbing1
//        hongLayOut[12][0] = 0;   hongLayOut[12][1] = 6;
//        //hongbing2
//        hongLayOut[13][0] = 0;   hongLayOut[13][1] = 6;
//        //hongbing3
//        hongLayOut[14][0] = 0;   hongLayOut[14][1] = 6;
//        //hongbing4
//        hongLayOut[15][0] = 0;   hongLayOut[15][1] = 6;
//        //hongbing5
//    }

    public static void initReady(){
        //初始化被吃棋子坐标
        heiReady[0][0] = 10;    heiReady[0][1] = 0;
        heiReady[1][0] = 11;    heiReady[1][1] = 0;
        heiReady[2][0] = 12;    heiReady[2][1] = 0;
        heiReady[3][0] = 13;    heiReady[3][1] = 0;

        heiReady[4][0] = 10;    heiReady[4][1] = 1;
        heiReady[5][0] = 11;    heiReady[5][1] = 1;
        heiReady[6][0] = 12;    heiReady[6][1] = 1;
        heiReady[7][0] = 13;    heiReady[7][1] = 1;

        heiReady[8][0]  = 10;    heiReady[8][1]  = 2;
        heiReady[9][0]  = 11;    heiReady[9][1]  = 2;
        heiReady[10][0] = 12;    heiReady[10][1] = 2;
        heiReady[11][0] = 13;    heiReady[11][1] = 2;

        heiReady[12][0] = 10;    heiReady[12][1] = 3;
        heiReady[13][0] = 11;    heiReady[13][1] = 3;
        heiReady[14][0] = 12;    heiReady[14][1] = 3;
        heiReady[15][0] = 13;    heiReady[15][1] = 3;

        hongReady[0][0] = 10;    hongReady[0][1] = 6;
        hongReady[1][0] = 11;    hongReady[1][1] = 6;
        hongReady[2][0] = 12;    hongReady[2][1] = 6;
        hongReady[3][0] = 13;    hongReady[3][1] = 6;

        hongReady[4][0] = 10;    hongReady[4][1] = 7;
        hongReady[5][0] = 11;    hongReady[5][1] = 7;
        hongReady[6][0] = 12;    hongReady[6][1] = 7;
        hongReady[7][0] = 13;    hongReady[7][1] = 7;

        hongReady[8][0]  = 10;    hongReady[8][1]  = 8;
        hongReady[9][0]  = 11;    hongReady[9][1]  = 8;
        hongReady[10][0] = 12;    hongReady[10][1] = 8;
        hongReady[11][0] = 13;    hongReady[11][1] = 8;

        hongReady[12][0] = 10;    hongReady[12][1] = 9;
        hongReady[13][0] = 11;    hongReady[13][1] = 9;
        hongReady[14][0] = 12;    hongReady[14][1] = 9;
        hongReady[15][0] = 13;    hongReady[15][1] = 9;
    }

//    public static void initAllNext(){
//       //初始化所有next
//        for(int i = 0;i < 17;i++){
//            allNext[i][0] = 10;
//            allNext[i][1] = 0;
//        }
//    }


    public static void initAllChessMan(){
        //初始化棋盘所有点的棋子
        // 1-黑将 2-黑士 3-黑象 4-黑车 5-黑馬 6-黑炮 7-黑卒
        //11-红帅 12-红仕 13-红相 14-红车 15-红馬 16-红炮 17-红兵
        allChessMan[0][0] = 41;
        allChessMan[0][1] = 51;
        allChessMan[0][2] = 31;
        allChessMan[0][3] = 21;
        allChessMan[0][4] = 11;
        allChessMan[0][5] = 22;
        allChessMan[0][6] = 32;
        allChessMan[0][7] = 52;
        allChessMan[0][8] = 42;

        allChessMan[1][0] = 0;
        allChessMan[1][1] = 0;
        allChessMan[1][2] = 0;
        allChessMan[1][3] = 0;
        allChessMan[1][4] = 0;
        allChessMan[1][5] = 0;
        allChessMan[1][6] = 0;
        allChessMan[1][7] = 0;
        allChessMan[1][8] = 0;

        allChessMan[2][0] = 0;
        allChessMan[2][1] = 61;
        allChessMan[2][2] = 0;
        allChessMan[2][3] = 0;
        allChessMan[2][4] = 0;
        allChessMan[2][5] = 0;
        allChessMan[2][6] = 0;
        allChessMan[2][7] = 62;
        allChessMan[2][8] = 0;

        allChessMan[3][0] = 71;
        allChessMan[3][1] = 0;
        allChessMan[3][2] = 72;
        allChessMan[3][3] = 0;
        allChessMan[3][4] = 73;
        allChessMan[3][5] = 0;
        allChessMan[3][6] = 74;
        allChessMan[3][7] = 0;
        allChessMan[3][8] = 75;

        allChessMan[4][0] = 0;
        allChessMan[4][1] = 0;
        allChessMan[4][2] = 0;
        allChessMan[4][3] = 0;
        allChessMan[4][4] = 0;
        allChessMan[4][5] = 0;
        allChessMan[4][6] = 0;
        allChessMan[4][7] = 0;
        allChessMan[4][8] = 0;


        allChessMan[5][0] = 0;
        allChessMan[5][1] = 0;
        allChessMan[5][2] = 0;
        allChessMan[5][3] = 0;
        allChessMan[5][4] = 0;
        allChessMan[5][5] = 0;
        allChessMan[5][6] = 0;
        allChessMan[5][7] = 0;
        allChessMan[5][8] = 0;

        allChessMan[6][0] = 171;
        allChessMan[6][1] = 0;
        allChessMan[6][2] = 172;
        allChessMan[6][3] = 0;
        allChessMan[6][4] = 173;
        allChessMan[6][5] = 0;
        allChessMan[6][6] = 174;
        allChessMan[6][7] = 0;
        allChessMan[6][8] = 175;

        allChessMan[7][0] = 0;
        allChessMan[7][1] = 161;
        allChessMan[7][2] = 0;
        allChessMan[7][3] = 0;
        allChessMan[7][4] = 0;
        allChessMan[7][5] = 0;
        allChessMan[7][6] = 0;
        allChessMan[7][7] = 162;
        allChessMan[7][8] = 0;

        allChessMan[8][0] = 0;
        allChessMan[8][1] = 0;
        allChessMan[8][2] = 0;
        allChessMan[8][3] = 0;
        allChessMan[8][4] = 0;
        allChessMan[8][5] = 0;
        allChessMan[8][6] = 0;
        allChessMan[8][7] = 0;
        allChessMan[8][8] = 0;

        allChessMan[9][0] = 141;
        allChessMan[9][1] = 151;
        allChessMan[9][2] = 131;
        allChessMan[9][3] = 121;
        allChessMan[9][4] = 111;
        allChessMan[9][5] = 122;
        allChessMan[9][6] = 132;
        allChessMan[9][7] = 152;
        allChessMan[9][8] = 142;

    }

    public static void initAll(){
        //初始化
        initAllChessMan();
//        initAllNext();
        initCurrentChessMan();
        initReady();
//        initRunType();
        initSum();
    }
}
