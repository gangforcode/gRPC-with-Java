package service;

import gfc.proto.GreetingServiceGrpc;
import gfc.proto.HelloRequest;
import gfc.proto.HelloResponse;
import io.grpc.stub.StreamObserver;

public class greetingService extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        HelloResponse response = HelloResponse.newBuilder() .setMessage("Hello " + request.getName())
                .build(); responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
