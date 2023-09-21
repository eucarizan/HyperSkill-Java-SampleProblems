import java.util.regex.Pattern;

public class VehicleRegistration {
    public static boolean isValidNumber(String registrationNumber) {
        Pattern pattern = Pattern.compile("[ABEKMHOPCTYX][0-9]{3}[ABEKMHOPCTYX]{2}$");

        return pattern.matcher(registrationNumber).find();
    }
}
