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
}
