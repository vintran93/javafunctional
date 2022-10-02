package combinatorpattern;
import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+01234567890",
                LocalDate.of(2000, 1, 1)
        );

//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        validatorService.isValid(customer)

        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db
        // if no @ sign in email or no + sign in phone number -> false

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }
}
