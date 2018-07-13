package slidepuzzle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StartController implements Initializable{

    @FXML
    private ImageView exit;

    @FXML
    private ImageView gamestart;

    @FXML
    void start(MouseEvent event) {
    	Start a= new Start();
    	a.startMain.close();
    	Main m = new Main();
    	try {
			m.start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void exit(MouseEvent event) {
    	System.exit(0);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
