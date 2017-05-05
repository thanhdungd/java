import java.awt.*;
import java.awt.event.*;
public class MouseEventDemo extends Frame implements MouseListener {
	private TextField tfMouseX;
	private TextField tfMouseY;
	/**
	 * @param args
	 */
	public MouseEventDemo(){
		frame f = new frame();
		 f.setTitle("MouseEvent Demo"); 
	      f.setSize(350, 100);       
	     
		 f.setLayout(new FlowLayout());
	      f.add(new Label("X-Click: ")); 
	      TextField tx= new TextField(10);
	      tx.setEditable(false); 
	      f.add(tx);
	      f.add(new Label("Y-Click: "));
	      TextField ty = new TextField(10);
	      ty.setEditable(false); 
	      f.add(ty);    
	      f.addMouseListener(this);
	      f.setVisible(true); 
		     
	}
	public static void main(String[] args) {
		new MouseEventDemo();  
		   }
	 public void mouseClicked(MouseEvent evt) {
	      tx.setText(evt.getX() + "");
	      ty.setText(evt.getY() + "");
	   }
	 public void mousePressed(MouseEvent evt) { }
	 public void mouseReleased(MouseEvent evt) { }
	 public void mouseEntered(MouseEvent evt) { }
	 public void mouseExited(MouseEvent evt) { }
	}

