package work_observer;

public class WorkItem {
	private long ItemID;
	private long WorkerID;
	private String Message;

	public WorkItem(String ItemID, long WorkerID, String Message) {
		this.ItemID = Long.parseLong(ItemID);
		this.WorkerID = WorkerID;
		this.Message = Message;
	}

	public long getItemID() {
		return ItemID;
	}
	
	public long getWorkerID() {
		return WorkerID;
	}
	
	public String getMessage() {
		return Message;
	}

	public void setItemID(long itemID) {
		ItemID = itemID;
	}
	
	public void setWorkerID(long workerID) {
		WorkerID = workerID;
	}
	
	public void setMessage(String message) {
		Message = message;
	}
	
}
