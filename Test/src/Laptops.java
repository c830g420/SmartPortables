import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/Laptops")

/* 
	Tablet class contains class variables name,price,image,retailer,condition,discount.

	Tablet class has a constructor with Arguments name,price,image,retailer,condition,discount.
	  
	Tablet class contains getters and setters for name,price,image,retailer,condition,discount.
*/

public class Laptops extends HttpServlet{
	private String id;
	private String name;
	private double price;
	private String image;
	private String maker;
	private String condition;
	private double discount;
	
	public Laptops(String name, double price, String image, String retailer, String condition,double discount){
		this.name=name;
		this.price=price;
		this.image=image;
		this.condition=condition;
		this.discount = discount;
		this.maker = retailer;
	}
	
	public Laptops(){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRetailer() {
		return maker;
	}
	public void setRetailer(String retailer) {
		this.maker = retailer;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
