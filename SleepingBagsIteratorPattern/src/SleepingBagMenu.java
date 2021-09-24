import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SleepingBagMenu {
	List<SleepingBags> SleepingBagTypes;

	public SleepingBagMenu() {
		SleepingBagTypes = new ArrayList<SleepingBags>();
	}

	public void addSleepingBags(SleepingBags type) {
		SleepingBagTypes.add(type);
	}

	public Iterator<SleepingBags> iterator() {
		return new SleepingBagsIterator();
	}
	public class SleepingBagsIterator implements Iterator<SleepingBags> {
		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			
			if(currentIndex>=SleepingBagTypes.size()) {
				return false;
			}else {
				return true;
			}
		}

		@Override
		public SleepingBags next() {
			// TODO Auto-generated method stub
			return SleepingBagTypes.get(currentIndex++);
		}
		@Override
		public void remove() {
			SleepingBagTypes.remove(--currentIndex);
		}


	}


}
