package org.mdo.rpg.tools.insmv.domain.wizard.creation;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 27/04/14
 */
public class Profile {
    private String id;
    private String codeName;
    private String descriptionCode;

    /**
     * Sets new descriptionCode.
     *
     * @param descriptionCode New value of descriptionCode.
     */
    public void setDescriptionCode(String descriptionCode) {
        this.descriptionCode = descriptionCode;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets new codeName.
     *
     * @param codeName New value of codeName.
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * Gets descriptionCode.
     *
     * @return Value of descriptionCode.
     */
    public String getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Gets codeName.
     *
     * @return Value of codeName.
     */
    public String getCodeName() {
        return codeName;
    }
}
