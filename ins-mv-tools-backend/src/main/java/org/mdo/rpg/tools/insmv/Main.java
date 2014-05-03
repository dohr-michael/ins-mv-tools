package org.mdo.rpg.tools.insmv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 18/04/14
 */
@ComponentScan
@EnableAutoConfiguration
public class Main {

    /**
     * Main class.
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
