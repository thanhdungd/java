import java.awt.*;
import java.awt.event.*;
public class KeyEventDemo extends Frame implements KeyListener {
	private TextField t; 
	private TextArea taDisplay;
	/**
	 * @param args
	 */
	public KeyEventDemo (){
		frame f = new frame();
		 f.setTitle("KeyEvent Demo");
	      f.setSize(400, 200); 
	      f.setLayout(new FlowLayout());
	      f.add(new Label("Enter Text: "));
	      TextField t = new TextField(10);
	      f.add(t);
	      taDisplay = new TextArea(5, 40); 
	      f.add(taDisplay);
	 
	      t.addKeyListener(this);
	      f. setVisible(true); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      new KeyEventDemo(); 
		   }
	 public void keyTyped(KeyEvent evt) {
	      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
	   }
	 public void keyPressed(KeyEvent evt) { }
	 public void keyReleased(KeyEvent evt) { }
	}

