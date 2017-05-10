import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
public class baithuchanh1 extends Frame implements WindowListener,ActionListener {
	 private Label lbla;
	 private Label lblb; 
	 private Label lblkq; 
	   private TextField tfa;
	   private TextField tfb;
	   private TextField tfkq;
	   private Button btnCong;
	   private Button btntru;
	   private Button btnnhan;
	   private Button btnChia;
	/**
	 * @param args
	 */
	   public baithuchanh1 () {
		   setTitle (" phep toan");
		   setSize (200,300);
		   setLayout(new FlowLayout());
		 lbla = new Label("a=");
		 add(lbla);
		 
		 lblb = new Label("b=");
		 add(lblb);
		  
		 tfa =new TextField("0",10);
		 tfa.setEditable(false);
		 tfb =new TextField("0",10);
		 tfb.setEditable(false);
		 tfkq =new TextField("0",10);
		 tfkq.setEditable(false);
		 
		 btnCong = new Button("cộng");
		 btnCong.addActionListener(this);
		 add(btnCong);
		 btntru = new Button("trừ");
		 btntru.addActionListener(this);
		 add(btntru);
		 btnnhan = new Button("nhân");
		 btnnhan.addActionListener(this);
		 add(btnnhan);
		 btnChia = new Button("chia");
		 btnChia.addActionListener(this);
		 add(btnChia);
		 
		 addWindowListener(this);
		 setVisible(true);
		 
		 

}
	   public static void main(String[] args) {
		     
		      baithuchanh1 app = new baithuchanh1();
	   }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stubint
		int a = Integer.parseInt(tfa.getText());
		int b = Integer.parseInt(tfb.getText());
		
		if (e.getSource()==btnCong)
		{
			tfkq.setText(Cong(a,b)+"");
			int kq= a+b;
		}
		if (e.getSource()==btntru)
		{
			tfkq.setText(tru(a,b)+"");
			int kq=a-b;
		}
		if (e.getSource()==btnnhan)
		{
			tfkq.setText(nhan(a,b)+"");
			int kq=a*b;
		}
		if (e.getSource()==btnCong)
		{
			tfkq.setText(Chia(a,b)+"");
			int kq=a/b;
		}
		
	}
	private String Chia(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}
	private String nhan(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}
	private String tru(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}
	private String Cong(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
