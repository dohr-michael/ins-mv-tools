package org.mdo.rpg.tools.insmv.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mdo.rpg.tools.insmv.Main;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 01/05/14
 */
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Main.class}, loader = SpringApplicationContextLoader.class)
public class TranslationRepositoryTest {

    @Inject
    private TranslationRepository translationRepository;

    @Test
    public void basicTest() {
        assertEquals(0, translationRepository.count());
    }
}
