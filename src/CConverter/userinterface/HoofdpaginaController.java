package CConverter.userinterface;

import CConverter.model.Currency;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HoofdpaginaController {

    @FXML public ComboBox fromComboBox;
    @FXML public ComboBox toComboBox;
    @FXML public TextField convertAmountTextField;
    @FXML public TextField resultTextField;
    @FXML public Button convertButton;
    @FXML public Button cancelButton;
    @FXML public Label errorMessage;
    @FXML public Label typeCurrency;

    private double result;


    public void initialize() {
        convertAmountTextField.setText("1");
        errorMessage.setText("");
        typeCurrency.setText("");

        for (String currency : Currency.getCurrency().getAllCurrencies()) {
            fromComboBox.getItems().add(currency);
            toComboBox.getItems().add(currency);
        }
    }

    public void handleButtonConvert() {
        try {
            // Euro
            if (fromComboBox.getValue().equals("US Dollar (USD)") && toComboBox.getValue().equals("Euro (EUR)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.8415;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("US Dollar (USD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.1883;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Great British Pound (GBP)") && toComboBox.getValue().equals("Euro (EUR)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.1601;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Great British Pound (GBP)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.8620;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Swiss Franc (CHF)") && toComboBox.getValue().equals("Euro (EUR)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.9037;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Swiss Franc (CHF)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.1066;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Japanese Yen (JPY)") && toComboBox.getValue().equals("Euro (EUR)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.0078;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Japanese Yen (JPY)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 128.9900;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Canadian Dollar (CAD)") && toComboBox.getValue().equals("Euro (EUR)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.6694;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Canadian Dollar (CAD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.4938;
                resultTextField.setText(String.format("%.2f", result));
            }
            // US Dollar
            if (fromComboBox.getValue().equals("Great British Pound (GBP)") && toComboBox.getValue().equals("US Dollar (USD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.3786;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("US Dollar (USD)") && toComboBox.getValue().equals("Great British Pound (GBP)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.7254;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Swiss Franc (CHF)") && toComboBox.getValue().equals("US Dollar (USD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.0738;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("US Dollar (USD)") && toComboBox.getValue().equals("Swiss Franc (CHF)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.9312;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Japanese Yen (JPY)") && toComboBox.getValue().equals("US Dollar (USD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.0092;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("US Dollar (USD)") && toComboBox.getValue().equals("Japanese Yen (JPY)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 108.5500;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Canadian Dollar (CAD)") && toComboBox.getValue().equals("US Dollar (USD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.7955;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("US Dollar (USD)") && toComboBox.getValue().equals("Canadian Dollar (CAD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.2571;
                resultTextField.setText(String.format("%.2f", result));
            }
            // Pound Sterling
            if (fromComboBox.getValue().equals("Swiss Franc (CHF)") && toComboBox.getValue().equals("Great British Pound (GBP)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.7789;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Great British Pound (GBP)") && toComboBox.getValue().equals("Swiss Franc (CHF)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.2838;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Japanese Yen (JPY)") && toComboBox.getValue().equals("Great British Pound (GBP)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.0067;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Great British Pound (GBP)") && toComboBox.getValue().equals("Japanese Yen (JPY)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 149.6438;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Canadian Dollar (CAD)") && toComboBox.getValue().equals("Great British Pound (GBP)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.5770;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Great British Pound (GBP)") && toComboBox.getValue().equals("Canadian Dollar (CAD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.7330;
                resultTextField.setText(String.format("%.2f", result));
            }
            // Swiss franc
            if (fromComboBox.getValue().equals("Canadian Dollar (CAD)") && toComboBox.getValue().equals("Swiss Franc (CHF)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.7408;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Swiss Franc (CHF)") && toComboBox.getValue().equals("Canadian Dollar (CAD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 1.3499;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Japanese Yen (JPY)") && toComboBox.getValue().equals("Swiss Franc (CHF)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.0086;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Swiss Franc (CHF)") && toComboBox.getValue().equals("Japanese Yen (JPY)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 116.5643;
                resultTextField.setText(String.format("%.2f", result));
            }
            // Japanese yen
            else if (fromComboBox.getValue().equals("Canadian Dollar (CAD)") && toComboBox.getValue().equals("Japanese Yen (JPY)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 86.3502;
                resultTextField.setText(String.format("%.2f", result));
            }
            else if (fromComboBox.getValue().equals("Japanese Yen (JPY)") && toComboBox.getValue().equals("Canadian Dollar (CAD)")) {
                result = Double.parseDouble(convertAmountTextField.getText()) * 0.0116;
                resultTextField.setText(String.format("%.2f", result));
            }
        } catch (Exception e) {
            errorMessage.setText("Voer A.U.B. een geldige waarde in");
        }

        // Condities voor de typeCurrency label
        if (toComboBox.getValue().equals("US Dollar (USD)")) {
            typeCurrency.setText("US Dollar");
        }
        else if (toComboBox.getValue().equals("Euro (EUR)")) {
            typeCurrency.setText("Euro");
        }
        else if (toComboBox.getValue().equals("Great British Pound (GBP)")) {
            typeCurrency.setText("Pound Sterling");
        }
        else if (toComboBox.getValue().equals("Swiss Franc (CHF)")) {
            typeCurrency.setText("Swiss franc");
        }
        else if (toComboBox.getValue().equals("Japanese Yen (JPY)")) {
            typeCurrency.setText("Japanese yen");
        }
        else if (toComboBox.getValue().equals("Canadian Dollar (CAD)")) {
            typeCurrency.setText("Canadian Dollar");
        }
    }


    public void handleButtonClose(ActionEvent actionEvent) {
        Button source = (Button)actionEvent.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }
}

//        try {
//                if (fromComboBox.getValue().equals("US Dollar (USD)") && toComboBox.getValue().equals("Euro (EUR)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 0.8415;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("US Dollar (USD)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 1.1883;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Great British Pound (GBP)") && toComboBox.getValue().equals("Euro (EUR)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 1.1601;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Great British Pound (GBP)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 0.8620;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Swiss Franc (CHF)") && toComboBox.getValue().equals("Euro (EUR)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 0.9037;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Swiss Franc (CHF)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 1.1066;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Japanese Yen (JPY)") && toComboBox.getValue().equals("Euro (EUR)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 0.0078;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Japanese Yen (JPY)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 128.9900;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Canadian Dollar (CAD)") && toComboBox.getValue().equals("Euro (EUR)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 0.6694;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                else if (fromComboBox.getValue().equals("Euro (EUR)") && toComboBox.getValue().equals("Canadian Dollar (CAD)")) {
//                result = Double.parseDouble(convertAmountTextField.getText()) * 1.4938;
//                resultTextField.setText(String.format("%.2f", result));
//                }
//                } catch (Exception e) {
//                errorMessage.setText("Voer A.U.B. een geldige waarde in");
//                }