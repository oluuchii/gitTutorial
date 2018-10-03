
import java.util.Observable;

public class Model extends Observable {

	int compte;
	
	public Model() {
		this.compte = 0;
	}

	public void incrémente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
	
}
