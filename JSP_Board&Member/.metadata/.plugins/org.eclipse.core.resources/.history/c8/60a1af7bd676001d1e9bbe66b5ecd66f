package repository;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> selectList();

	int update(BoardVO bvo);

	int remove(int bno);

	BoardVO selectOne(int bno);

	int updateCount(int bno);

	int selectCount();

	List<BoardVO> selectList(PagingVO pgvo);

	List<BoardVO> selectList(String email);

	String selectImageFile(int bno);

}
