package functionalinterface;

import java.util.function.Supplier;
import java.util.List;


public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl (){
        return "jdvc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdvc://localhost:5432/users";

    // or

    static Supplier<List<String>> getDBConnectionUrlsSupplier = ()
            -> List.of(
                "jdvc://localhost:5432/users",
                "jdvc://localhost:5432/customers");

}
