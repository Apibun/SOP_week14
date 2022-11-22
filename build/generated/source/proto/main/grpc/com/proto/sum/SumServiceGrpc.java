package com.proto.sum;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Sum/sum.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SumServiceGrpc {

  private SumServiceGrpc() {}

  public static final String SERVICE_NAME = "sum.SumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.proto.sum.SumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumRequest, com.proto.sum.SumResponse> getSumMethod;
    if ((getSumMethod = SumServiceGrpc.getSumMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getSumMethod = SumServiceGrpc.getSumMethod) == null) {
          SumServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("Sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceStub>() {
        @java.lang.Override
        public SumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceStub(channel, callOptions);
        }
      };
    return SumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub>() {
        @java.lang.Override
        public SumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceBlockingStub(channel, callOptions);
        }
      };
    return SumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub>() {
        @java.lang.Override
        public SumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceFutureStub(channel, callOptions);
        }
      };
    return SumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SumServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void sum(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.sum.SumRequest,
                com.proto.sum.SumResponse>(
                  this, METHODID_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class SumServiceStub extends io.grpc.stub.AbstractAsyncStub<SumServiceStub> {
    private SumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void sum(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SumServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SumServiceBlockingStub> {
    private SumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.proto.sum.SumResponse sum(com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SumServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SumServiceFutureStub> {
    private SumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.sum.SumResponse> sum(
        com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.sum.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.sum.SumOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SumService");
    }
  }

  private static final class SumServiceFileDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier {
    SumServiceFileDescriptorSupplier() {}
  }

  private static final class SumServiceMethodDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SumServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
