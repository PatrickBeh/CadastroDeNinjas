package com.patrickbehenck.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
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
    @GetMapping("/list")
    public String showAllNinja() {
        return "Show all Ninjas";
    }

    // Show Ninja by ID (Read)
    @GetMapping("/listID")
    public String showAllNinjaById() {
        return "Show all Ninjas by ID";
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
