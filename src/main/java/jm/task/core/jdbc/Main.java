package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

        UserServiceImpl userServiceImpl = new UserServiceImpl();

        userServiceImpl.createUsersTable();

        userServiceImpl.saveUser("Karibocheck", "Gribocheck", (byte) 25);
        userServiceImpl.saveUser("Grib", "Karib", (byte) 100);
        userServiceImpl.saveUser("Ivan", "Soldatov", (byte) 23);
        userServiceImpl.saveUser("Bibizyana", "Nastoyashaya", (byte) 25);

        userServiceImpl.getAllUsers();

        userServiceImpl.cleanUsersTable();

        userServiceImpl.dropUsersTable();

    }
}
