import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tunaa2 extends JFrame{ //inheretance
	
	private JLabel item1;
	 
	public tunaa2(){
		super("This is my title bar bitches;)");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is my sentence haha");
		item1.setToolTipText("This is gonna hover over that bad girl");//tool tip text
		add(item1);
	}
}
