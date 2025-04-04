package com.patrickbehenck.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    // GET -- Send a request to show Missions
    @GetMapping("/list")
    public String listMissions() {
        return "Mission listed Successfully";
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
