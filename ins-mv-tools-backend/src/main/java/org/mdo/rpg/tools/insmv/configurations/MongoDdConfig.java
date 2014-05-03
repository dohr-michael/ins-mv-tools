package org.mdo.rpg.tools.insmv.configurations;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * TODO Description of class.
 *
 * @author Michaël DOHR
 * @since 01/05/14
 */
@Profile("default")
@Configuration
@EnableMongoRepositories("org.mdo.rpg.tools.insmv.repository")
public class MongoDdConfig extends AbstractMongoConfiguration{

    @Value("${mongo.url}")
    private String url;

    @Value("${mongo.db}")
    private String databaseName;


    @Override
    protected String getDatabaseName() {
        return databaseName;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(new MongoClientURI(url));
    }
}
