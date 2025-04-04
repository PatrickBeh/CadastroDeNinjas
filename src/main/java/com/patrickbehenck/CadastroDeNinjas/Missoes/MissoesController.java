package com.patrickbehenck.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    // POST -- Send a request to create Missions
    @PostMapping("/create")
    public String createMission() {
        return "Mission Created Successfully";
    }
    // PUT -- Send a request to update Missions
    @PutMapping("/update")
    public String updateMission() {
        return "Mission Updated Successfully";
    }
    // DELETE -- Send a request to delete Missions
    @DeleteMapping("/delete")
    public String deleteMission() {
        return "Mission Deleted Successfully";
    }


}
