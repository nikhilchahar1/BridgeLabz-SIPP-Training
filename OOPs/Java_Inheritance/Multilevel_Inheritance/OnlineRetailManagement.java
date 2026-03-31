// Base Class
class Order{
	String orderId;
	String orderDate;
	
	// Constructor to initialize properties
	Order(String id, String date){
		this.orderId = id;
		this.orderDate = date;
	}
	
	String orderStatus() {
		return "Order Placed";
	}
	
	void getdetails() {
		System.out.println("Order ID : " +orderId);
		System.out.println("Order Date : " +orderDate);
	}
}

// Subclass
class ShippedOrder extends Order{
	int trackingNumber;
	
	// Constructor to inherit superclass properties and initialize properties
	ShippedOrder(String id, String date, int tracknumber){
		super(id, date);
		this.trackingNumber = tracknumber;
	}
	
	@Override
	String orderStatus() {
		return "Order Shipped";
	}
	
	@Override
	void getdetails() {
		System.out.println("Order ID : " +orderId);
		System.out.println("Order Date : " +orderDate);
		System.out.println("Tracking number : " +trackingNumber);
	}
}

// Another subclass
class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	
	// Constructor to inherit superclass properties and initialize properties
	DeliveredOrder(String id, String date, int tracknumber, String deliveryDate){
		super(id, date, tracknumber);
		this.deliveryDate = deliveryDate;
	}
	
	@Override
	String orderStatus() {
		return "Order Delivered";
	}
	
	@Override
	void getdetails() {
		System.out.println("Order ID : " +orderId);
		System.out.println("Order Date : " +orderDate);
		System.out.println("Tracking number : " +trackingNumber);
		System.out.println("Delivery Date : " +deliveryDate);
	}
}

// Main class
class OnlineRetailManagement{
	public static void main(String[] args) {
		Order order = new Order("S7289N", "30/06/25");
		System.out.println("\n==== Order Placed ====");
		order.getdetails();
		order.orderStatus();
		
		ShippedOrder so = new ShippedOrder("S7289N", "30/06/25", 1002576543);
		System.out.println("\n==== Order Shipment ====");
		so.getdetails();
		so.orderStatus();
		
		DeliveredOrder dor = new DeliveredOrder("S7289N", "30/06/25", 1002576543, "05/07/25");
		System.out.println("\n==== Order delivery ====");
		dor.getdetails();
		dor.orderStatus();
	}
}