package com.example.conifg;

import com.apollographql.federation.graphqljava.Federation;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FederationConfig {

    @Bean
    public GraphQLSchema federatedSchema(GraphQLSchema graphQLSchema) {
        return Federation.transform(graphQLSchema)
                .fetchEntities(env -> {
                    // Handle _entities resolution
                    return List.of(); // your entity resolution logic
                })
                .resolveEntityType(env -> {
                    // Return entity GraphQL object type
                    return null;
                })
                .build();
    }
}
