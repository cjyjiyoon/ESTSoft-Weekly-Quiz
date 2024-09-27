package weeklyquiz3;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/*
드라이버 로딩
Connection 객체 생성
(Prepared)Statement 객체 생성
Query 실행
ResultSet 객체로부터 데이터 조회
ResultSet 객체 Close
Statement 객체 Close
Connection 객체 Close

코드상 자바와 db의 connection을 맺어줘야 함(자바 코드상에서 접속할 수 있음, jdbc api 찾아보고 하면 잘 될듯)
student테이블에 있는 전체 학생들 중 30대 학생들만 출력하기>이걸 자바 코드로 작성
메인 메소드 하나만 작성을 해서 db커넥션 맺어주고
질의해주고
응답받고
출력
그다음 객체자원 닫기

hint
- java.sql.* 관련 클래스 import   (=JDBC API 패키지 임포트)
- Mysql 연결 (Connection)
- DB 질의 응답을 위한 관련 객체 생성(Statement 혹은 PreparedStatement)
- 질의결과를 저장 (ResultSet 객체)
- 객체 자원 닫기 (close() 혹은 다른 방법으로)
 */
// https://wisdom-and-record.tistory.com/61
// 연결까지만 함
public class JDBCQuiz {
    public static void main(String[] args) {
        // DB Driver
        String dbDriver = "com.mysql.jdbc.Driver";

        //DB Url
        String dbUrl="jdbc:mysql://localhost:3306/ormi";

        // DB ID/PW
        String dbUser="root";
        String dbPassword="0000";

        // Connection
        Connection dbConnection = null;


        //  DB 질의 응답을 위한 관련 객체 생성(Statement 혹은 PreparedStatement)

        // 질의결과를 저장 (ResultSet 객체)

        // 객체 자원 닫기 (close() 혹은 다른 방법으로)
    }
}
