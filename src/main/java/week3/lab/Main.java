package week3.lab;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

//        DataStructures data = new DataStructures();
//
//        List<TaskItem> tasks = data.getByStatus(Status.TO_DO);
//
//        tasks.stream().forEach(task -> System.out.println(task.getTaskDescription()));

        DbConnect db = new DbConnect();

        try {
            db.getById(2);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
