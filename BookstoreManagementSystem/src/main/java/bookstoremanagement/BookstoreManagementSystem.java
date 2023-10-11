// 1. Proper Packages
package bookstoremanagement;










class Book {
    public String title;
    public String author;
    public String isbn;
    public double price;
    public int quantity;
	public String getTitle() {
		return title;
	}
	public Book(String title, String author, String isbn, double price, int quantity) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setTitle(String newTitle) {
		System.out.println(newTitle);
		
	}
	public void setAuthor(String newAuthor) {
		System.out.println(newAuthor);
		
	}
	public void setPrice(double newPrice) {
		
		System.out.println(newPrice);
		
	}
	

	
	       



	
	
    
}


    