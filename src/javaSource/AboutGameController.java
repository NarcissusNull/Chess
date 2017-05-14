package javaSource;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class AboutGameController {

    public void initialize(URL url, ResourceBundle rb){
        //TODO 不知道干啥用的
    }

    public void acceptController(MouseEvent event) throws Exception{
        //退出关于窗口处理机
        HomePage.aboutGameStage.hide();
        HomePage.mainStage.show();
    }

}
