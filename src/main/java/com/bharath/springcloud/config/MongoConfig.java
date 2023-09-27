/*
 * package com.bharath.springcloud.config;
 * 
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
 * import org.springframework.data.mongodb.core.MongoClientFactoryBean; import
 * org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
 * 
 * import com.mongodb.ConnectionString; import com.mongodb.MongoClientSettings;
 * import com.mongodb.client.MongoClient; import
 * com.mongodb.client.MongoClients;
 * 
 * @Configuration
 * 
 * @EnableMongoRepositories("com.bharath.springcloud") public class MongoConfig
 * extends AbstractMongoClientConfiguration {
 * 
 * @Value("${custom.uri}") String uri;
 * 
 * @Override protected String getDatabaseName() { // TODO Auto-generated method
 * stub return "ProductApplication"; }
 * 
 * @Override public MongoClient mongoClient() { final ConnectionString
 * connectionString = new ConnectionString(uri); final MongoClientSettings
 * mongoClientSettings = MongoClientSettings.builder()
 * .applyConnectionString(connectionString) .build(); return
 * MongoClients.create(mongoClientSettings);
 * 
 * }
 * 
 * }
 */