package week3.lab;

import java.sql.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/oop_lab";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "paradigma1230";

    private Connection connection = null;

    public DbConnect() {
        try {
            this.connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAll () throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks");

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    public void getById (int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks WHERE id = ?");

        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }

    }
}
