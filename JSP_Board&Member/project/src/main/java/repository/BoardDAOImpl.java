package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import domain.BoardVO;
import domain.PagingVO;
import orm.DatabaseBuilder;

public class BoardDAOImpl implements BoardDAO{

	private SqlSession sql;
	private final String NS = "BoardMapper.";
	private int isOk;
	public BoardDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}
	@Override
	public int insert(BoardVO bvo) {
		isOk = sql.insert(NS+"add", bvo);
		if(isOk>0)sql.commit();
		return isOk;
	}
	@Override
	public List<BoardVO> selectList() {
		// TODO Auto-generated method stub
		return sql.selectList(NS+"list");
	}
	@Override
	public int update(BoardVO bvo) {
		isOk = sql.update(NS+"mod", bvo);
		if(isOk>0)sql.commit();
		return isOk;
	}
	@Override
	public int remove(int bno) {
		isOk = sql.delete(NS+"del", bno);
		if(isOk>0)sql.commit();
		return isOk;
	}
	@Override
	public BoardVO selectOne(int bno) {
		// TODO Auto-generated method stub
		return sql.selectOne(NS+"detail",bno);
	}
	@Override
	public int updateCount(int bno) {
		isOk = sql.update(NS+"count", bno);
		if(isOk>0)sql.commit();
		return isOk;
	}
	@Override
	public int selectCount(PagingVO pgvo) {
		return sql.selectOne(NS+"cnt", pgvo);
	}
	@Override
	public List<BoardVO> selectList(PagingVO pgvo) {
		//기존 id=pagingList
		return sql.selectList(NS+"selectListBoardPaging", pgvo);
	}
	@Override
	public List<BoardVO> selectList(String email) {
		// TODO Auto-generated method stub
		return sql.selectList(NS+"myList",email);
	}
	@Override
	public String selectImageFile(int bno) {
		return sql.selectOne(NS+"imgFile", bno);
	}
	
}
