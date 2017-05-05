import java.awt.*;
import java.awt.event.*;
public class  MouseMotionDemo extends Frame implements MouseListener, MouseMotionListener  {
	 private TextField tx;
	   private TextField ty;
	   private TextField tsx;
	   private TextField tsy;
	/**
	 * @param args
	 */
	public MouseMotionDemo() {
		frame f = new frame();
		f.setTitle("MouseMotion Demo");
	     f.setSize(400, 120);    
	      f.setLayout(new FlowLayout());
	      
	      f.add(new Label("X-Click: "));
	      TextField tx = new TextField(10);
	      tx.setEditable(false);
	      f.add(tx);
	      f.add(new Label("Y-Click: "));
	      TextField ty = new TextField(10);
	      ty.setEditable(false);
	      f.add(ty);
	 
	      f.add(new Label("X-Position: "));
	      TextField tsx = new TextField(10);
	      tsx.setEditable(false);
	      f.add(tsx);
	      f.add(new Label("Y-Position: "));
	      TextField tsy = new TextField(10);
	      tsy.setEditable(false);
	      f.add(tsy);
	 
	      f.addMouseListener(this);
	      f.addMouseMotionListener(this);
	      f.setVisible(true); 
		     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new MouseMotionDemo();
	}
	 public void mouseClicked(MouseEvent evt) {
		 tfMousePositionX.setText(evt.getX() + "");
		 tfMousePositionY.setText(evt.getY() + "");
	   }
	 public void mouseDragged(MouseEvent evt) { }
}
