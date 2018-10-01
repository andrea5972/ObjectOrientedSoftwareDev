package observer.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;


public class PublisherImplementation implements PublisherInterface {
	
	private List<Observer> subscribers = new ArrayList<Observer>();
	private List<Observer> unregistered_subs  = new ArrayList<>();
	private int Event;
	private observer.pattern.Event e;
	
	public PublisherImplementation() {
		subscribers = new ArrayList<>();
		unregistered_subs = new ArrayList<>();
	}

	public void registerObserver(Observer o) {
		this.subscribers.add(o);
		this.unregistered_subs.add(o);
	}
	
	public void removeObserver(Observer o) {
		this.subscribers.remove(o);
		this.unregistered_subs.remove(o);
	}
	
	public void notifiyObserver(){
		for (Observer o : this.subscribers) {
			o.updateObservers(e);
	}
	}
	private int generateEvent() { 
		return this.Event;
	}
	
	public void runSimulation() {
		int i, odds, threes, data;
		Random random;
		boolean isTrue, unregistered;
		Event e;
		
		List<Integer> subIterations = new ArrayList<>(Arrays.asList(40, 80, 120, 160, 200)); 
		
		random = new Random();
		odds = threes = 0;
		
		for (i = 1; i < 201; i++) {
			data = random.nextInt(5000) + 1;
			e = new Event(i,  data);
			
			for(Observer o : subscribers) {
				isTrue = false;
				unregistered = unregistered_subs.contains(o);
				
				if (unregistered) {
					if(subIterations.contains(i))
						unregistered_subs.remove(o);
				} else {
						continue;
				}
				
				isTrue = o.updateObservers(e);
				if (!isTrue) 
					continue;
				
				if (o instanceof SubscriberOdds) {
					odds += 1;
					if (odds > 20)
						unregistered_subs.add(o);
				} else if (o instanceof SubscriberThrees) {
					threes += 1;
					if (threes > 6)
						unregistered_subs.add(o);
				}
			}
		}
	}

	@Override
	public void notifyObservers() {
		
	}
}

