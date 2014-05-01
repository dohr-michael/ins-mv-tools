package org.mdo.rpg.tools.insmv.services.impl;

import org.mdo.rpg.tools.insmv.domain.common.TranslationItem;
import org.mdo.rpg.tools.insmv.repository.TranslationRepository;
import org.mdo.rpg.tools.insmv.services.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.List;
import java.util.Locale;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 01/05/14
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Inject
    private TranslationRepository translationRepository;

    @Override
    public List<TranslationItem> getTranslations(String domain, Locale locale) {
        return translationRepository.findByCategoryAndLocale(domain, locale);
    }
}
