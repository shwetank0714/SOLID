package design_patterns.astract_factory.cloud_store.storage;

public class S3Storage implements CloudStorage {
    @Override
    public void uploadFile() {
        System.out.println("file uploaded in s3 store");
    }

    @Override
    public void deleteFile() {
        System.out.println("file deleted in s3 store");
    }

    @Override
    public void readFile() {
        System.out.println("reading file from s3 store");
    }
}
