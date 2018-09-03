package view;
import exceptions.DenominatorZeroException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import numericSystem.RationalNumber;

public class StartController {

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button substract;

    @FXML
    private Button zero;

    @FXML
    private Button simplify;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button squear;

    @FXML
    private Button inverse;

    @FXML
    private Label operation;

    @FXML
    private Label resultNumerator;

    @FXML
    private Label resultDenominator;

    @FXML
    private TextField numerator1;

    @FXML
    private TextField denominator1;

    @FXML
    private TextField numerator2;

    @FXML
    private TextField denominator2;

    @FXML
    private Button remove;

    @FXML
    private Button reset;

    @FXML
    private RadioButton butNumerator2;

    @FXML
    private ToggleGroup type;

    @FXML
    private RadioButton butDenominator1;

    @FXML
    private RadioButton butNumerator1;

    @FXML
    private RadioButton butDenominator2;
    
    @FXML
    private Button negativeSign;
    
    @FXML
    void negativeSign(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"-");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"-");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"-");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"-");
    	}
    }

    @FXML
    void eight(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"8");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"8");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"8");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"8");
    	}
    }

    @FXML
    void five(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"5");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"5");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"5");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"5");
    	}
    }

    @FXML
    void four(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"4");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"4");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"4");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"4");
    	}
    }
    
    @FXML
    void three(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"3");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"3");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"3");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"3");
    	}
    }

    @FXML
    void two(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"2");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"2");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"2");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"2");
    	}
    }

    @FXML
    void zero(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"0");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"0");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"0");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"0");
    	}
    }

    @FXML
    void nine(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"9");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"9");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"9");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"9");
    	}
    }

    @FXML
    void one(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"1");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"1");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"1");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"1");
    	}
    }

    @FXML
    void remove(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText("");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText("");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText("");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText("");
    	}
    }

    @FXML
    void reset(ActionEvent event) {
    	numerator1.setText("");
    	numerator2.setText("");
    	denominator2.setText("");
    	denominator1.setText("");
    	resultDenominator.setText("");
    	resultNumerator.setText("");
    	operation.setText("");
    }

    @FXML
    void seven(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"7");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"7");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"7");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"7");
    	}
    }

    @FXML
    void six(ActionEvent event) {
    	if(butNumerator1.isSelected()) {
    		numerator1.setText(numerator1.getText()+"6");
    	}else if(butNumerator2.isSelected()) {
    		numerator2.setText(numerator2.getText()+"6");
    	}else if(butDenominator1.isSelected()) {
    		denominator1.setText(denominator1.getText()+"6");
    	}else if(butDenominator2.isSelected()) {
    		denominator2.setText(denominator2.getText()+"6");
    	}
    }
    
    @FXML
    void simplify(ActionEvent event) {
    	try {
    		int numerator1 = Integer.parseInt(this.numerator1.getText());
    		int	denominator1 = Integer.parseInt(this.denominator1.getText());
    		RationalNumber<Number> rationalNumber1 = new RationalNumber<Number>(numerator1, denominator1);
    		rationalNumber1.verifyInvariant(denominator1);
    		rationalNumber1.simplifyRational();
    		operation.setText("S");
    		resultNumerator.setText(rationalNumber1.getNumerator().intValue()+"");
    		resultDenominator.setText(rationalNumber1.getDenominator().intValue()+"");
    	}catch(NumberFormatException e) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}catch(DenominatorZeroException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Is not posible divide by zero");
			message.setHeaderText(s.getMessage());
			message.show();
    	}
    }
    
    @FXML
    void inverse(ActionEvent event) {
    	try {
    		int numerator1 = Integer.parseInt(this.numerator1.getText());
    		int	denominator1 = Integer.parseInt(this.denominator1.getText());
    		RationalNumber<Number> rationalNumber1 = new RationalNumber<Number>(numerator1, denominator1);
    		rationalNumber1.verifyInvariant(numerator1);
    		rationalNumber1.rationalInverse();
    		operation.setText("I");
    		resultNumerator.setText(rationalNumber1.getNumerator().intValue()+"");
    		resultDenominator.setText(rationalNumber1.getDenominator().intValue()+"");
    	}catch(NumberFormatException e) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}catch(DenominatorZeroException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Is not posible divide by zero");
			message.setHeaderText(s.getMessage());
			message.show();
    	}
    		
    }
    
    @FXML
    void squear(ActionEvent event) {
    	try {
    		int numerator1 = Integer.parseInt(this.numerator1.getText());
    		int	denominator1 = Integer.parseInt(this.denominator1.getText());
    		RationalNumber<Number> rationalNumber1 = new RationalNumber<Number>(numerator1, denominator1);
    		rationalNumber1.verifyInvariant(denominator1);
    		rationalNumber1.squaredRational();
    		operation.setText("Sq");
    		resultNumerator.setText(rationalNumber1.getNumerator().intValue()+"");
    		resultDenominator.setText(rationalNumber1.getDenominator().intValue()+"");
    	}catch(NumberFormatException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}catch(DenominatorZeroException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Is not posible divide by zero");
			message.setHeaderText(s.getMessage());
			message.show();
    	}
    }

    @FXML
    void multiply(ActionEvent event) {
    	try {
    		int numerator1 = Integer.parseInt(this.numerator1.getText());
    		int	denominator1 = Integer.parseInt(this.denominator1.getText());
    		RationalNumber<Number> rationalNumber1 = new RationalNumber<Number>(numerator1, denominator1);
    		int numerator2 = Integer.parseInt(this.numerator2.getText());
    		int denominator2 = Integer.parseInt(this.denominator2.getText());
    		RationalNumber<Number> rationalNumber2 = new RationalNumber<Number>(numerator2, denominator2);
    		rationalNumber1.verifyInvariant(denominator1);
    		rationalNumber2.verifyInvariant(denominator2);
    		rationalNumber1.multiplyRational(rationalNumber2);
    		operation.setText("x");
    		resultNumerator.setText(rationalNumber1.getNumerator().intValue()+"");
    		resultDenominator.setText(rationalNumber1.getDenominator().intValue()+"");
    	}catch(NumberFormatException e) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}catch(DenominatorZeroException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Is not posible divide by zero");
			message.setHeaderText(s.getMessage());
			message.show();
    	}
    }

    @FXML
    void substract(ActionEvent event) throws NumberFormatException{
    	try{
    		int numerator1 = Integer.parseInt(this.numerator1.getText());
    		int	denominator1 = Integer.parseInt(this.denominator1.getText());
    		RationalNumber<Number> rationalNumber1 = new RationalNumber<Number>(numerator1, denominator1);
    		int numerator2 = Integer.parseInt(this.numerator2.getText());
    		int denominator2 = Integer.parseInt(this.denominator2.getText());
    		RationalNumber<Number> rationalNumber2 = new RationalNumber<Number>(numerator2, denominator2);
    		rationalNumber1.verifyInvariant(denominator1);
    		rationalNumber2.verifyInvariant(denominator2);
    		rationalNumber1.substractRational(rationalNumber2);
    		operation.setText("-");
    		resultNumerator.setText(rationalNumber1.getNumerator().intValue()+"");
    		resultDenominator.setText(rationalNumber1.getDenominator().intValue()+"");
    	}catch(NumberFormatException e) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}catch(DenominatorZeroException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Is not posible divide by zero");
			message.setHeaderText(s.getMessage());
			message.show();
    	}
    }

    @FXML
    void plus(ActionEvent event) {
    	try {
    		int numerator1 = Integer.parseInt(this.numerator1.getText());
    		int	denominator1 = Integer.parseInt(this.denominator1.getText());
    		RationalNumber<Number> rationalNumber1 = new RationalNumber<Number>(numerator1, denominator1);
    		int numerator2 = Integer.parseInt(this.numerator2.getText());
    		int denominator2 = Integer.parseInt(this.denominator2.getText());
    		RationalNumber<Number> rationalNumber2 = new RationalNumber<Number>(numerator2, denominator2);
    		rationalNumber1.verifyInvariant(denominator1);
    		rationalNumber2.verifyInvariant(denominator2);
    		rationalNumber1.addRational(rationalNumber2);
    		operation.setText("+");
    		resultNumerator.setText(rationalNumber1.getNumerator().intValue()+"");
    		resultDenominator.setText(rationalNumber1.getDenominator().intValue()+"");
    	}catch(NumberFormatException e) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}catch(DenominatorZeroException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Is not posible divide by zero");
			message.setHeaderText(s.getMessage());
			message.show();
    	}
    }
    
    @FXML
    void divide(ActionEvent event) {
    	try {
    		int numerator1 = Integer.parseInt(this.numerator1.getText());
    		int	denominator1 = Integer.parseInt(this.denominator1.getText());
    		RationalNumber<Number> rationalNumber1 = new RationalNumber<Number>(numerator1, denominator1);
    		int numerator2 = Integer.parseInt(this.numerator2.getText());
    		int denominator2 = Integer.parseInt(this.denominator2.getText());
    		RationalNumber<Number> rationalNumber2 = new RationalNumber<Number>(numerator2, denominator2);
    		rationalNumber1.verifyInvariant(denominator1);
    		rationalNumber2.verifyInvariant(denominator2);
    		rationalNumber1.divideRational(rationalNumber2);
    		operation.setText("/");
    		resultNumerator.setText(rationalNumber1.getNumerator().intValue()+"");
    		resultDenominator.setText(rationalNumber1.getDenominator().intValue()+"");
    	}catch(NumberFormatException e) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}catch(DenominatorZeroException s) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Is not posible divide by zero");
			message.setHeaderText(s.getMessage());
			message.show();
    	}
    }

}
