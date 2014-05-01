package org.mdo.rpg.tools.insmv.rest;

import org.mdo.rpg.tools.insmv.domain.wizard.creation.CharacterType;
import org.mdo.rpg.tools.insmv.domain.wizard.creation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 27/04/14
 */
@Controller
@RequestMapping(value = "/rest/wizard")
public class WizardCreationRest {

    /**
     * Returns the list of character types available for the wizard creation.
     *
     * @return the list of character type
     */
    @RequestMapping(value = "characterTypes")
    public
    @ResponseBody
    List<CharacterType> getCharacterTypes() {
        return Arrays.asList(CharacterType.values());
    }

    /**
     * Returns the profiles available for the character type (daemon or angel ...).
     *
     * @param type the character type.
     * @return the list of profile linked to the character type
     */
    @RequestMapping(value = "profiles/{type}")
    public
    @ResponseBody
    List<Profile> getProfiles(@PathVariable CharacterType type) {
        return null;
    }
}
