package org.example.itmpj3212;


import org.example.itmpj3212.config.AppConfig;
import org.example.itmpj3212.model.Car;
import org.example.itmpj3212.model.User;
import org.example.itmpj3212.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        for (int i = 0; i < 4; i++) {
            User user = new User("User" + (i + 1), "Lastname" + (i + 1), "user" + (i + 1) + "@mail.ru");
            user.setCar(new Car("car" + (i + 1), 20 + i));
            userService.add(user);
        }


        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println("Car = " + user.getCar());
            System.out.println();
        }

        User someUser = userService.getUserByCar("car2", 21);
        System.out.print("Result User -> ");
        System.out.println(someUser);

        context.close();
    }
}
