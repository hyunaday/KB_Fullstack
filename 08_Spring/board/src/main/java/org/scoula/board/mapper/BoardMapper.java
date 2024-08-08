package org.scoula.board.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.scoula.board.domain.BoardVO;

public interface BoardMapper {
    // tbl_board 테이블에서 모든 컬럼을 no 컬럼 기준으로 내림차순 정렬
//    @Select("select * from tbl_board order by no desc")
    // BoardVO 객체의 리스트를 반환
    public List<BoardVO> getList();
    // 특정 번호(no)에 해당하는 BoardVO 객체 반환
    // CRUD 중 Read에 해당
    public BoardVO get(Long no);

    // 새로운 BoardVO 게시물을 생성
    // CRUD 중 Create에 해당
    public void create(BoardVO board);

    // 기존에 있는 게시글을 업데이트(수정)
    // CRUD 중 Update에 해당
    public int update(BoardVO board);

    // 해당 no값을 가진 게시글을 삭제
    // alt + shift + enter
    public int delete(Long no);


}
