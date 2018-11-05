package work_observer;

public class RunWorkObserver{

	public static void main(String[] args) {
		WorkManagerImplementation workManager = new WorkManagerImplementation();
		
		Worker worker1 = new Worker(1);
		Worker worker2 = new Worker(2);
		Worker worker3 = new Worker(3);
		Worker worker4 = new Worker(4);
		
		workManager.addObserver(worker1);
		workManager.addObserver(worker2);
		workManager.addObserver(worker3);
		workManager.addObserver(worker4);
		
		workManager.setWorkItem(new WorkItem("1", 0, "Message1"));
		workManager.notifyObservers();
		
		workManager.setWorkItem(new WorkItem("3", 0, "Message3"));
		workManager.notifyObservers();
		
		workManager.setWorkItem(new WorkItem("5", 0, "Message5"));
		workManager.notifyObservers();
	}

}
