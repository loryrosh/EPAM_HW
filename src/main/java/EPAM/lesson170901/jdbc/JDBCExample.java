package EPAM.lesson170901.jdbc;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/test?useLegacyDatetimeCode=false&serverTimezone=America/New_York",
                        "root", "526526");
        System.out.println(conn);

        Statement st = conn.createStatement();
        printUsers(st);

        st.execute("insert into test values (3)");
        printUsers(st);
    }

    private static void printUsers(Statement st) throws SQLException {
        ResultSet resSet = st.executeQuery("select * from test");
        System.out.println(resSet);

        while (resSet.next()) {
            System.out.println(resSet.getInt(1));
        }
    }
}
