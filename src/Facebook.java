// Kim Merchant
// This programs allows the evaluation of objects representing Facebook users and posts.
// Facebook contains a list of "users" that can be altered, as well as allows for the reading of the objects' attached "posts"
// Resources used included class notes and Oracle Java 12 docs for Array Lists
// Gilligan's Island Rule applied


import java.util.ArrayList;

public class Facebook {
	// instance variables
	private ArrayList<User> users;
	
	// constructor									// creates a Facebook object with a default 0 users
	public Facebook() {
		this.users = new ArrayList<User> ();
	}
	
	// instance methods
	public void addUser(String newUserName) {		// allows the creation of a new Facebook user
		this.users.add(new User(newUserName));		// creates a new user object and adds them to the list of users
	}	
	
	public User getUser(String name) {				// gives the location of the user object with the input name
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName() == name) {
				return users.get(i);
			}
		}
		throw new RuntimeException("User not found");	// throws an exception if a user object with the desired name does not exist
	}
	
	public void viewPosts(String name) {			// displays all of the user, and the user's friends', posts
		for (int c = 0; c < getUser(name).getPosts().size(); c++) {	// looks at each user poster individually
			System.out.println(getUser(name).getName() + ": " + getUser(name).getPosts().get(c)); // prints each user post
		}
		for (int i = 0; i < getUser(name).getFriends().size(); i++) {	// looks at each of the user's friends' posts
			for (int x = 0; x < getUser(name).getFriends().get(i).getPosts().size(); x++) {
				System.out.println(getUser(name).getFriends().get(i).getName() + ": " + 
							getUser(name).getFriends().get(i).getPosts().get(x));	// prints each of the user's friends' posts
			}
		}
	}
}
