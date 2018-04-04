import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RandomCards extends Application {
	
	private int num;
	Text randnum = new Text("num");
	
	

	@Override
	public void start(Stage stage) throws Exception {
		
		Image img = new Image("ace_of_clubs.png");
		
		Button btn = new Button("Push Me!");
		btn.setOnAction(this::processButtonPress);
		
		if(num == 1) {
			ImageView imgvw = new ImageView(img);
		
		VBox vb = new VBox(imgvw);
		}
		
		FlowPane pn = new FlowPane(btn, randnum);
		pn.setAlignment(Pos.BASELINE_CENTER);
		Scene sn = new Scene(pn, vb, 800, 600);	
		stage.setScene(sn);
		stage.setTitle("Random Playing Cards");
		stage.show();
		
		
		
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		
		launch(args); 
		

	}
	
	public void processButtonPress(ActionEvent event) {
		
		Random gen = new Random();
		
		int num = gen.nextInt(24) + 1;
		
		randnum.setText("num " + num);
		
	}

}
