package design_patterns.astract_factory.database_connections.db_factory;

import design_patterns.astract_factory.database_connections.db_model.Database;
import design_patterns.astract_factory.database_connections.db_model.MySql;

public class MySqlFactory implements DatabaseFactory{
    @Override
    public Database getDatabase() {
        return new MySql();
    }
}
