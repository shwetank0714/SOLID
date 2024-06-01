package design_patterns.astract_factory.cloud_store.storage;

public class AzureStorage implements CloudStorage {
    @Override
    public void uploadFile() {
        System.out.println("file uploaded in azure store");
    }

    @Override
    public void deleteFile() {
        System.out.println("file deleted in azure store");
    }

    @Override
    public void readFile() {
        System.out.println("reading file from azure store");
    }
}
