package com.example.casestudy.DAO;

import com.example.casestudy.DAO.connection.MyConnection;
import com.example.casestudy.model.User;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Connection connection = MyConnection.getConnection();
    private static UserDAO userDAO;
    private final String SELECT_ALL = "select * from user;";
    private final String SELECT_BY_ID = "select * from user where id = ?;";
    private final String INSERT_INTO = "insert into user(username, password, phone_number, first_name,last_name) value (?,?,?,?,?);";
    private final String UPDATE_BY_ID = "update user set username = ?,password=?,phone_number=?,first_name=?,last_name=?,money=?,register_date=? where id = ?;";

    public static UserDAO getInstance() {
        if (userDAO == null) {
            userDAO = new UserDAO();
        }
        return userDAO;
    }

    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String phone_number = resultSet.getString("phone_number");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                int money = resultSet.getInt("money");
                LocalDate register_date = resultSet.getDate("register_date").toLocalDate();
                User user = new User(id,username,password,phone_number,first_name,last_name,money,register_date);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public User findById(Long id) {
        User user = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)){
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String phone_number = resultSet.getString("phone_number");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                int money = resultSet.getInt("money");
                LocalDate register_date = resultSet.getDate("register_date").toLocalDate();
                user = new User(id,username,password,phone_number,first_name,last_name,money,register_date);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void addUser(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO)){
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getPhone_number());
            preparedStatement.setString(4, user.getFirst_name());
            preparedStatement.setString(5, user.getLast_name());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID)){
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getPhone_number());
            preparedStatement.setString(4, user.getFirst_name());
            preparedStatement.setString(5, user.getLast_name());
            preparedStatement.setInt(6, user.getMoney());
            preparedStatement.setDate(7, Date.valueOf(user.getRegister_date()));
            preparedStatement.setLong(8, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
