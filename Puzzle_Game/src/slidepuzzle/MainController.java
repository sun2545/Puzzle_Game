package slidepuzzle;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.TimerTask;

import javax.swing.JOptionPane;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainController implements Initializable {
	public java.util.Timer timer1;
	final int X = 410;
	final int Y = 410;
	final double RIGHT = 200000;
	final double LEFT = -200000;
	final double UP = -200;
	final double DOWN = 200;
	static Double[] xy = new Double[9];

	@FXML
	private Label timer;
	
	@FXML
	private Label restart;
	
	@FXML
	private ImageView a1;

	@FXML
	private ImageView a2;

	@FXML
	private ImageView a3;

	@FXML
	private ImageView a4;

	@FXML
	private ImageView a5;

	@FXML
	private ImageView a6;

	@FXML
	private ImageView a7;

	@FXML
	private ImageView a8;

	@FXML
	private ImageView a9;
	
	
	

	@FXML
	void a1move(MouseEvent event) {
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}
		if (a1.getLayoutX() < X && xy[0] + RIGHT != xy[1]
				&& xy[0] + RIGHT != xy[2] && xy[0] + RIGHT != xy[3]
				&& xy[0] + RIGHT != xy[4] && xy[0] + RIGHT != xy[5]
				&& xy[0] + RIGHT != xy[6] && xy[0] + RIGHT != xy[7]
				&& xy[0] + RIGHT != xy[8]) {
			a1.setLayoutX(a1.getLayoutX() + 200);
		} else if (a1.getLayoutX() > 10 && xy[0] + LEFT != xy[1]
				&& xy[0] + LEFT != xy[2] && xy[0] + LEFT != xy[3]
				&& xy[0] + LEFT != xy[4] && xy[0] + LEFT != xy[5]
				&& xy[0] + LEFT != xy[6] && xy[0] + LEFT != xy[7]
				&& xy[0] + LEFT != xy[8]) {
			a1.setLayoutX(a1.getLayoutX() - 200);
		} else if (a1.getLayoutY() < Y && xy[0] + DOWN != xy[1]
				&& xy[0] + DOWN != xy[2] && xy[0] + DOWN != xy[3]
				&& xy[0] + DOWN != xy[4] && xy[0] + DOWN != xy[5]
				&& xy[0] + DOWN != xy[6] && xy[0] + DOWN != xy[7]
				&& xy[0] + DOWN != xy[8]) {
			a1.setLayoutY(a1.getLayoutY() + 200);

		} else if (a1.getLayoutY() > 10 && xy[0] + UP != xy[1]
				&& xy[0] + UP != xy[2] && xy[0] + UP != xy[3]
				&& xy[0] + UP != xy[4] && xy[0] + UP != xy[5]
				&& xy[0] + UP != xy[6] && xy[0] + UP != xy[7]
				&& xy[0] + UP != xy[8]) {
			a1.setLayoutY(a1.getLayoutY() - 200);
		}

	}

	@FXML
	void a2move(MouseEvent event) {
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}
		if (a2.getLayoutX() < X && xy[1] + RIGHT != xy[0]
				&& xy[1] + RIGHT != xy[2] && xy[1] + RIGHT != xy[3]
				&& xy[1] + RIGHT != xy[4] && xy[1] + RIGHT != xy[5]
				&& xy[1] + RIGHT != xy[6] && xy[1] + RIGHT != xy[7]
				&& xy[1] + RIGHT != xy[8]) {
			a2.setLayoutX(a2.getLayoutX() + 200);
		} else if (a2.getLayoutX() > 10 && xy[1] + LEFT != xy[0]
				&& xy[1] + LEFT != xy[2] && xy[1] + LEFT != xy[3]
				&& xy[1] + LEFT != xy[4] && xy[1] + LEFT != xy[5]
				&& xy[1] + LEFT != xy[6] && xy[1] + LEFT != xy[7]
				&& xy[1] + LEFT != xy[8]) {
			a2.setLayoutX(a2.getLayoutX() - 200);
		} else if (a2.getLayoutY() < Y && xy[1] + DOWN != xy[0]
				&& xy[1] + DOWN != xy[2] && xy[1] + DOWN != xy[3]
				&& xy[1] + DOWN != xy[4] && xy[1] + DOWN != xy[5]
				&& xy[1] + DOWN != xy[6] && xy[1] + DOWN != xy[7]
				&& xy[1] + DOWN != xy[8]) {
			a2.setLayoutY(a2.getLayoutY() + 200);

		} else if (a2.getLayoutY() > 10 && xy[1] + UP != xy[0]
				&& xy[1] + UP != xy[2] && xy[1] + UP != xy[3]
				&& xy[1] + UP != xy[4] && xy[1] + UP != xy[5]
				&& xy[1] + UP != xy[6] && xy[1] + UP != xy[7]
				&& xy[1] + UP != xy[8]) {
			a2.setLayoutY(a2.getLayoutY() - 200);
		}

	}

	@FXML
	void a3move(MouseEvent event) {
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}
		if (a3.getLayoutX() < X && xy[2] + RIGHT != xy[0]
				&& xy[2] + RIGHT != xy[1] && xy[2] + RIGHT != xy[3]
				&& xy[2] + RIGHT != xy[4] && xy[2] + RIGHT != xy[5]
				&& xy[2] + RIGHT != xy[6] && xy[2] + RIGHT != xy[7]
				&& xy[2] + RIGHT != xy[8]) {
			a3.setLayoutX(a3.getLayoutX() + 200);
		} else if (a3.getLayoutX() > 10 && xy[2] + LEFT != xy[0]
				&& xy[2] + LEFT != xy[1] && xy[2] + LEFT != xy[3]
				&& xy[2] + LEFT != xy[4] && xy[2] + LEFT != xy[5]
				&& xy[2] + LEFT != xy[6] && xy[2] + LEFT != xy[7]
				&& xy[2] + LEFT != xy[8]) {
			a3.setLayoutX(a3.getLayoutX() - 200);
		} else if (a3.getLayoutY() < Y && xy[2] + DOWN != xy[0]
				&& xy[2] + DOWN != xy[1] && xy[2] + DOWN != xy[3]
				&& xy[2] + DOWN != xy[4] && xy[2] + DOWN != xy[5]
				&& xy[2] + DOWN != xy[6] && xy[2] + DOWN != xy[7]
				&& xy[2] + DOWN != xy[8]) {
			a3.setLayoutY(a3.getLayoutY() + 200);

		} else if (a3.getLayoutY() > 10 && xy[2] + UP != xy[0]
				&& xy[2] + UP != xy[1] && xy[2] + UP != xy[3]
				&& xy[2] + UP != xy[4] && xy[2] + UP != xy[5]
				&& xy[2] + UP != xy[6] && xy[2] + UP != xy[7]
				&& xy[2] + UP != xy[8]) {
			a3.setLayoutY(a3.getLayoutY() - 200);
		}

	}

	@FXML
	void a4move(MouseEvent event) {
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}
		if (a4.getLayoutX() < X && xy[3] + RIGHT != xy[0]
				&& xy[3] + RIGHT != xy[1] && xy[3] + RIGHT != xy[2]
				&& xy[3] + RIGHT != xy[4] && xy[3] + RIGHT != xy[5]
				&& xy[3] + RIGHT != xy[6] && xy[3] + RIGHT != xy[7]
				&& xy[3] + RIGHT != xy[8]) {
			a4.setLayoutX(a4.getLayoutX() + 200);
		} else if (a4.getLayoutX() > 10 && xy[3] + LEFT != xy[0]
				&& xy[3] + LEFT != xy[1] && xy[3] + LEFT != xy[2]
				&& xy[3] + LEFT != xy[4] && xy[3] + LEFT != xy[5]
				&& xy[3] + LEFT != xy[6] && xy[3] + LEFT != xy[7]
				&& xy[3] + LEFT != xy[8]) {
			a4.setLayoutX(a4.getLayoutX() - 200);
		} else if (a4.getLayoutY() < Y && xy[3] + DOWN != xy[0]
				&& xy[3] + DOWN != xy[1] && xy[3] + DOWN != xy[2]
				&& xy[3] + DOWN != xy[4] && xy[3] + DOWN != xy[5]
				&& xy[3] + DOWN != xy[6] && xy[3] + DOWN != xy[7]
				&& xy[3] + DOWN != xy[8]) {
			a4.setLayoutY(a4.getLayoutY() + 200);

		} else if (a4.getLayoutY() > 10 && xy[3] + UP != xy[0]
				&& xy[3] + UP != xy[1] && xy[3] + UP != xy[2]
				&& xy[3] + UP != xy[4] && xy[3] + UP != xy[5]
				&& xy[3] + UP != xy[6] && xy[3] + UP != xy[7]
				&& xy[3] + UP != xy[8]) {
			a4.setLayoutY(a4.getLayoutY() - 200);
		}

	}

	@FXML
	void a5move(MouseEvent event) {
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}
		if (a5.getLayoutX() < X && xy[4] + RIGHT != xy[0]
				&& xy[4] + RIGHT != xy[1] && xy[4] + RIGHT != xy[2]
				&& xy[4] + RIGHT != xy[3] && xy[4] + RIGHT != xy[5]
				&& xy[4] + RIGHT != xy[6] && xy[4] + RIGHT != xy[7]
				&& xy[4] + RIGHT != xy[8]) {
			a5.setLayoutX(a5.getLayoutX() + 200);
		} else if (a5.getLayoutX() > 10 && xy[4] + LEFT != xy[0]
				&& xy[4] + LEFT != xy[1] && xy[4] + LEFT != xy[2]
				&& xy[4] + LEFT != xy[3] && xy[4] + LEFT != xy[5]
				&& xy[4] + LEFT != xy[6] && xy[4] + LEFT != xy[7]
				&& xy[4] + LEFT != xy[8]) {
			a5.setLayoutX(a5.getLayoutX() - 200);
		} else if (a5.getLayoutY() < Y && xy[4] + DOWN != xy[0]
				&& xy[4] + DOWN != xy[1] && xy[4] + DOWN != xy[2]
				&& xy[4] + DOWN != xy[3] && xy[4] + DOWN != xy[5]
				&& xy[4] + DOWN != xy[6] && xy[4] + DOWN != xy[7]
				&& xy[4] + DOWN != xy[8]) {
			a5.setLayoutY(a5.getLayoutY() + 200);

		} else if (a5.getLayoutY() > 10 && xy[4] + UP != xy[0]
				&& xy[4] + UP != xy[1] && xy[4] + UP != xy[2]
				&& xy[4] + UP != xy[3] && xy[4] + UP != xy[5]
				&& xy[4] + UP != xy[6] && xy[4] + UP != xy[7]
				&& xy[4] + UP != xy[8]) {
			a5.setLayoutY(a5.getLayoutY() - 200);
		}
	}

	@FXML
	void a6move(MouseEvent event) {

		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}
		if (a6.getLayoutX() < X && xy[5] + RIGHT != xy[0]
				&& xy[5] + RIGHT != xy[1] && xy[5] + RIGHT != xy[2]
				&& xy[5] + RIGHT != xy[3] && xy[5] + RIGHT != xy[4]
				&& xy[5] + RIGHT != xy[6] && xy[5] + RIGHT != xy[7]
				&& xy[5] + RIGHT != xy[8]) {
			a6.setLayoutX(a6.getLayoutX() + 200);
		} else if (a6.getLayoutX() > 10 && xy[5] + LEFT != xy[0]
				&& xy[5] + LEFT != xy[1] && xy[5] + LEFT != xy[2]
				&& xy[5] + LEFT != xy[3] && xy[5] + LEFT != xy[4]
				&& xy[5] + LEFT != xy[6] && xy[5] + LEFT != xy[7]
				&& xy[5] + LEFT != xy[8]) {
			a6.setLayoutX(a6.getLayoutX() - 200);
		} else if (a6.getLayoutY() < Y && xy[5] + DOWN != xy[0]
				&& xy[5] + DOWN != xy[1] && xy[5] + DOWN != xy[2]
				&& xy[5] + DOWN != xy[3] && xy[5] + DOWN != xy[4]
				&& xy[5] + DOWN != xy[5] && xy[5] + DOWN != xy[7]
				&& xy[5] + DOWN != xy[8]) {
			a6.setLayoutY(a6.getLayoutY() + 200);

		} else if (a6.getLayoutY() > 10 && xy[5] + UP != xy[0]
				&& xy[5] + UP != xy[1] && xy[5] + UP != xy[2]
				&& xy[5] + UP != xy[3] && xy[5] + UP != xy[4]
				&& xy[5] + UP != xy[6] && xy[5] + UP != xy[7]
				&& xy[5] + UP != xy[8]) {
			a6.setLayoutY(a6.getLayoutY() - 200);
		}

	}

	@FXML
	void a7move(MouseEvent event) {

		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}

		if (a7.getLayoutX() < X && xy[6] + RIGHT != xy[0]
				&& xy[6] + RIGHT != xy[1] && xy[6] + RIGHT != xy[2]
				&& xy[6] + RIGHT != xy[3] && xy[6] + RIGHT != xy[4]
				&& xy[6] + RIGHT != xy[5] && xy[6] + RIGHT != xy[7]
				&& xy[6] + RIGHT != xy[8]) {
			a7.setLayoutX(a7.getLayoutX() + 200);
		} else if (a7.getLayoutX() > 10 && xy[6] + LEFT != xy[0]
				&& xy[6] + LEFT != xy[1] && xy[6] + LEFT != xy[2]
				&& xy[6] + LEFT != xy[3] && xy[6] + LEFT != xy[4]
				&& xy[6] + LEFT != xy[5] && xy[6] + LEFT != xy[7]
				&& xy[6] + LEFT != xy[8]) {
			a7.setLayoutX(a7.getLayoutX() - 200);

		} else if (a7.getLayoutY() < Y && xy[6] + DOWN != xy[0]
				&& xy[6] + DOWN != xy[1] && xy[6] + DOWN != xy[2]
				&& xy[6] + DOWN != xy[3] && xy[6] + DOWN != xy[4]
				&& xy[6] + DOWN != xy[5] && xy[6] + DOWN != xy[7]
				&& xy[6] + DOWN != xy[8]) {
			a7.setLayoutY(a7.getLayoutY() + 200);
		} else if (a7.getLayoutY() > 10 && xy[6] + UP != xy[0]
				&& xy[6] + UP != xy[1] && xy[6] + UP != xy[2]
				&& xy[6] + UP != xy[3] && xy[6] + UP != xy[4]
				&& xy[6] + UP != xy[5] && xy[6] + UP != xy[7]
				&& xy[6] + UP != xy[8]) {
			a7.setLayoutY(a7.getLayoutY() - 200);
		}

	}

	@FXML
	void a8move(MouseEvent event) {
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}

		if (a8.getLayoutX() < X && xy[7] + RIGHT != xy[0]
				&& xy[7] + RIGHT != xy[1] && xy[7] + RIGHT != xy[2]
				&& xy[7] + RIGHT != xy[3] && xy[7] + RIGHT != xy[4]
				&& xy[7] + RIGHT != xy[5] && xy[7] + RIGHT != xy[6]
				&& xy[7] + RIGHT != xy[8]) {
			a8.setLayoutX(a8.getLayoutX() + 200);
		} else if (a8.getLayoutX() > 10 && xy[7] + LEFT != xy[0]
				&& xy[7] + LEFT != xy[1] && xy[7] + LEFT != xy[2]
				&& xy[7] + LEFT != xy[3] && xy[7] + LEFT != xy[4]
				&& xy[7] + LEFT != xy[5] && xy[7] + LEFT != xy[6]
				&& xy[7] + LEFT != xy[8]) {
			a8.setLayoutX(a8.getLayoutX() - 200);
		} else if (a8.getLayoutY() < Y && xy[7] + DOWN != xy[0]
				&& xy[7] + DOWN != xy[1] && xy[7] + DOWN != xy[2]
				&& xy[7] + DOWN != xy[3] && xy[7] + DOWN != xy[4]
				&& xy[7] + DOWN != xy[5] && xy[7] + DOWN != xy[6]
				&& xy[7] + DOWN != xy[8]) {
			a8.setLayoutY(a8.getLayoutY() + 200);
		} else if (a8.getLayoutY() > 10 && xy[7] + UP != xy[0]
				&& xy[7] + UP != xy[1] && xy[7] + UP != xy[2]
				&& xy[7] + UP != xy[3] && xy[7] + UP != xy[4]
				&& xy[7] + UP != xy[5] && xy[7] + UP != xy[6]
				&& xy[7] + UP != xy[8]) {
			a8.setLayoutY(a8.getLayoutY() - 200);
		}
	}

	@FXML
	void a9move(MouseEvent event) {
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };

		for (int i = 0; i < xy.length; i++) {
			xy[i] = imageview[i].getLayoutX() * 1000
					+ imageview[i].getLayoutY();
		}

		if (a9.getLayoutX() == 610 && xy[8] + LEFT != xy[0]
				&& xy[8] + LEFT != xy[1] && xy[8] + LEFT != xy[2]
				&& xy[8] + LEFT != xy[3] && xy[8] + LEFT != xy[4]
				&& xy[8] + LEFT != xy[5] && xy[8] + LEFT != xy[6]
				&& xy[8] + LEFT != xy[7] ) {
			a9.setLayoutX(a9.getLayoutX() - 200);
		} else if (a9.getLayoutX() == 410) {
			a9.setLayoutX(a9.getLayoutX() + 200);
		}
		
		
		if(a1.getLayoutX()==10&&a1.getLayoutY()==10&&
				a2.getLayoutX()==210&&a2.getLayoutY()==10&&
				a3.getLayoutX()==410&&a3.getLayoutY()==10&&
				a4.getLayoutX()==10&&a4.getLayoutY()==210&&
				a5.getLayoutX()==210&&a5.getLayoutY()==210&&
				a6.getLayoutX()==410&&a6.getLayoutY()==210&&
				a7.getLayoutX()==10&&a7.getLayoutY()==410&&
				a8.getLayoutX()==210&&a8.getLayoutY()==410&&
				a9.getLayoutX()==410&&a9.getLayoutY()==410){
			timer1.cancel();
			JOptionPane.showMessageDialog(null,timer.getText()+"초로 완성했습니다.");
			return;
		}
	}
	@FXML
    void restart(MouseEvent event) {
		timer1.cancel();
		timer1 = new java.util.Timer();
		LabelChangeTimerTask task = new LabelChangeTimerTask();
		timer1.schedule(task, 0, 1*1000);
		
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };
		for (int i = 0; i < imageview.length; i++) {
			imageview[i].setFocusTraversable(true);
		}		
		int[] xPosition = new int[]{10,210,410};
		int[] yPosition = new int[]{10,210,410};
		
		int temp=0;
		int random=0;
		
		for(int i=0; i<50; i++){
			random = (int)(Math.random() * 3); 
			temp=xPosition[0];
			xPosition[0]= xPosition[random];
			xPosition[random] =temp;
			
		}
		
		
		for(int i=0; i<50; i++){
			
			random = (int)(Math.random() * 3); 
			temp=yPosition[0];
			yPosition[0]= yPosition[random];
			yPosition[random] =temp;
		}
		
		a1.setLayoutX(xPosition[0]);
		a1.setLayoutY(yPosition[0]);
		
		a2.setLayoutX(xPosition[0]);
		a2.setLayoutY(yPosition[1]);
		
		a3.setLayoutX(xPosition[0]);
		a3.setLayoutY(yPosition[2]);
		
		a4.setLayoutX(xPosition[1]);
		a4.setLayoutY(yPosition[0]);
		
		a5.setLayoutX(xPosition[1]);
		a5.setLayoutY(yPosition[1]);
		
		a6.setLayoutX(xPosition[1]);
		a6.setLayoutY(yPosition[2]);
		
		a7.setLayoutX(xPosition[2]);
		a7.setLayoutY(yPosition[0]);
		
		a8.setLayoutX(xPosition[2]);
		a8.setLayoutY(yPosition[1]);
		
		a9.setLayoutX(610);
		a9.setLayoutY(410);
		
		
    }
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		timer1 = new java.util.Timer();
		LabelChangeTimerTask task = new LabelChangeTimerTask();
		timer1.schedule(task, 0, 1*1000);
		
		ImageView[] imageview = new ImageView[] { a1, a2, a3, a4, a5, a6, a7,
				a8, a9 };
		for (int i = 0; i < imageview.length; i++) {
			imageview[i].setFocusTraversable(true);
		}		
		int[] xPosition = new int[]{10,210,410};
		int[] yPosition = new int[]{10,210,410};
		
		int temp=0;
		int random=0;
		
		for(int i=0; i<50; i++){
			random = (int)(Math.random() * 3); 
			temp=xPosition[0];
			xPosition[0]= xPosition[random];
			xPosition[random] =temp;
			
		}
		
		
		for(int i=0; i<50; i++){
			
			random = (int)(Math.random() * 3); 
			temp=yPosition[0];
			yPosition[0]= yPosition[random];
			yPosition[random] =temp;
		}
		
		a1.setLayoutX(xPosition[0]);
		a1.setLayoutY(yPosition[0]);
		
		a2.setLayoutX(xPosition[0]);
		a2.setLayoutY(yPosition[1]);
		
		a3.setLayoutX(xPosition[0]);
		a3.setLayoutY(yPosition[2]);
		
		a4.setLayoutX(xPosition[1]);
		a4.setLayoutY(yPosition[0]);
		
		a5.setLayoutX(xPosition[1]);
		a5.setLayoutY(yPosition[1]);
		
		a6.setLayoutX(xPosition[1]);
		a6.setLayoutY(yPosition[2]);
		
		a7.setLayoutX(xPosition[2]);
		a7.setLayoutY(yPosition[0]);
		
		a8.setLayoutX(xPosition[2]);
		a8.setLayoutY(yPosition[1]);
		
		a9.setLayoutX(610);
		a9.setLayoutY(410);
		
	
		

	}

	
	class LabelChangeTimerTask extends TimerTask{	
			private int cnt = 0;
			@Override
			public void run() {
				// Fx는 특별하게 아래와 같이 하여야 한다. 
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						cnt++;
						timer.setText(cnt+"");
					}
				});	
			}
		}

}
