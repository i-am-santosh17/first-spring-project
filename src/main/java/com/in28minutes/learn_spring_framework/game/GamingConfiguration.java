package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole marioGame() {
        return new MarioGame();
    }

    @Bean
    public GamingConsole packMan() {
        return new PackMan();
    }

    @Bean
    public GameRunner superContraGame(GamingConsole marioGame) {
        return new GameRunner(marioGame);
    }
}
