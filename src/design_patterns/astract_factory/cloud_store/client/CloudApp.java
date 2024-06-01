package design_patterns.astract_factory.cloud_store.client;

import design_patterns.astract_factory.cloud_store.factory.CloudStorageFactory;
import design_patterns.astract_factory.cloud_store.storage.CloudStorage;

public class CloudApp {
    private final CloudStorage storage;

    public CloudApp(CloudStorageFactory factory){
        this.storage = factory.createStorage();
    }

    public void uploadFile(){
        this.storage.uploadFile();
    }

    public CloudStorage getStorage() {
        return this.storage;
    }
}
