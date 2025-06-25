package com.gobeauty.inventory.service;

import com.gobeauty.inventory.model.Item;
import com.gobeauty.inventory.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    private final ItemRepository itemRepository;

    public MainServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> findByBrand(String name) {
        List<Item> items = itemRepository.findByBrand(name);

        return items;
    }
}

