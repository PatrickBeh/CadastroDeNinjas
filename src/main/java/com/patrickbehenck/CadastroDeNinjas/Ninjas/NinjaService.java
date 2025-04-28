package com.patrickbehenck.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
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
    public NinjaDTO createNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    // Delete a Ninja - Must be a VOID method
    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Update ninja
    public NinjaModel updateNinja(Long id, NinjaModel updatedNinja) {
        if (ninjaRepository.existsById(id)) {
            updatedNinja.setId(id);
            return  ninjaRepository.save(updatedNinja);
        }

        return null;
    }
}
