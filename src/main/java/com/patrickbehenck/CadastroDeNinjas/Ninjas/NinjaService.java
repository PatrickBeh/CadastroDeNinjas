package com.patrickbehenck.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Show all Ninjas
    public List<NinjaModel> showAllNinja() {
        return ninjaRepository.findAll();
    }

    // Show Ninjas By ID
    public Optional<NinjaModel> showNinjaById(Long id) {
        return ninjaRepository.findById(id);
    }
    /*    A Second option to write showNinjaById
     * public NinjaModel showNinjaById(Long id) {
     *  Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
     *  return ninjaById.orElse(null);
     *}
     * */

    // Create a new Ninja
    public NinjaModel createNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // Delete a Ninja - Must be a VOID method
    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
    }
}
