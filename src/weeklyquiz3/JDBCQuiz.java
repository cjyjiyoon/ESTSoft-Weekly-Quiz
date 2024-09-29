package weeklyquiz3;

import java.sql.*;
import java.sql.Connection;

public class JDBCQuiz {
    public static void main(String[] args) throws SQLException {
        String sqlstr = "select * from students where age between 30 and 39";

        // DB Driver
        String dbDriver = "com.mysql.jdbc.Driver";

        //DB Url
        String dbUrl = "jdbc:mysql://localhost:3306/test_db";

        // DB ID/PW
        String dbUser = "root";
        String dbPassword = "0000";

        // Connection
        Connection dbConnection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

        //  DB 질의 응답을 위한 관련 객체 생성(Statement 혹은 PreparedStatement)
        PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlstr);

        // 질의결과를 저장 (ResultSet 객체)
        ResultSet resultSet = preparedStatement.executeQuery();

        // 결과 출력
        while (resultSet.next()) {
            System.out.println("이름 : " + resultSet.getString("name") + ", 나이 : " + resultSet.getInt("age") + ", 주소 : " + resultSet.getString("address"));
        }

        // 객체 자원 닫기 (close() 혹은 다른 방법으로)
        resultSet.close();
        preparedStatement.close();
        dbConnection.close();

    }
}
