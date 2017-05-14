package javaSource;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomePage extends Application {
    //窗口类

    public static Stage aboutGameStage  = new Stage();
    //关于窗口
    public static Stage exitGameStage   = new Stage();
    //退出窗口
    public static Stage logInStage      = new Stage();
    //登录窗口
    public static Stage mainStage       = new Stage();
    //主窗口
    public static Stage readyStage      = new Stage();
    //游戏准备窗口
    public static Stage resultStage     = new Stage();
    //游戏结束窗口
    public static Stage runStage        = new Stage();
    //游戏运行窗口
    public static Stage signUpStage     = new Stage();
    //注册窗口

    @Override
    public void start(Stage primaryStage) throws Exception{

        stageLoad(aboutGameStage,   "../fxml/AboutGame.fxml",   "../css/AboutGame.css");
        stageLoad(exitGameStage,    "../fxml/ExitGame.fxml",    "../css/ExitGame.css");
        stageLoad(logInStage,       "../fxml/LogIn.fxml",       "../css/LogIn.css"  );
        stageLoad(mainStage,        "../fxml/Main.fxml",        "../css/Main.css"    );
        stageLoad(readyStage,       "../fxml/Ready.fxml",       "../css/Ready.css"  );
        stageLoad(resultStage,      "../fxml/Result.fxml",      "../css/Result.css"    );
        stageLoad(runStage,         "../fxml/Run.fxml",         "../css/Run.css"    );
        stageLoad(signUpStage,      "../fxml/SignUp.fxml",      "../css/SignUp.css" );
//        各个窗口加载fxml和css

        mainStage.show();
        //打开主窗口

    }

    public static void stageLoad(Stage stage,String fxml,String css) throws Exception{
       //窗口加载方法

        Parent root = new FXMLLoader().load(HomePage.class.getResource(fxml));
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        //加载窗口fxml，设置窗口无边框
        scene.getStylesheets().add(HomePage.class.getResource(css).toExternalForm());
        //添加css效果

//        stage.initStyle(StageStyle.TRANSPARENT);
//        scene.setFill(null);
//        //以上两行使得窗口背景透明
    }

    public static void main(String[] args) {
        //TODO
        launch(args);
    }

}
