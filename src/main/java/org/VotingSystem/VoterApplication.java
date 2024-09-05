package org.VotingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class VoterApplication {
    public static void main(String[] args) {
        SpringApplication.run(VoterApplication.class, args);

        System.out.println("Voting System Started");
    }
}
