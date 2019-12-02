package application;
import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
public class SetBlur {

	
	// la etiqueta FXML permite acceder al componente imageView ya creado en
			// fxml
			@FXML
			private ImageView forestview;

			@FXML
			public void initialize() {
				forestview.setEffect(new GaussianBlur(10));
			}
}
