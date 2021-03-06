//package git_tutorial;

import java.awt.Frame;

import javax.swing.JFrame;

public class Application extends JFrame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Model modl = new Model();
		Controller ctrl = new Controller(modl); 
		View view = new View();
		modl.addObserver(view);
		view.addActionListener(ctrl);

		this.setTitle("counter window for Git Tutorial");

		this.add(view);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

}
