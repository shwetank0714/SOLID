package design_patterns.astract_factory.database_connections.db_model;

public interface Database {
    void create();
    void read(String key);
    void update(String key);
    void delete(String key);
}
