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
    public NinjaDTO createNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.createNinja(ninja);
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
    /* Second Option to write showNinjaById
    * @GetMapping("/showNinja/{id}")
    * public NinjaModel showNinjaById(@PathVariable Long id) {
    *   return ninjaService.showNinjaById(id);
    * }
    * */

    // Alter Ninja data (Update)
    @PutMapping("/update/{id}")
    public NinjaModel updateNinjaById(@PathVariable Long id, @RequestBody NinjaModel updatedNinja) {
        return ninjaService.updateNinja(id, updatedNinja);
    }

    // Delete Ninja (Delete)
    @DeleteMapping("/delete/{id}")
    public void deleteNinjaById(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }
}
