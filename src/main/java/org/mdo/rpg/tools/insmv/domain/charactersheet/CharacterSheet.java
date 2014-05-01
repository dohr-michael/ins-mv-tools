package org.mdo.rpg.tools.insmv.domain.charactersheet;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 21/04/14
 */
public class CharacterSheet {
    private String identity;
    private String superior;
    private BigInteger range;
    private List<RangePower> rangePowers;
    private Map<CharacteristicEnum, BigDecimal> characteristics;
    private List<Skill> mainSkills;
    private List<Skill> secondarySkills;
    private List<Skill> exoticSkills;
}
