package design_patterns.astract_factory.cloud_store.factory;

import design_patterns.astract_factory.cloud_store.storage.CloudStorage;
import design_patterns.astract_factory.cloud_store.storage.GcpStorage;

public class GcpFactory implements CloudStorageFactory{
    @Override
    public CloudStorage createStorage() {
        return new GcpStorage();
    }
}
