package org.mdo.rpg.tools.insmv.repository;

import org.mdo.rpg.tools.insmv.domain.common.TranslationItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 30/04/14
 */
@Repository
public interface TranslationRepository extends MongoRepository<TranslationItem, String> {

    /**
     * Find translations by category and ordered by locale.
     *
     * @param category the category
     * @return the list of translation
     */
    public List<TranslationItem> findByCategoryOrderByLocale(String category);

    /**
     * Find translations by category and locale.
     *
     * @param category the category
     * @param locale the locale
     * @return the list of translation
     */
    public List<TranslationItem> findByCategoryAndLocale(String category, Locale locale);
}
