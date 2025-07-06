package com.gobeauty.inventory.controller;

import com.gobeauty.inventory.model.Item;
import com.gobeauty.inventory.repository.ItemRepository;
import com.gobeauty.inventory.service.MainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainPanel {

    private final MainService mainService;

    public MainPanel(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/search/{string}")
    public List<Item> search(@PathVariable String string){
        return mainService.findByBrand(string);
    }
}
