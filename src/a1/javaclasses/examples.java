/*Bookings b = new Bookings("fmohsen","FL101","2013-25-02",2,"123456",250.57);
		b.insert();
		b.closeConnection();
		System.out.println("Inserted! Success!");
		
		//Fetch
		Bookings b1 = new Bookings();
		b1.getData(3);
		System.out.println(b1.getUsername());
		b1.closeConnection();
		
		//Check login
		Users u = new Users("rahul","asdw");
		if(u.getLoggedIn())
		{
			System.out.println("Success! Logged in!");
			System.out.println(u.getEmail());
		}
		else
			System.out.println("Fail! Incorrect uid/pwd");
		u.closeConnection();

		//New user
		Users u1 = new Users("risola","321", "risola@uncc.edu", "25-AUG-1990");
		if(!u1.checkUsername())
		{
			u1.insert();
			System.out.println("Success! Registered!");
			System.out.println(u1.getEmail());
		}
		else
		{
			System.out.println("Fail! User already exists!");
		}
		u1.closeConnection();*/