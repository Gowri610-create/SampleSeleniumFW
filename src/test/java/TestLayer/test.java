package TestLayer;

import PageLayer.Home;
import PageLayer.Login;
import PageLayer.Logout;

public class test {

	public static void main(String[] args) {
		Login log=new Login();
		log.loginfunctionality("Admin", "admin123");
		Home hm=new Home();
		hm.homepageFunctionality();
		System.out.println("new user created");
		Logout lo=new Logout();
		lo.logout();
		
	}

}
