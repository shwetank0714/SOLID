package design_patterns.astract_factory.cloud_store;

import design_patterns.astract_factory.cloud_store.client.CloudApp;
import design_patterns.astract_factory.cloud_store.factory.AwsFactory;
import design_patterns.astract_factory.cloud_store.factory.AzureFactory;
import design_patterns.astract_factory.cloud_store.factory.CloudStorageFactory;
import design_patterns.astract_factory.cloud_store.factory.GcpFactory;

import java.util.ArrayList;
import java.util.Collection;

public class CloudStorageExecutor {

    public static void main(String[] args) {

        CloudStorageFactory myGcpFactory = new GcpFactory();
        CloudStorageFactory myAwsFactory = new AwsFactory();
        CloudStorageFactory myAzureFactory = new AzureFactory();

        CloudApp myAwsApp = new CloudApp(myAwsFactory);
        CloudApp myGcpApp = new CloudApp(myGcpFactory);
        CloudApp myAzureApp = new CloudApp(myAzureFactory);

        Collection<CloudApp> list = new ArrayList<>();
        list.add(myAwsApp);
        list.add(myAzureApp);
        list.add(myGcpApp);


        for(CloudApp app: list){
            app.uploadFile();
        }
    }
}
