package org.mdo.rpg.tools.insmv.services;

import org.mdo.rpg.tools.insmv.domain.common.TranslationItem;

import java.util.List;
import java.util.Locale;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 01/05/14
 */
public interface ResourcesService {

    /**
     * Returns all translations for a specifics domain and locale.
     *
     * @param domain the domain
     * @param locale the locale
     * @return the list of translation
     */
    public List<TranslationItem> getTranslations(String domain, Locale locale);
}
