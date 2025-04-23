package com.patrickbehenck.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/missions")
public class MissoesController {
    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET -- Send a request to show Missions
    @GetMapping("/showAllMissions")
    public List<MissoesModel> showAllMissions() {
        return missoesService.showAllMissions();
    }

    @GetMapping("/MissionById/{id}")
    public Optional<MissoesModel> missionById(@PathVariable Long id) {
        return missoesService.showMissionById(id);
    }
    // POST -- Send a request to create Missions
    @PostMapping("/create")
    public MissoesModel createMission(@RequestBody MissoesModel mission) {
        return missoesService.createMission(mission);
    }
    // PUT -- Send a request to update Missions
    @PutMapping("/update")
    public String updateMission() {
        return "Mission Updated Successfully";
    }
    // DELETE -- Send a request to delete Missions
    @DeleteMapping("/delete/{id}")
    public void deleteMission(@PathVariable Long id) {
        missoesService.deleteMissionById(id);
    }



}
