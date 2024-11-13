package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companysuffix = "abccompany.com";

	// Constructor to receive first name and last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email created: "+this.firstname + " " + this.lastname);
		// Call a method asking for department and returning the department
		this.department = setDepartment();
		System.out.println("Department: " +this.department);
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: "+this.password);
		// Combine elements to generate email
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companysuffix;
		System.out.println("Your comapny email is: " + email);
		
		
	}
	// Call a method asking for the department and return the department
	// Ask for the department
	private String setDepartment()
	{
		System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int deptchoice = sc.nextInt();
		if(deptchoice == 1) {
			return "Sales";
		}
		else if(deptchoice == 2) {
			return "Development";
		}
		else if(deptchoice == 3) {
			return "Accounting";
		}
			else {
				return "None";
			
		}
	}
		// Generate a random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%&*";
			char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
		// Set mailbox capacity
		public void setMailboxCapacity(int capacity) {
			this.mailboxcapacity = capacity;
		}
		// Set alternate email
		public void setAltertnateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
			// Change the password
			public void ChangePassword(String password) {
				this.password = password;
		}
			public int getMailBoxCapacity() {
				return mailboxcapacity;
			}
			public String getAlternateEmail() {
				return alternateEmail;
			}
			public String getChangePassword() {
				return password;
			}
			public String showInfo() {
				return ("Display Name: " +firstname + " " + lastname +
						"\nCompany Email: " + email +
						"\nMail Box Capacity: " +mailboxcapacity + "mb");
			}
}
