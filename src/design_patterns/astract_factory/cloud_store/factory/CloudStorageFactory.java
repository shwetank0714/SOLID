package design_patterns.astract_factory.cloud_store.factory;

import design_patterns.astract_factory.cloud_store.storage.CloudStorage;

public interface CloudStorageFactory {
    CloudStorage createStorage();
}
