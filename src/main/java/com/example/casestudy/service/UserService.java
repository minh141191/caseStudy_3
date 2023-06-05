package com.example.casestudy.service;

import com.example.casestudy.DAO.UserDAO;
import com.example.casestudy.model.User;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserService {
    private final UserDAO userDAO;
    private static UserService userService;

    private UserService() {
        userDAO = new UserDAO();
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public List<User> getUser() {
        return UserDAO.getInstance().findAll();
    }

    public User getById(Long id) {
        return userDAO.findById(id);
    }

    public void save(HttpServletRequest request) {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String phone_number = request.getParameter("phone_number");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        int money = Integer.parseInt(request.getParameter("money"));
        String timeString = request.getParameter("register_date");
        LocalDate register_date = LocalDate.parse(timeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        if (id != null) {
            Long idUpdate = Long.parseLong(id);
            userDAO.updateUser(new User(idUpdate, username, password, phone_number, first_name, last_name, money, register_date));
        } else {
            userDAO.addUser(new User(username, password, phone_number, first_name, last_name, money, register_date));
        }
    }
}
