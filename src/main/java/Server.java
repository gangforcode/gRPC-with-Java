import io.grpc.ServerBuilder;
import service.greetingService;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server = ServerBuilder.forPort(8080)
                .addService(new greetingService()) .
                build() .start();
        System.out.println("Server started, listening on " + server.getPort()); server.awaitTermination();
    }
}
