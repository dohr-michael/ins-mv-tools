package org.mdo.rpg.tools.insmv.domain.charactersheet;

import java.math.BigDecimal;
import java.util.List;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 21/04/14
 */
public class Skill {

    public class SpecificSkill {
        private String name;
        private BigDecimal value;
    }

    private String type;
    private CharacteristicEnum associatedCharacteristic;
    private boolean isGeneric;
    private BigDecimal value;
    private List<SpecificSkill> specifics;
}
