package com.mildmelon.design_patterns.structural.composite;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class CompositeTest {

    @Test
    public void menuTest() {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenuItem = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenuItem);

        log.info(mainMenu.toString());

        mainMenu.remove(claimsSubMenu);

        log.info(mainMenu.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void featureNotImplementedTest() {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);
        
        MenuItem aboutMenuItem = new MenuItem("About", "/about");
        safetyMenuItem.add(aboutMenuItem);
    }

}
