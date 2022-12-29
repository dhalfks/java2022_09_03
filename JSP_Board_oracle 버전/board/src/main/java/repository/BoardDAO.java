package repository;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> selectList();

	BoardVO selectOne(int bno);

	int update(BoardVO bvo);

	int delete(int bno);

	int count();

	List<BoardVO> selectList(PagingVO pgvo);

	int updateCount(int bno);

}
