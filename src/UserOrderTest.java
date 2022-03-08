import java.time.LocalDateTime;

public class UserOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserOrder user = new UserOrder(1l, 1l, "Greg Odessky", "Keyboard and mouse",
				LocalDateTime.of(2022, 03, 05, 8, 00, 42));
		UserOrder user2 = new UserOrder(user);
		System.out.println(user.getItemName());
		user.setItemName("KeyBoard");
		System.out.println(user.getItemName());
		System.out.println(user.getUserFullName());
		user.setUserFullName("Gregory Odessky");
		System.out.println(user.getUserFullName());
		System.out.println(user2);
		System.out.println(user);
	}

}
