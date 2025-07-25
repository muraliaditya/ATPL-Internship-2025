import java.util.*;
import java.util.function.Function;
class User {
    String name;
    String email;
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    String getEmail() {
        return email;
    }
}
public class UserSearch {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
            new User("Aditya", "aditya@example.com"),
            new User("Vinnu", "vinnu@example.com"),
            new User("Bhanu", null)
        );
        String searchName = "Aditya";
        Function<String, String> toUpperCase = String::toUpperCase;
        Optional<String> result = users.stream().filter(u -> u.name.equalsIgnoreCase(searchName)).map(User::getEmail).filter(Objects::nonNull).map(toUpperCase).findFirst();
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Email not found or user does not exist");
        }
    }
}

