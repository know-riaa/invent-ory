package com.gobeauty.inventory.controller;

import com.gobeauty.inventory.model.Item;
import com.gobeauty.inventory.repository.ItemRepository;
import com.gobeauty.inventory.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainPanel {

    private final MainService mainService;

    public MainPanel(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/search")
    public List<Item> search(@RequestParam String string){
        return mainService.findByBrand(string);
    }
}
