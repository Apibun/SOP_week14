package SumServer;

import com.proto.sum.*;
import io.grpc.stub.StreamObserver;
public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase{
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse>
            responseObserver) {
// Block 1: extract the data required
        Sum sum = request.getSum();
        int first_num = (int) sum.getFirstNum();
        int second_num = (int) sum.getSecondNum();
// Block 2: create the response message
        int result = first_num + second_num;
        SumResponse response = SumResponse.newBuilder()
                .setResult(String.valueOf(result))
                .build();
// Block 3: send the response
        String Response = "Server Output : " + first_num + " "+ second_num + " = " +(first_num+second_num);
        System.out.println(Response);
        responseObserver.onNext(response);
// Block 4: complete the RPC call
        responseObserver.onCompleted();
    }
}
