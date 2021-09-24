import java.util.Iterator;

public class SleepingBagsIteratorPattern {

	public static void main(String[] args) {
		SleepingBags sb1 = new SleepingBags("BarrelShaped", 7.50f);
		SleepingBags sb2 = new SleepingBags("RectangularShaped", 6.00f);
		SleepingBags sb3 = new SleepingBags("Synthetic Sleeping Bags", 6.50f);

		SleepingBagsMenuInterface SleepingBagMenu = new SleepingBagMenu();
		SleepingBagMenu.addSleepingBags(sb1);
		SleepingBagMenu.addSleepingBags(sb2);
		SleepingBagMenu.addSleepingBags(sb3);

		System.out.println("Displaying SleepingBagMenu:");
		Iterator<SleepingBags> iterator = SleepingBagMenu.iterator();
		while (iterator.hasNext()) {
			SleepingBags SleepingBags = iterator.next();
			System.out.println(SleepingBags);
		}

		System.out.println("\nRemoving last SleepingBags returned");
		iterator.remove();

		System.out.println("\nDisplaying SleepingBagMenu:");
		iterator = SleepingBagMenu.iterator();
		while (iterator.hasNext()) {
			SleepingBags SleepingBags = iterator.next();
			System.out.println(SleepingBags);
		}

	}

}