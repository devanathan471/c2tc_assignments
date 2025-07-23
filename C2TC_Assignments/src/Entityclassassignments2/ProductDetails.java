package Entityclassassignments2;

public class ProductDetails {
	    public static void main(String[] args) {
	        Products p1 = new Products();
	        p1.setId(1);
	        p1.setProductName("Heater");
	        p1.setPrice(5000);
	        System.out.println(p1);
	        
	        Products p2 = new Products();
	        p2.setId(2);
	        p2.setProductName("Cooler");
	        p2.setPrice(10000);
	        System.out.println(p2);
	        
	        Products p3 = new Products();
	        p3.setId(3);
	        p3.setProductName("Dryer");
	        p3.setPrice(5000);
	        System.out.println(p3);
}
}