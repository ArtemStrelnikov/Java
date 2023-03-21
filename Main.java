package L5;
import L7.Bus;

public class Main {
	public static void main (String [] args) {
		
		
		Bus bmwBus = new Bus();
		Bus vwBus = new Bus();
		Bus mBus = new Bus();
		
		
		
		bmwBus.model = "BMW";
		vwBus.model = "VW";
		mBus.model = "Mer";
			
		
		bmwBus.color = "Red";
		vwBus.color = "Green";
		mBus.color = "Grey";
		
		bmwBus.Nummer = "111";
		vwBus.Nummer = "222";
		mBus.Nummer = "333";
		
		
		bmwBus.showM();
		bmwBus.showColor();
		bmwBus.showNummer();
		
		vwBus.showM();
		vwBus.showColor();
		vwBus.showNummer();
		
		mBus.showM();
		mBus.showColor();
		mBus.showNummer();
		
			
		
	}
	

}
