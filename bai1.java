import java.awt.*;
import java.awt.event.*;
public class bai1 extends Frame implements ActionListener {
	 private Label l;    
	   private TextField t; 
	   private Button bt;  
	   private int count = 0;

	/**
	 * @param args
	 */
	   public bai1 (){
		   frame f = new frame();
			f.setTitle("cua so mot");
			f.setSize(250, 100);
			f.setLayout(new flowLayout());
					Label l=new Label("Counter");
					f.add(l);
					final TextField t=new TextField(18);
					f.add(t);
					t.setEditable(false);
					Button bt = new Button("Count");
					f.add(bt);
					f.setVisible(true);

	   }
	public static void main(String[] args) {
		 bai1 app = new bai1();
	}

}
public class EventQuit implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
