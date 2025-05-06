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

    @PostMapping("/create")
    public NinjaDTO createNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.createNinja(ninja);
    }

    @GetMapping("/showAllNinja")
    public List<NinjaDTO> showAllNinja() {
        return ninjaService.showAllNinja();
    }

    // Show Ninja by ID (Read)
//    @GetMapping("/showNinja/{id}")
//    public Optional<NinjaModel> showNinjaById(@PathVariable Long id) {
//        return ninjaService.showNinjaById(id);
//    }
    // Second Option to write showNinjaById
    @GetMapping("/showNinja/{id}")
    public NinjaDTO showNinjaById(@PathVariable Long id) {
        return ninjaService.showNinjaById(id);
    }

    // Alter Ninja data (Update)
    @PutMapping("/update/{id}")
    public NinjaDTO updateNinjaById(@PathVariable Long id, @RequestBody NinjaDTO updatedNinja) {
        return ninjaService.updateNinja(id, updatedNinja);
    }

    // Delete Ninja (Delete)
    @DeleteMapping("/delete/{id}")
    public void deleteNinjaById(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }
}
