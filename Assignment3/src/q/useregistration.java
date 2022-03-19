package q;
import java.util.InvalidException;
public class useregistration {public void registerUser(String username, String userCountry) throws Invalidxception {

if (!userCountry.equals("India"))

throw new InvalidException("User Outside India cannot be registered");
else

System.out.println("User Registration done successfully");

}

public static void main(String[] args) {

UserRegisteration registration = new UserRegisteration();
try {

registration.registerUser("Mickey", "US");
} catch (InvalidCountryException e) {

System.out.println(e.getMessage());
}
}

