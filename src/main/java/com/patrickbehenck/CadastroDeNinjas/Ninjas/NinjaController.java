package com.patrickbehenck.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "This is my first message in this route!";
    }

// CRUD
    // Add Ninja (Create)
    @PostMapping("/create")
    public String createNinja() {
        return "Created a new Ninja";
    }

    // Show All Ninjas (Read)
    @GetMapping("/showAllNinja")
    public List<NinjaModel> showAllNinja() {
        return ninjaService.showAllNinja();
    }

    // Show Ninja by ID (Read)
    @GetMapping("/showNinja/{id}")
    public Optional<NinjaModel> showNinjaById(@PathVariable Long id) {
        return ninjaService.showNinjaById(id);
    }

    // Alter Ninja data (Update)
    @PutMapping("/updateID")
    public String updateNinjaById() {
        return "Ninja Updated by ID";
    }

    // Delete Ninja (Delete)
    @DeleteMapping("/deleteID")
    public String deleteNinjaById() {
        return "Ninja Deleted By Id";
    }
}
