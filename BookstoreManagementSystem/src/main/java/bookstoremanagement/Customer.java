package bookstoremanagement;

public class Customer {
	
		
		 
	    public String name;
	    public String email;
	    public String phoneNumber;
	    
		public Customer(String name, String email, String phoneNumber) {
			super();
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}

		
			
			public String getName() {
				return name;
			}

			public String getEmail() {
				return email;
			}

			public String getPhoneNumber() {
				return phoneNumber;
			}
			
			
			
			 public void setName(String name) {
				this.name = name;
			}



			public void setEmail(String email) {
				this.email = email;
			}



			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}



			@Override
			    public String toString() {
			        return "Name: " + name + "\nEMAIL: " + email + "\nphoneNumber: " + phoneNumber;
		
			 }
	    
		}

	
		
	    
	    


