package service;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardService {

	int register(BoardVO bvo);

	List<BoardVO> getList();

	int modify(BoardVO bvo);

	int remove(int bno);

	BoardVO getDetail(int bno);

	int getPageCnt(PagingVO pgvo);

	List<BoardVO> getListPage(PagingVO pgvo);

	List<BoardVO> getMyList(String email);

	String getFileName(int bno);

}
