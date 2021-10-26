// Kim Merchant
// This programs allows the creation of objects representing Facebook users and posts.
// User objects are represented by their unique first names. They can have associated posts and friends.
// Resources used included class notes and Oracle Java 12 docs for Array Lists
// Gilligan's Island Rule applied

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<User> friends;
	private ArrayList<String> posts;
	
	// constructor
	public User(String name) {						// creates a new user object with the input name and a default 0 friends and 0 posts
		this.name = name;
		this.friends = new ArrayList<User>();
		this.posts = new ArrayList<String>();
	}
	
	// instance methods
	public String getName() {						// returns a user-object's name
		return this.name;
	}
	
	public ArrayList<User> getFriends() {			// returns the array list of a user-object's associated "friends" (other user objects)
		return this.friends;
	}
	
	public ArrayList<String> getPosts() {			// returns the array list of a user-object's associated "posts" (strings)
		return this.posts;
	}
	
	public void addFriend(User newFriend) {			// attaches a new friend to the user object and makes the user a friend of the new friend
		this.friends.add(newFriend);
		newFriend.friends.add(this);
	}
	
	public void addPost(String newPost) {			// adds a new post to the beginning of the post list assigned to the user object
		this.posts.add(0, newPost);
	}
}
