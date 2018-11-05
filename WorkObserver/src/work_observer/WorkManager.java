//publisher, Subject

package work_observer;

public interface WorkManager {

	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
