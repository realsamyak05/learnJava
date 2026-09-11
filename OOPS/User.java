public class User {
    String username;
    String email;
    int age;

    User(){
        this.username = "Guest";
        this.age = 0;
        this.email = "Not Available";
    }

    User(String username){
        this.username = username;
        this.age = 0;
        this.email = "Not available";
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }


    public static void main(String[] args){
        User user1 = new User();
        User user2 = new User("Sam");
        User user3 = new User("Sam", "sam@chat.com");
        User user4 = new User("Sam", "sam@chat.com", 20);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);


    }
    
}
