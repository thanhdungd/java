import java.awt.*;
import java.awt.event.*;
public class WindowEventDemo extends Frame implements ActionListener, WindowListener {
	private TextField tfCount;  
	 private Button btnCount;    
	 private int count = 0;   

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 new WindowEventDemo();
	}

 public WindowEventDemo() {
	 frame f = new frame();
    f.setLayout(new FlowLayout()); 
    f.add(new Label("Counter")); 
    final TextField t=new TextField("0", 10); 
    t.setEditable(false);      
    f.add(t); 
    Button bt = new Button("Count");  
    f.add(bt);
    bt.addActionListener(this);
    f.addWindowListener(this);
    f.setVisible(true); 
    
}
 public void actionPerformed(ActionEvent evt) {
     ++count;
   t.setText(count + "");
  }
 public void windowClosing(WindowEvent evt) {
     System.exit(0); 
  }
 public void windowOpened(WindowEvent evt) {
 }
 public void windowClosed(WindowEvent evt) {
 }
 public void windowIconified(WindowEvent evt) {
 }
 public void windowDeiconified(WindowEvent evt) {
 }
 public void windowActivated(WindowEvent evt) {
 }
 public void windowDeactivated(WindowEvent evt) {
 }
}
