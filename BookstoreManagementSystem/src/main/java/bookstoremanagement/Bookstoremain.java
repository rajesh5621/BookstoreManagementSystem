package bookstoremanagement;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bookstoremain {

    private static Bookstore bookstore;

    public static void main(String[] args) {
        bookstore = new Bookstore();
        Menu menu = new Menu(bookstore); // Create an instance of the Menu class
        menu.run(); // Start the menu interaction
    }

    static class Bookstore {
        static Map<String, Book> bookInventory = new HashMap<>();
        List<Customer> customers = new ArrayList<>();

        public class Inventory {
            public List<Book> books;

            public Inventory() {
                this.books = new ArrayList<>();
            }

            public class Customer {
                public List<Customer> Customer;

                public Customer() {
                    this.Customer = new ArrayList<>();
                }

                // Methods to add, update, search, delete books, and display inventory here

                public class bookstore {

                    public void addBook(Book book) {
                        books.add(book);
                    }

                    public void updateBook(String ISBN, Book updatedBook) {
                        for (int i = 0; i < books.size(); i++) {
                            if (books.get(i).getIsbn().equals(ISBN)) {
                                books.set(i, updatedBook);
                                return;
                            }
                        }
                    }

                    public Book searchBook(String ISBN) {
                        for (Book book : books) {
                            if (book.getIsbn().equals(ISBN)) {
                                return book;
                            }
                        }
                        return null; // Book not found
                    }

                    public void deleteBook(String ISBN) {
                        books.removeIf(book -> book.getIsbn().equals(ISBN));
                    }
                }

                public void displayInventory() {
                    for (Book book : books) {
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Author: " + book.getAuthor());
                        System.out.println("ISBN: " + book.getIsbn());
                        System.out.println("Price: " + book.getPrice());
                        System.out.println();
                    }
                }

                public void CustomerDetails() {
                    List<bookstoremanagement.Customer> customers = bookstore.customers;
                    
                  

                    for (bookstoremanagement.Customer customer : customers) {
                        System.out.println("Name: " + customer.getName());
                        System.out.println("Email: " + customer.getEmail());
                        System.out.println("PhoneNumber: " + customer.getPhoneNumber());
                        
                        
                        
                    
                   
                }
                }

                public Book searchBook(String string) {
                    return null;
                }
            }
        }
    }

    static class Menu {
        public Scanner scanner = new Scanner(System.in);
        public Bookstore bookstore;

        public Menu(Bookstore bookstore) {
            this.bookstore = bookstore;
        }

        public void run() {
            int choice;
            do {
                choice = displayMenu();
                scanner.nextLine(); 
                switch (choice) {
                    case 1:
                    	displayBookStockDetails();
                        break;
                    case 2:
                        addBook();
                        break;
                    case 3:
                        searchBook();
                        break;
                    case 4:
                        updateBook();
                        break;
                    case 5:
                        deleteBook();
                        break;
                    case 6:
                        CustomerDetails();
                        break;
                    case 7:
                    	addCustomerdetails();
                    	break;
                        
                    case 0:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);
        }

       

		public int displayMenu() {
            System.out.println("Menu:");
            System.out.println("1. Display Book Stock Details");
            System.out.println("2. Add New Book Details");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete Book");
            System.out.println("6. Customer Details");
            System.out.println("7. Add Customer Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            return scanner.nextInt();
        }

		
		public void displayBookStockDetails() {
		    Map<String, Book> bookInventory = Bookstore.bookInventory;

		    if (bookInventory.isEmpty()) {
		        System.out.println("Book stock is empty.");
		    } else {
		        System.out.println("Book Stock Details:");
		        for (Book book : bookInventory.values()) {
		            System.out.println("Title: " + book.getTitle());
		            System.out.println("Author: " + book.getAuthor());
		            System.out.println("ISBN: " + book.getIsbn());
		            System.out.println("Price: " + book.getPrice());
		            System.out.println();
		        }
		    }
		}

        public void addBook() {
            System.out.print("Enter book title:\n ");
            String title = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = scanner.nextLine();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            Book book = new Book(title, author, isbn, price, 0);
            try {
                Bookstore.bookInventory.put(isbn, book);
            } catch (Exception e) {
                System.out.println("Book added successfully.");
                e.printStackTrace();
            }
            System.out.println("Book added Successfully");
        }

        public void searchBook() {
            System.out.print("Enter ISBN to search for a book: ");
            String isbn = scanner.next();
            Book book = Bookstore.bookInventory.get(isbn);
            if (book != null) {
                System.out.println("Found book:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Price: " + book.getPrice());
            } else {
                System.out.println("Book not found.");
            }
        }

        public void updateBook() {
            System.out.print("Enter ISBN to update book details: ");
            String isbn = scanner.next();
            Book book = Bookstore.bookInventory.get(isbn);
            if (book != null) {
                System.out.print("Enter new title: ");
                String newTitle = scanner.next();
                System.out.print("Enter new author: ");
                String newAuthor = scanner.next();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();

                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setPrice(newPrice);

                System.out.println("Book details updated successfully.");
            } else {
                System.out.println("Book not found.");
            }
        }

        public void deleteBook() {
            System.out.print("Enter ISBN to delete book: ");
            String isbn = scanner.next();
            Book book = Bookstore.bookInventory.remove(isbn);
            if (book != null) {
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Book not found.");
            }
        }

        public void CustomerDetails() {
            List<bookstoremanagement.Customer> customers = bookstore.customers;

            if (customers.isEmpty()) {
                System.out.println("THERE IS NO CUSTOMER DETAILS");
            } else {
            	System.out.println("CUSTOMER DETAILS");
                
                
                
            for (bookstoremanagement.Customer customer : customers) {
                System.out.println("Name: " + customer.getName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("PhoneNumber: " + customer.getPhoneNumber());
                System.out.println(" ");
            }
            }
        }
            
                public void addCustomerdetails() {
                	System.out.print("Enter customer name: ");
                    String name = scanner.next();
                    System.out.print("Enter customer email: ");
                    String email = scanner.next();
                    System.out.print("Enter customer phone number: ");
                    String phoneNumber = scanner.next();
     
                    Customer newCustomer = new Customer(name, email, phoneNumber);
                    bookstore.customers.add(newCustomer);

                    System.out.println("Customer added successfully.");
                	
                }
            
    }
               


            
        

        public static void exit() {
            System.out.println("Exiting the bookstore. Thank you!");
        }
    }


