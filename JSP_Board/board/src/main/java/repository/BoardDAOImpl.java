package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import orm.DatabaseBuilder;

public class BoardDAOImpl implements BoardDAO {
	private static final Logger log = LoggerFactory.getLogger(BoardDAOImpl.class);
	//DB와 연결
	private SqlSession sql;
	private final String NS = "BoardMapper."; //namespace설정
	
	public BoardDAOImpl() {
		new DatabaseBuilder(); //orm -> db연결 클래스 객체 생성
		sql = DatabaseBuilder.getFactory().openSession();
	}

	//각 요청 오버라이딩
	@Override
	public int insert(BoardVO bvo) {
		log.info("insert check 3");
		int isOk = sql.insert(NS+"add", bvo); //"BoardMapper.add"
		if(isOk > 0) {
			sql.commit(); // 실제 값이 1개가 완료가 되었다면 실제 commit
		}
		return isOk;
	}
	
	

	@Override
	public List<BoardVO> selectList() {
		log.info("list check 3");
		return sql.selectList(NS+"list");
	}

	@Override
	public BoardVO selectOne(int bno) {
		log.info("detail check 3");
		return sql.selectOne(NS+"detail",bno);
	}

	@Override
	public int update(BoardVO bvo) {
		log.info("update check 3");
		int isOk = sql.update(NS+"mod",bvo);
		if(isOk >0) sql.commit();
		return isOk;
	}

	@Override
	public int delete(int bno) {
		log.info("delete check 3");
		int isOk = sql.delete(NS+"del", bno);
		if(isOk >0) sql.commit();
		return isOk;
	}
	
	
}
