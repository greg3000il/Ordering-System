import java.time.LocalDateTime;

//Here We have the UserOrder i added the LocalDateTime variable to get when the order was ordered or to when
public class UserOrder {
	long userId;
	long orderId;
	String userFullName;
	String itemName;
	LocalDateTime timePoint;

	public UserOrder(long useId, long orderId, String userFullName, String itemName, LocalDateTime timePoint) {
		this.userId = useId;
		this.orderId = orderId;
		this.userFullName = userFullName;
		this.itemName = itemName;
		this.timePoint = timePoint;

	}

	public UserOrder(UserOrder user) {
		this.userId = user.userId;
		this.orderId = user.orderId;
		this.userFullName = user.userFullName;
		this.itemName = user.itemName;
		this.timePoint = user.timePoint;
	}

	@Override
	public String toString() {
		return "UserOrder [useId=" + userId + ", orderId=" + orderId + ", userFullName=" + userFullName + ", itemName="
				+ itemName + ", timePoint=" + timePoint + "]";
	}

	public LocalDateTime getTimePoint() {
		return timePoint;
	}

	public void setTimePoint(LocalDateTime timePoint) {
		this.timePoint = timePoint;
	}

	public long getUseId() {
		return userId;
	}

	public void setUseId(long useId) {
		this.userId = useId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
