package com.capgemini.wardrobeproject.controllers;

import com.capgemini.wardrobeproject.models.Wardrobe;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class WardrobeController {

    private Wardrobe wardrobe = new Wardrobe();

    @GetMapping("/get")
    public Wardrobe getWardrobe() {
        return this.wardrobe;
    }

    @GetMapping("/{name}")
    public void registerWardrobe(@PathVariable String name) {
        System.out.println(name);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)            //Zelfde als PostMapping
    public void saveWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    @RequestMapping(value = "/open", method = RequestMethod.POST)           //Methode om deur te openen
    public void openWardrobe() {
        wardrobe.setOpenWardrobe(true);
    }
}


