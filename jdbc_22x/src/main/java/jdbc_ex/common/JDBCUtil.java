package jdbc_ex.common;

public class JDBCUtil {
    static Connection conn = null;
    // 정적 초기화 블록을 사용해서 JDBC 드라이버를 로드하고 데이터베이스 연결 설정
    static {
        try {
            // Properties 객체를 생성하고 application.properties 파일 로드

            // 프로퍼티 파일에서 드라이버, URL, 사용자 ID, 비밀번호 가져옴
            String driver = prop.getProperty("driver");


            // MySQL JDBC 드라이버 로드

            // DriverManger를 사용해서 데이터베이스 연결 객체 생성


        } catch (Exception e) {
            // 예외 발생 시 스택 트레이스를 출력
            e.printStackTrace();
        }
    }

    // 데이터베이스 연결 객체를 반환하는 메소드
    public static Connection getConnection() {
        return conn;
    }

    // 데이터베이스 연결을 닫는 메소드
    public static void close() {
        try {


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
