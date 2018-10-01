package observer.pattern;


public class RunHW4 {
	
	private static PublisherImplementation pub;
	
	public static void main(String[] args) {
		
		pub = new PublisherImplementation();
		
		SubscriberEvens evenS = new SubscriberEvens();
		SubscriberOdds oddS = new SubscriberOdds();
		SubscriberThrees threeS = new SubscriberThrees();
		
		pub.registerObserver(evenS);
		pub.registerObserver(oddS);
		pub.registerObserver(threeS);
		
		pub.runSimulation();
		
	}
}

class SubscriberOdds implements Observer{

	@Override
	public boolean updateObservers(Event e) {
		if (e.getEventData() % 2 != 0) {
		    System.out.println(String.format("Event %d is odd: %d", 
		    		e.getEventNumber(), e.getEventData()));
			return true;
		} else {
			return false;
		}
	}
	
}
class SubscriberEvens implements Observer{

	@Override
	public boolean updateObservers(Event e) {
		if (e.getEventData() % 2 == 0) {
		    System.out.println(String.format("Event %d is even: %d", 
		    		e.getEventNumber(), e.getEventData()));
			return true;
		} else {
			return false;
		}
	}
	
}
	
class SubscriberThrees implements Observer{

	@Override
	public boolean updateObservers(Event e) {
		if (e.getEventData() % 3 == 0) {
		    System.out.println(String.format("Event %d is even: %d", 
		    		e.getEventNumber(), e.getEventData()));
			return true;
		} else {
			return false;
		}
	}
	
}

