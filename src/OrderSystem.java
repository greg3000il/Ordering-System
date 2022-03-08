import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

//The order system class has and array list of user orders and the time right now
public class OrderSystem {
	List<UserOrder> orders = new ArrayList<>();
	LocalDateTime now = LocalDateTime.now();

	// Since We already intiliazed our time we only needed a array list of user
	// orders
	public OrderSystem(List<UserOrder> orders) {
		this.orders.addAll(orders);
	}

	// Here we get a user ID and and we print out all the orders with the same
	// userID and that are to later dates
	public void searchByUserId(long userId) {
		List<UserOrder> rorders = new ArrayList<>();
		rorders.addAll(this.orders);
		rorders.sort((o1, o2) -> o1.getUserFullName().compareTo(o2.getUserFullName()));
		for (int i = 0; i < rorders.size(); i++) {
			if (rorders.get(i).userId == userId && rorders.get(i).getTimePoint().isAfter(now)) {
				System.out.println(rorders.get(i));
			}

		}

	}

	// Here We get a order ID and we print all the orders with the same Order ID and
	// that are to later dates
	public void searchByOrderId(long orderId) {
		List<UserOrder> rorders = new ArrayList<>();
		rorders.addAll(this.orders);
		rorders.sort((o1, o2) -> o1.getUserFullName().compareTo(o2.getUserFullName()));
		for (int i = 0; i < rorders.size(); i++) {
			if (rorders.get(i).orderId == orderId && rorders.get(i).getTimePoint().isAfter(now)) {
				System.out.println(rorders.get(i));
			}
		}
	}

	// Here we get the name of the customer and we print all the orders that are
	// under the same name and that are to later dates
	public void searchByUserFullName(String userFullName) {
		List<UserOrder> rorders = new ArrayList<>();
		rorders.addAll(this.orders);
		rorders.sort((o1, o2) -> o1.getUserFullName().compareTo(o2.getUserFullName()));
		for (int i = 0; i < rorders.size(); i++) {
			if (rorders.get(i).userFullName == userFullName && rorders.get(i).getTimePoint().isAfter(now)) {
				System.out.println(rorders.get(i));
			}
		}
	}

	// Here we get an item name and we print out all the orders that have the item
	// and that are to later dates
	public void searchByItemName(String itemName) {
		List<UserOrder> rorders = new ArrayList<>();
		rorders.addAll(this.orders);
		rorders.sort((o1, o2) -> o1.getUserFullName().compareTo(o2.getUserFullName()));
		for (int i = 0; i < rorders.size(); i++) {
			if (rorders.get(i).itemName == itemName && rorders.get(i).getTimePoint().isAfter(now)) {
				System.out.println(rorders.get(i));
			}
		}
	}

	// Here we print all the orders that are in the system but not including the
	// orders that are past due
	public void searchAll() {
		List<UserOrder> rorders = new ArrayList<>();
		rorders.addAll(this.orders);
		rorders.sort((o1, o2) -> o1.getUserFullName().compareTo(o2.getUserFullName()));
		for (int i = 0; i < rorders.size(); i++) {
			if (rorders.get(i).getTimePoint().isAfter(now))
				System.out.println(rorders.get(i));
		}
	}

}
