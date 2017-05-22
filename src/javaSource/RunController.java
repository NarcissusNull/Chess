package javaSource;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.Queue;
import java.util.ResourceBundle;

public class RunController implements Initializable {

    public volatile double xx;
    public volatile double yy;
    private Button currentChessMan;
    @FXML
    private ImageView qipan;
    @FXML
    private Button beginGame;
    @FXML
    private Button withdraw;
    @FXML
    private Button Stalemate;
    @FXML
    private Button giveUp;
    @FXML
    private Button record;
    @FXML
    private Button heizu1;
    @FXML
    private Button heizu2;
    @FXML
    private Button heizu3;
    @FXML
    private Button heizu4;
    @FXML
    private Button heizu5;
    @FXML
    private Button heipao1;
    @FXML
    private Button heipao2;
    @FXML
    private Button heijiang;
    @FXML
    private Button heishi1;
    @FXML
    private Button heishi2;
    @FXML
    private Button heixiang1;
    @FXML
    private Button heixiang2;
    @FXML
    private Button heima1;
    @FXML
    private Button heima2;
    @FXML
    private Button heiju1;
    @FXML
    private Button heiju2;
    @FXML
    private Button hongbing1;
    @FXML
    private Button hongbing2;
    @FXML
    private Button hongbing3;
    @FXML
    private Button hongbing4;
    @FXML
    private Button hongbing5;
    @FXML
    private Button hongpao1;
    @FXML
    private Button hongpao2;
    @FXML
    private Button hongshuai;
    @FXML
    private Button hongshi1;
    @FXML
    private Button hongshi2;
    @FXML
    private Button hongxiang1;
    @FXML
    private Button hongxiang2;
    @FXML
    private Button hongma1;
    @FXML
    private Button hongma2;
    @FXML
    private Button hongju1;
    @FXML
    private Button hongju2;
    @FXML
    private Button next0;
    @FXML
    private Button next1;
     @FXML
    private Button next2;
     @FXML
    private Button next3;
     @FXML
    private Button next4;
     @FXML
    private Button next5;
     @FXML
    private Button next6;
     @FXML
    private Button next7;
     @FXML
    private Button next8;
     @FXML
    private Button next9;
     @FXML
    private Button next10;
     @FXML
    private Button next11;
     @FXML
    private Button next12;
     @FXML
    private Button next13;
     @FXML
    private Button next14;
     @FXML
    private Button next15;
     @FXML
    private Button next16;
    //UI控件声明

    public void initialize(URL url, ResourceBundle rb) {
        //TODO 不知道干啥用的
    }

