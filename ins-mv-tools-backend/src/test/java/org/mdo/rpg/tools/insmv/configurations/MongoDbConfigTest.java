package org.mdo.rpg.tools.insmv.configurations;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 01/05/14
 */
@Profile("test")
@Configuration
public class MongoDbConfigTest extends MongoDdConfig {

    @Override
    public Mongo mongo() throws Exception {
        return new Fongo(getDatabaseName() + " test server").getMongo();
    }
}
