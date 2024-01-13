package temperatureConverter;
import javax.swing.JOptionPane;

public class TemperatureConverter {

    public static void main(String[] args) {
 String temperatureSelect = JOptionPane.showInputDialog("Select a converion:\n1. Fahrenheit to Celsius \n2. Celsius to Fahrenheit");
 if(temperatureSelect.equals("1")) {
	String UserInput1 = JOptionPane.showInputDialog("Enter your Fahrenheit value");
	double valueF = Double.parseDouble(UserInput1);
	double result1 = (valueF - 32)* 5/9;
	JOptionPane.showMessageDialog(null, "your whether is: " + result1 + "°F");

}else if(temperatureSelect.equals("2")) {
	String UserInput2 = JOptionPane.showInputDialog("Enter a celsius value");
	double valueC = Double.parseDouble(UserInput2);
	double result2 = (valueC + 32)* 5/9;
	JOptionPane.showMessageDialog(null, "your whether is: " + result2 + "°C");
}
else {
	JOptionPane.showMessageDialog(null, "Invalid Input");
}
	}
}
