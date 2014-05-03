package org.mdo.rpg.tools.insmv.domain.common;

import org.springframework.data.annotation.Id;

import java.util.Locale;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 30/04/14
 */
public class TranslationItem {

    @Id
    private String id;
    private String category;
    private String code;
    private Locale locale;
    private String translation;


    /**
     * Sets new category.
     *
     * @param category New value of category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets translation.
     *
     * @return Value of translation.
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Sets new code.
     *
     * @param code New value of code.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets locale.
     *
     * @return Value of locale.
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Sets new translation.
     *
     * @param translation New value of translation.
     */
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    /**
     * Gets code.
     *
     * @return Value of code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets category.
     *
     * @return Value of category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets new locale.
     *
     * @param locale New value of locale.
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
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
     * Gets id.
     *
     * @return Value of id.
     */
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TranslationItem{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", code='" + code + '\'' +
                ", locale=" + locale +
                ", translation='" + translation + '\'' +
                '}';
    }
}
