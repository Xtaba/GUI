import javax.swing.JOptionPane;//GUI

public class GUI {
	public static void main(String[] args){
		
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(fn); //takes the numbers we enter converts it to number
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2; //sum of num1 and num2
		
		JOptionPane.showMessageDialog(null, "The answer is" +sum, "I found the sum", JOptionPane.PLAIN_MESSAGE); //first parameter is where to position it and null puts it in the middle of screen
	} //second one is what you want to say for your prompt or message, 4 is message that pops up

}
