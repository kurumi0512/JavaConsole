package case01;
import java.util.Map;

public class DrinkOrderMain {

	public static void main(String[] args) {
		DrinkOrder drinkOrder = new DrinkOrder("greenTea", "s", "yes");
		System.out.println(drinkOrder.getInfo());
	}

}