    public void heizu1Controller( ActionEvent event)throws Exception {
        //“黑卒1”按钮处理机
//        if(runType.currentChessMan == 0||runType.currentChessMan > 100)
//            return;
        initNext();
        currentChessMan = heizu1;
        runType.currentChessMan = 71;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heizu1,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heizu2Controller( ActionEvent event)throws Exception {
        //“黑卒2”按钮处理机
        initNext();
        currentChessMan = heizu2;
        runType.currentChessMan = 72;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heizu2,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heizu3Controller( ActionEvent event)throws Exception {
        //“黑卒3”按钮处理机
        initNext();
        currentChessMan = heizu3;
        runType.currentChessMan = 73;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heizu3,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heizu4Controller( ActionEvent event)throws Exception {
        //“黑卒4”按钮处理机
        initNext();
        currentChessMan = heizu4;
        runType.currentChessMan = 74;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heizu4,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heizu5Controller( ActionEvent event)throws Exception {
        //“黑卒5”按钮处理机
        initNext();
        currentChessMan = heizu5;
        runType.currentChessMan = 75;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heizu5,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heiju1Controller(ActionEvent event) throws Exception{
        //“黑车1”按钮处理机
        initNext();
        currentChessMan = heiju1;
        runType.currentChessMan = 41;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heiju1,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heiju2Controller(ActionEvent event) throws Exception{
        //“黑车2”按钮处理机
        initNext();
        currentChessMan = heiju2;
        runType.currentChessMan = 42;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heiju2,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heima1Controller(ActionEvent event) throws Exception{
        //“黑馬1”按钮处理机
        initNext();
        currentChessMan = heima1;
        runType.currentChessMan = 51;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heima1,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heima2Controller(ActionEvent event) throws Exception{
        //“黑馬2”按钮处理机
        initNext();
        currentChessMan = heima2;
        runType.currentChessMan = 52;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heima2,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heipao1Controller(ActionEvent event) throws Exception {
        //“黑炮1”按钮处理机
        initNext();
        currentChessMan = heipao1;
        runType.currentChessMan = 61;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heipao1,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heipao2Controller(ActionEvent event) throws Exception{
        //“黑炮2”按钮处理机
        initNext();
        currentChessMan = heipao2;
        runType.currentChessMan = 62;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heipao2,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heijiangController(ActionEvent event) throws Exception{
        //“黑将” 按钮处理机
        initNext();
        currentChessMan = heijiang;
        runType.currentChessMan = 11;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heijiang,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heishi1Controller(ActionEvent event) throws Exception{
        //“黑士1”按钮处理机
        initNext();
        currentChessMan = heishi1;
        runType.currentChessMan = 21;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heishi1,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heishi2Controller(ActionEvent event) throws Exception{
        //“黑士2”按钮处理机
        initNext();
        currentChessMan = heishi2;
        runType.currentChessMan = 22;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heishi2,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heixiang1Controller(ActionEvent event) throws Exception{
        //“黑象1”按钮处理机
        initNext();
        currentChessMan = heixiang1;
        runType.currentChessMan = 31;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heixiang1,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void heixiang2Controller(ActionEvent event) throws Exception{
        //“黑象2”按钮处理机
        initNext();
        currentChessMan = heixiang2;
        runType.currentChessMan = 32;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(heixiang2,0);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public void hongbing1Controller( ActionEvent event)throws Exception {
        //“红兵1”按钮处理机
        initNext();
        currentChessMan = hongbing1;
        runType.currentChessMan = 171;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongbing1,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongbing2Controller( ActionEvent event)throws Exception {
        //“红兵2”按钮处理机
        initNext();
        currentChessMan = hongbing2;
        runType.currentChessMan = 172;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongbing2,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongbing3Controller( ActionEvent event)throws Exception {
        //“红兵3”按钮处理机
        initNext();
        currentChessMan = hongbing3;
        runType.currentChessMan = 173;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongbing3,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongbing4Controller( ActionEvent event)throws Exception {
        //“红兵4”按钮处理机
        initNext();
        currentChessMan = hongbing4;
        runType.currentChessMan = 174;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongbing4,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongbing5Controller( ActionEvent event)throws Exception {
        //“红兵5”按钮处理机
        initNext();
        currentChessMan = hongbing5;
        runType.currentChessMan = 175;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongbing5,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongju1Controller(ActionEvent event) throws Exception{
        //“红车1”按钮处理机
        initNext();
        currentChessMan = hongju1;
        runType.currentChessMan = 141;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongju1,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongju2Controller(ActionEvent event) throws Exception{
        //“红车2”按钮处理机
        initNext();
        currentChessMan = hongju2;
        runType.currentChessMan = 142;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongju2,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongma1Controller(ActionEvent event) throws Exception{
        //“红馬1”按钮处理机
        initNext();
        currentChessMan = hongma1;
        runType.currentChessMan = 151;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongma1,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongma2Controller(ActionEvent event) throws Exception{
        //“红馬2”按钮处理机
        initNext();
        currentChessMan = hongma2;
        runType.currentChessMan = 152;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongma2,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongpao1Controller(ActionEvent event) throws Exception {
        //“红炮1”按钮处理机
        initNext();
        currentChessMan = hongpao1;
        runType.currentChessMan = 161;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongpao1,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongpao2Controller(ActionEvent event) throws Exception{
        //“红炮2”按钮处理机
        initNext();
        currentChessMan = hongpao2;
        runType.currentChessMan = 162;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongpao2,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongshuaiController(ActionEvent event) throws Exception{
        //“红帅” 按钮处理机
        initNext();
        currentChessMan = hongshuai;
        runType.currentChessMan = 111;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongshuai,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongshi1Controller(ActionEvent event) throws Exception{
        //“红仕1”按钮处理机
        initNext();
        currentChessMan = hongshi1;
        runType.currentChessMan = 121;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongshi1,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongshi2Controller(ActionEvent event) throws Exception{
        //“红仕2”按钮处理机
        initNext();
        currentChessMan = hongshi2;
        runType.currentChessMan = 122;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongshi2,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongxiang1Controller(ActionEvent event) throws Exception{
        //“红相1”按钮处理机
        initNext();
        currentChessMan = hongxiang1;
        runType.currentChessMan = 131;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongxiang1,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hongxiang2Controller(ActionEvent event) throws Exception{
        //“红相2”按钮处理机
        initNext();
        currentChessMan = hongxiang2;
        runType.currentChessMan = 132;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //update ui
                try {
                    zuController(hongxiang2,1);
                    //为兵卒统一处理机递对应的按钮对象名
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void nextController(ActionEvent event) throws Exception{
        //next按钮处理机
        Button button = (Button) event.getSource();
        double x = button.getLayoutX();
        double y = button.getLayoutY();
        //获取下一步的坐标
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                removeChenMan(x,y);
                moveChessMan(currentChessMan,x,y,runType.currentChessMan);
                initNext();
                //走子并移动
            }
        });

    }

    private void zuController(Button zuButton,int type) throws Exception{
        //兵卒统一处理机
        double x = zuButton.getLayoutX();
        double y = zuButton.getLayoutY();
        //获取当前坐标值
        chessManZu zu = new chessManZu(x,y,type);
        //定义兵卒对象
        Queue<Double> queue = zu.getNext();
        //获取可以移动的坐标
        nextDraw(queue);
        //画出所有可移动坐标
    }

    private void juController(Button juButton,int type) throws Exception{
        //车统一处理机
        double x = juButton.getLayoutX();
        double y = juButton.getLayoutY();
        //获取当前坐标值
        chessManJu ju = new chessManJu(x,y,type);
        //定义车对象
        Queue<Double> queue = ju.getNext();
        //获取可以移动的坐标
        nextDraw(queue);
        //画出所有可移动坐标
    }

    private void maController(Button maButton,int type) throws Exception{
        //馬统一处理机
        double x = maButton.getLayoutX();
        double y = maButton.getLayoutY();
        //获取当前坐标值
        chessManMa ma = new chessManMa(x,y,type);
        //定义馬对象
        Queue<Double> queue = ma.getNext();
        //获取可以移动的坐标
        nextDraw(queue);
        //画出所有可移动坐标
    }

    private void paoController(Button paoButton,int type) throws Exception{
        //炮统一处理机
        double x = paoButton.getLayoutX();
        double y = paoButton.getLayoutY();
        //获取当前坐标值
        chessManPao pao = new chessManPao(x,y,type);
        //定义炮对象
        Queue<Double> queue = pao.getNext();
        //获取可以移动的坐标
        nextDraw(queue);
        //画出所有可移动坐标
    }

    private void jiangController(Button jiangButton,int type) throws  Exception{
        //将帅统一处理机
        double x = jiangButton.getLayoutX();
        double y = jiangButton.getLayoutY();
        //获取当前坐标值
        chessManJiang jiang = new chessManJiang(x,y,type);
        //定义将帅对象
        Queue<Double> queue = jiang.getNext();
        //获取可以移动的坐标
        nextDraw(queue);
        //画出所有可移动坐标
    }

    private void shiController(Button shiButton,int type) throws Exception{
        //士统一处理机
        double x = shiButton.getLayoutX();
        double y = shiButton.getLayoutY();
        //获取当前坐标值
        chessManShi shi = new chessManShi(x,y,type);
        //定义士对象
        Queue<Double> queue = shi.getNext();
        //获取可以移动的坐标
        nextDraw(queue);
        //画出所有可移动坐标
    }

    private void xiangController(Button xiangButton,int type) throws Exception{
        //象统一处理机
        double x = xiangButton.getLayoutX();
        double y = xiangButton.getLayoutY();
        //获取当前坐标值
        chessManXiang xiang = new chessManXiang(x,y,type);
        //定义将帅对象
        Queue<Double> queue = xiang.getNext();
        //获取可以移动的坐标
        nextDraw(queue);
        //画出所有可移动坐标
    }

    private void moveChessMan(Button button,double x,double y,int type){
        //走棋
        runType.allChessMan[(int) ((button.getLayoutY()-77)/50)][(int) ((button.getLayoutX()-177)/50)] = 0;
        if(type!=-1)
            runType.allChessMan[(int) (y-77)/50][(int) (x-177)/50] = type;
        button.setLayoutX(x);
        button.setLayoutY(y);
    }

    private void removeChenMan(double x,double y){
        //棋子被吃
        int X,Y;
        Y = (int)(x-177)/50;
        X = (int)(y-77)/50;
        if(runType.allChessMan[X][Y]==0)
            return;
        switch (runType.allChessMan[X][Y]){
            case 11:moveChessMan(heijiang,  runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 21:moveChessMan(heishi1,   runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 22:moveChessMan(heishi2,   runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 31:moveChessMan(heixiang1, runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 32:moveChessMan(heixiang2, runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 41:moveChessMan(heiju1,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 42:moveChessMan(heiju2,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 51:moveChessMan(heima1,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 52:moveChessMan(heima2,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 61:moveChessMan(heipao1,   runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 62:moveChessMan(heipao2,   runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 71:moveChessMan(heizu1,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 72:moveChessMan(heizu2,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 73:moveChessMan(heizu3,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 74:moveChessMan(heizu4,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;
            case 75:moveChessMan(heizu5,    runType.heiReady[runType.heiSum][0]*50+177,runType.heiReady[runType.heiSum][1]*50+77,-1);runType.heiSum++;break;

            case 111:moveChessMan(hongshuai, runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 121:moveChessMan(hongshi1,  runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 122:moveChessMan(hongshi2,  runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 131:moveChessMan(hongxiang1,runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 132:moveChessMan(hongxiang2,runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 141:moveChessMan(hongju1,   runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 142:moveChessMan(hongju2,   runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 151:moveChessMan(hongma1,   runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 152:moveChessMan(hongma2,   runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 161:moveChessMan(hongpao1,  runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 162:moveChessMan(hongpao2,  runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 171:moveChessMan(hongbing1, runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 172:moveChessMan(hongbing2, runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 173:moveChessMan(hongbing3, runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 174:moveChessMan(hongbing4, runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
            case 175:moveChessMan(hongbing5, runType.hongReady[runType.hongSum][0]*50+177,runType.hongReady[runType.hongSum][1]*50+77,-1);runType.hongSum++;break;
        }
        runType.allChessMan[X][Y] = 0;
    }

    private void nextDraw(Queue<Double> queue) throws IOException {
        //next按钮绘制
        next0.setLayoutX(queue.poll());
        next0.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next1.setLayoutX(queue.poll());
        next1.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next2.setLayoutX(queue.poll());
        next2.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next3.setLayoutX(queue.poll());
        next3.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next4.setLayoutX(queue.poll());
        next4.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next5.setLayoutX(queue.poll());
        next5.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next6.setLayoutX(queue.poll());
        next6.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next7.setLayoutX(queue.poll());
        next7.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next8.setLayoutX(queue.poll());
        next8.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next9.setLayoutX(queue.poll());
        next9.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next10.setLayoutX(queue.poll());
        next10.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next11.setLayoutX(queue.poll());
        next11.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next12.setLayoutX(queue.poll());
        next12.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next13.setLayoutX(queue.poll());
        next13.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next14.setLayoutX(queue.poll());
        next14.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next15.setLayoutX(queue.poll());
        next15.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
        next16.setLayoutX(queue.poll());
        next16.setLayoutY(queue.poll());
        if(queue.isEmpty())
            return;
    }

    private void initNext(){
        //初始化next按钮
        next0.setLayoutX(677);
        next0.setLayoutY(277);
        next1.setLayoutX(677);
        next1.setLayoutY(277);
        next2.setLayoutX(677);
        next2.setLayoutY(277);
        next3.setLayoutX(677);
        next3.setLayoutY(277);
        next4.setLayoutX(677);
        next4.setLayoutY(277);
        next5.setLayoutX(677);
        next5.setLayoutY(277);
        next6.setLayoutX(677);
        next6.setLayoutY(277);
        next7.setLayoutX(677);
        next7.setLayoutY(277);
        next8.setLayoutX(677);
        next8.setLayoutY(277);
        next9.setLayoutX(677);
        next9.setLayoutY(277);
        next10.setLayoutX(677);
        next10.setLayoutY(277);
        next11.setLayoutX(677);
        next11.setLayoutY(277);
        next12.setLayoutX(677);
        next12.setLayoutY(277);
        next13.setLayoutX(677);
        next13.setLayoutY(277);
        next14.setLayoutX(677);
        next14.setLayoutY(277);
        next15.setLayoutX(677);
        next15.setLayoutY(277);
        next16.setLayoutX(677);
        next16.setLayoutY(277);
    }

}

