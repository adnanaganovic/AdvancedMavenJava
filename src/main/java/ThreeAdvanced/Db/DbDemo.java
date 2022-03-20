package ThreeAdvanced.Db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("");
    }
}
