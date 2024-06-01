package design_patterns.astract_factory.cloud_store.factory;

import design_patterns.astract_factory.cloud_store.storage.CloudStorage;
import design_patterns.astract_factory.cloud_store.storage.S3Storage;

public class AwsFactory implements CloudStorageFactory{
    @Override
    public CloudStorage createStorage() {
        return new S3Storage();
    }
}
