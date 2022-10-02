package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        Supplier<IllegalStateException> exception = ()
//                -> new IllegalStateException("exception");

//        Optional.ofNullable("vincenttran@gmail.com")
////                .orElseGet(() -> "default value");
////                    .orElseThrow(exception);
//                    .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
//                .orElseGet(() -> "default value");
//                    .orElseThrow(exception);
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));




    }
}
