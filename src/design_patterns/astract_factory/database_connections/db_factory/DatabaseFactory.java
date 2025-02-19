package design_patterns.astract_factory.database_connections.db_factory;

import design_patterns.astract_factory.database_connections.db_model.Database;

public interface DatabaseFactory {
    Database getDatabase();
}
