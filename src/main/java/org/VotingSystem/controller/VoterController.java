package org.VotingSystem.controller;

import org.VotingSystem.model.Voters;
import org.VotingSystem.repository.VotersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoterController {
    @Autowired
    private VotersRepository votersRepository;

    public boolean findVoter(String epicId, String dob) {
        Voters v=votersRepository.findByEpicIdAndDob(epicId, dob);
        if(v==null)
            return false;
        return true;
    }

    public Voters findByEpicId(String epicId) {
        return votersRepository.findByEpicId(epicId);
    }

    public void updateVoter(Voters voter) {
        votersRepository.save(voter);
    }
}
