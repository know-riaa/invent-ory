package com.gobeauty.inventory.repository;

import com.gobeauty.inventory.model.Item;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, String> {
    public List<Item> findByBrand(String name);
}
