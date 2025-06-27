package com.gobeauty.inventory.service;

import com.gobeauty.inventory.model.Item;

import java.util.List;

public interface MainService {

    List<Item> findByBrand(String name);
}