package design_patterns.astract_factory.cloud_store.storage;

public interface CloudStorage {
    void uploadFile();
    void deleteFile();
    void readFile();
}
