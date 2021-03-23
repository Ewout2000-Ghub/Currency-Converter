package CConverter;

import CConverter.model.Currency;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CurrencyConverter extends Application {

    public static void main(String[] arg) {
        Currency c = new Currency();

        Currency.setCurrency(c);

        launch(arg);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlPagina = "userinterface/Hoofdpagina.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
        Parent root = loader.load();

        stage.setTitle("Currency Converter V1");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
