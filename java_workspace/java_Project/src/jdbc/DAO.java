package jdbc;

import java.util.List;

public interface DAO {

	int insert(Product product);

	List<Product> selectList();

	Product selectOne(int pno);

	int update(Product product);

	int delete(int pno);

}
