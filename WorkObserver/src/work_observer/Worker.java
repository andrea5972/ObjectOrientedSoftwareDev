//subscribers

package work_observer;

public class Worker implements Observer {

	private long WorkerID;
	
	public Worker(long workerId) {
		WorkerID = workerId;
	}

	@Override
	public WorkItem update(WorkItem workItem) {
		if (workItem.getItemID() != WorkerID) {
			return null;
		} else {
			System.out.println("Worker " + WorkerID + " processed WorkItem <" + workItem.getItemID() + "> message " + workItem.getMessage());
			long itemID = workItem.getItemID() + 1;
			workItem.setItemID(itemID);
			return workItem;
		}
	}
	
	public long getWorkerID() {
		return WorkerID;
	}

}
