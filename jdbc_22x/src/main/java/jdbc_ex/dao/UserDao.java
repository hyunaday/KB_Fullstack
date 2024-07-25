package jdbc_ex.dao;

public interface UserDao {
    // 회원 등록 (CRUD 중 C)
  int create(UserVO user) throws SQLException;
    // 모든 사용자 목록 조회 (CRUD 중 R)
    List<UserVO> findAll() throws SQLException;
    // 특정 사용자 정보 조회 (CRUD 중 R)
    // 존재하지 않는 경우 빈 Optional 객체 반환
    Optional<UserVO> findById(int id) throws SQLException;

    // 사용자 정보 수정 (CRUD 중 U)
    int update(UserVO user) throws SQLException;

    // 특정 사용자 삭제 (CRUD 중 D)
    int delete(int id) throws SQLException;
}
