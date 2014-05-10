package org.mdo.rpg.tools.insmv.rest;

import com.google.common.collect.Iterables;
import org.mdo.rpg.tools.insmv.domain.common.TranslationItem;
import org.mdo.rpg.tools.insmv.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 04/05/14
 */
@Controller
@RequestMapping(value = "/rest/resources")
public class ResourcesRest {

    @Autowired
    private TranslationRepository translationRepository;

    /**
     * Returns translation in function of the category.
     * @param category categories
     * @return translations
     */
    @RequestMapping(value = "i18n/{category}")
    public Map<Locale, TranslationItem> getTranslationsItems(String category) {
        List<TranslationItem> translations = translationRepository.findByCategoryOrderByLocale(category);
        Map<Locale, TranslationItem> maps = new HashMap<Locale, TranslationItem>();
        for (TranslationItem translation : translations) {
            if (translation.getLocale() != null) {
            }
        }
        return maps;
    }
}
