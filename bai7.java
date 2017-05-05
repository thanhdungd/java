import java.awt.*;
import java.awt.event.*;
public class AWTCounterNamedInnerClass extends Frame {
	private TextField t;
	   private Button bt;
	   private int count = 0;
public AWTCounterNamedInnerClass (){
	frame f = new frame();
	 f.setTitle("AWT Counter");
     f.setSize(250, 100);
     setLayout(new FlowLayout());  
     add(new Label("Counter"));  
     t= new TextField("0", 10);
     t.setEditable(false);  
     f.add(t);              

     Button bt= new Button("Count");
     f.add(bt);  
     bt.addActionListener(new BtnCountListener());
     f.setVisible(true);

}
public static void main(String[] args) {
    new AWTCounterNamedInnerClass();
 }
private class BtnCountListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
       ++count;
       t.setText(count + "");
    }
 }


}
