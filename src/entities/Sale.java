package entities;

public class Sale {
	
	private Integer month;
	private Integer year;
	private String seller;
	private Integer item;
	private Double total;
	
	public Sale(Integer month, Integer year, String seller, Integer item, Double total) {
		this.month = month;
		this.year = year;
		this.seller = seller;
		this.item = item;
		this.total = total;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Double averagePrice() {
		return total / item;
	}

	@Override
	public String toString() {
		return month 
				+ "/" + year + ", " 
				+ seller + ", " + item + ", " 
				+ String.format("%.2f", total) + ", pm = " 
				+  String.format("%.2f", averagePrice());
	}
	
	
}
