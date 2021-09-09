import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

public class MVC_Controller implements ActionListener {

	MVC_Model model;
	MVC_View view;

    public MVC_Controller(MVC_View v, MVC_Model m) {
    	view = v;
    	model = m;
    	actionListenerMeth(this);  //Add Action Listener to the button
    }//end constructor

    public void actionPerformed(ActionEvent arg0){
    	try{
    		//retrieve the input from view
    		String a = view.textField1.getText();
    		String b = view.textField2.getText();

    		//call add method
    		int result = model.add(a, b);

    		//display result in view
    		view.textFieldResult.setText("" + result);

    		} catch(Exception ee){
    			ee.printStackTrace();
    			}//end catch block

    	}//end actionPerformed Method


    	public void actionListenerMeth(ActionListener ae){
    		view.addButton.addActionListener(ae);
    		}//end actionListenerMetho Method


}