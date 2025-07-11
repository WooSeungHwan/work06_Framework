package mybatis.services.item;

import java.util.List;

import com.service.spring.domain.Item;

public interface itemDAO {
	Item getItem(String itemId) throws Exception;
	List<Item> getItemList(Item item) throws Exception;

}

