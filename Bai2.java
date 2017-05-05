import java.awt.*;
import java.awt.event.*;
public class bai2 extends Frame implements ActionListener  {

	/**
	 * @param args
	 */
	 private Label lblInput;    
	   private Label lblOutput;   
	   private TextField tfInput;
	   private TextField tfOutput;
	   private int sum = 0;     
	public bai2(){
		frame f = new frame();
		f.setTitle("cua so hai");
		f.setSize(350, 120);
		f.setLayout(new flowLayout());
				Label l=new Label("Enter an Integer:");
				f.add(l);
				final TextField t=new TextField(8);
				f.add(t);
				Label label=new Label("The Accumulated Sum is:"); 
				final TextField t=new TextField(123);
				f.add(t);
				t.setEditable(false);
				
				f.setVisible(true);

	}
	 public static void main(String[] args) {
	      new AWTAccumulator();
	   }
	 
public void actionPerformed(ActionEvent evt) {
    int numberIn = Integer.parseInt(tfInput.getText());
    sum += numberIn;      
    tfInput.setText(""); 
    tfOutput.setText(sum + ""); 
 }

public class EventQuit implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
}
