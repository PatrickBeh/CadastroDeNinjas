package com.patrickbehenck.CadastroDeNinjas.Missoes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Show all Missions
    public List<MissoesModel> showAllMissions() {
        return missoesRepository.findAll();
    }
}
