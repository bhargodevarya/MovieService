package com.app.config;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
public class AppConfig {

    public MongoTemplate mongoTemplate(MongoClient mongoClient, @Value("spring.data.mongodb.database") String database) {
        return new MongoTemplate(mongoClient, database);
    }
}
