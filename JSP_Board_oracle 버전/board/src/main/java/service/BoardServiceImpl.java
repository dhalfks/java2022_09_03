package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import domain.PagingVO;
import repository.BoardDAO;
import repository.BoardDAOImpl;

public class BoardServiceImpl implements BoardService {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	private BoardDAO bdao;  //repository -> interface로 생성
	
	public BoardServiceImpl() {
		bdao = new BoardDAOImpl(); //repository -> class로 생성
	}

	@Override
	public int register(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("insert check 2");
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		log.info("list check 2");
		
		return bdao.selectList();
	}

	@Override
	public BoardVO getDetail(int bno) {
		// TODO Auto-generated method stub
		log.info("detail check 2");
		int isOk = bdao.updateCount(bno);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return (isOk > 0) ? bdao.selectOne(bno) : null;
	}

	@Override
	public int modify(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("modify check 2");
		return bdao.update(bvo);
	}

	@Override
	public int remove(int bno) {
		log.info("remove check 2");
		return bdao.delete(bno);
	}

	@Override
	public int pageCnt() {
		log.info("paging check2");
		return bdao.count();
	}

	@Override
	public List<BoardVO> getListPage(PagingVO pgvo) {
		log.info("paging-2 check2");
		return bdao.selectList(pgvo);
	}

	
}
