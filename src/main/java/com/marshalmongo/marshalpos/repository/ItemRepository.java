package com.marshalmongo.marshalpos.repository;

import com.marshalmongo.marshalpos.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {



    //GroceryItem findByName(String name);

    GroceryItem findFirstByName(String domain);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<GroceryItem> findAll(String category);

    public long count();

}