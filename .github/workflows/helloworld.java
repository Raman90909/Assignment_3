public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, AppScan!");
    }
}

import java.sql.*;

public class InsecureJava {
    public static void main(String[] args) {
        String userInput = "1 OR 1=1";
        String query = "SELECT * FROM users WHERE id = '" + userInput + "'";
        System.out.println("Query: " + query);
    }
}

