public class FacebookTest {

    public static void main(String[] args) {
        // create a new Facebook object
        Facebook fb = new Facebook();

        // add a few users
        fb.addUser("Alice");
        fb.addUser("Bob");
        fb.addUser("Charles");

        // posts some messages
        fb.getUser("Alice").addPost("I am new to Facebook!");
        fb.getUser("Bob").addPost("It is almost Friday!");
        fb.getUser("Charles").addPost("I want to go watch Star Wars Last Jedi!");
        
        // view posts
        fb.viewPosts("Alice"); // displays the following
        // Alice: I am new to Facebook!
        
        System.out.println("1");

        fb.viewPosts("Bob"); // displays the following
        // Bob: It is almost Friday!
        System.out.println("2");

        fb.viewPosts("Charles"); // displays the following
        // Charles: I want to go watch Star Wars Last Jedi!
        System.out.println("3");
        
        // make some friends (Alice and Bob are friends)
        fb.getUser("Alice").addFriend(fb.getUser("Bob"));


        // view posts
        fb.viewPosts("Alice"); // displays the following
        // Alice: I am new to Facebook!
        // Bob: It is almost Friday!
        System.out.println("4");
        
        fb.viewPosts("Bob"); // displays the following
        // Bob: It is almost Friday!
        // Alice: I am new to Facebook!
        System.out.println("5");

        fb.viewPosts("Charles"); // displays the following
        // Charles: I want to go watch Star Wars Last Jedi!
        System.out.println("6");
        
        // add even more posts
        fb.getUser("Alice").addPost("Nice to meet you, Bob!");
        fb.getUser("Bob").addPost("Nice to meet you too, Alice!");
        
        // make some friends (Alice and Charles are friends)
        fb.getUser("Alice").addFriend(fb.getUser("Charles"));

        // view posts
        fb.viewPosts("Alice"); // displays the following
        // Posts from Alice and Alice's friends
        //   Alice: Nice to meet you, Bob!
        //   Alice: I am new to Facebook!
        //   Bob: Nice to meet you too, Alice!
        //   Bob: It is almost Friday!
        //   Charles: I want to go watch Star Wars Last Jedi!
        System.out.println("7");

        fb.viewPosts("Bob"); // displays the following
        // Posts from Bob and Bob's friends
        //   Bob: Nice to meet you too, Alice!
        //   Bob: It is almost Friday!
        //   Alice: Nice to meet you, Bob!
        //   Alice: I am new to Facebook!
        System.out.println("8");

        fb.viewPosts("Charles"); // displays the following
        // Posts from Charles and Charles's friends
        //   Charles: I want to go watch Star Wars Last Jedi!
        //   Alice: Nice to meet you, Bob!
        //   Alice: I am new to Facebook!
        System.out.println("9");
    }

}