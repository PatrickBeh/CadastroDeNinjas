package com.patrickbehenck.CadastroDeNinjas.Missoes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // Show Missions by Id
    public Optional<MissoesModel> showMissionById(Long id) {
        return missoesRepository.findById(id);
    }

    // Create a new mission
    public MissoesModel createMission(MissoesModel mission) {
        return missoesRepository.save(mission);
    }

    // Delete a mission by Id
    public void deleteMissionById(Long id) {
        missoesRepository.deleteById(id);
    }
}
