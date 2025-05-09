package com.patrickbehenck.CadastroDeNinjas.Ninjas;
import org.apache.coyote.Response;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO newNinja = ninjaService.createNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Created Ninja Successfully: " + newNinja.getNome() + " ID: " + newNinja.getId());
    }

    @GetMapping("/showAllNinja")
    public ResponseEntity<List<NinjaDTO>> showAllNinja() {
        List<NinjaDTO> ninjaList = ninjaService.showAllNinja();
        return ResponseEntity.ok(ninjaList);
    }

    // Show Ninja by ID (Read)
//    @GetMapping("/showNinja/{id}")
//    public Optional<NinjaModel> showNinjaById(@PathVariable Long id) {
//        return ninjaService.showNinjaById(id);
//    }
    // Second Option to write showNinjaById
    @GetMapping("/showNinja/{id}")
    public ResponseEntity<String> showNinjaById(@PathVariable Long id) {
        NinjaDTO ninja = ninjaService.showNinjaById(id);
        if (ninja != null) {
            return ResponseEntity.ok("Ninja founded " + ninja.getNome());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja with ID " + id + " not found!");
        }
    }

    // Alter Ninja data (Update)
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateNinjaById(@PathVariable Long id, @RequestBody NinjaDTO updatedNinja) {
        if (ninjaService.showNinjaById(id) != null) {
            ninjaService.updateNinja(id, updatedNinja);
            return ResponseEntity.ok("Ninja with ID " + id + " updated successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja with ID " + id + " not found!");
        }
    }

    // Delete Ninja (Delete)
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteNinjaById(@PathVariable Long id) {
        if (ninjaService.showNinjaById(id) != null) {
            ninjaService.deleteNinjaById(id);
            return ResponseEntity.ok("Ninja with ID " +  id + " deleted successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja with ID " + id + " not found!");
        }

    }
}
