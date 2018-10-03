//package git_tutorial;

import java.awt.Frame;

public class Application extends Frame {

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
		this.setTitle("tutoriel git");
		this.add(view);
		this.pack();
		this.setVisible(true);
	}

}
