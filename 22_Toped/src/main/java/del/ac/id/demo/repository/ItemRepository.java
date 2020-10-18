package del.ac.id.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import del.ac.id.demo.model.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>{

}
