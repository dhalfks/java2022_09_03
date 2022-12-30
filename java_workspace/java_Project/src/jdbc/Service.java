package jdbc;

import java.util.List;

public interface Service {

	int register(Product product);

	List<Product> list();

	Product detail(int pno);

	int edit(Product product);

	int remove(int pno);

}
