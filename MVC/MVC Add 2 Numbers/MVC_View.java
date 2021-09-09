import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MVC_View extends JFrame{

	Container con;
	JButton addButton;
	JTextField textField1, textField2, textFieldResult;
	JLabel first, second, result;

    public MVC_View(MVC_Model model) {
    	con = getContentPane();
    	setTitle("MVC ADD EXAMPLE");
    	setLayout(new FlowLayout());
    	setSize(200,200);
    	first = new JLabel("Number 1");
    	textField1 = new JTextField("", 10);
    	second = new JLabel("Number 2");
    	textField2 = new JTextField("", 8);
    	result = new JLabel("Result");
    	textFieldResult = new JTextField("", 13);
    	addButton = new JButton("Add");
    	con.add(first);
    	con.add(textField1);
    	con.add(second);
    	con.add(textField2);
    	con.add(result);
    	con.add(textFieldResult);
    	con.add(addButton);
    	setVisible(true);

    }//end constructor


}