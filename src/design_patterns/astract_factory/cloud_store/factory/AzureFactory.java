package design_patterns.astract_factory.cloud_store.factory;

import design_patterns.astract_factory.cloud_store.storage.AzureStorage;
import design_patterns.astract_factory.cloud_store.storage.CloudStorage;

public class AzureFactory implements CloudStorageFactory{
    @Override
    public CloudStorage createStorage() {
        return new AzureStorage();
    }
}
