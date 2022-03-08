import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserOrder user = new UserOrder(1l, 1l, "Luthar King", "Keyboard and mouse",
				LocalDateTime.of(2022, 03, 12, 8, 00, 42));
		UserOrder user2 = new UserOrder(2l, 2l, "Greg Odessky", "Keyboard and mouse",
				LocalDateTime.of(2022, 03, 9, 8, 00, 42));
		UserOrder user3 = new UserOrder(3l, 3l, "Greg Odessky", "Keyboard and mouse",
				LocalDateTime.of(2022, 03, 7, 8, 00, 42));
		UserOrder user4 = new UserOrder(4l, 4l, "Greg Odessky", "Keyboard and mouse",
				LocalDateTime.of(2022, 03, 5, 8, 00, 42));
		UserOrder user5 = new UserOrder(5l, 5l, "Abraham Jackson", "Keyboard and mouse",
				LocalDateTime.of(2022, 05, 5, 8, 00, 42));
		List<UserOrder> orders = new ArrayList<>();
		orders.add(user);
		orders.add(user2);
		orders.add(user3);
		orders.add(user4);
		orders.add(user5);
		OrderSystem ordersys = new OrderSystem(orders);
		ordersys.searchAll();

	}

}
