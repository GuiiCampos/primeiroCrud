package org.example;

import java.sql.*;

public class DatabaseOperations {
    public static void insertData(String name) {
        String sql = "INSERT INTO clients (name) VALUES (?)";

        try (Connection conn = Conect.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readeData() {
        String sql = "SELECT * FROM clients";

        try(Connection conn = Conect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("id") + " Nome: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateData(int id, String newName) {
        String sql = "UPDATE clients SET name = ? WHERE id = ?";

        try(Connection conn = Conect.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void deleteData(int id) {
        String sql = "DELETE FROM clients WHERE id = ?";

        try(Connection conn = Conect.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}