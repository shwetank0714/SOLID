package design_patterns.astract_factory.database_connections.db_model;

public class NoSql implements Database{
    @Override
    public void create() {
        System.out.println("create using no sql");
    }

    @Override
    public void read(String key) {
        System.out.println("reading key" + key + " from no sql");
    }

    @Override
    public void update(String key) {
        System.out.println("updating key" + key + " from no sql");
    }

    @Override
    public void delete(String key) {
        System.out.println("deleting key" + key + " from no sql");
    }
}
