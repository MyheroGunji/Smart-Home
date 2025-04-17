Smart Home Project - Structure Overview

This project is a gRPC-based Smart Home simulation that includes modular services for climate control, security cameras, and smart lighting. Below is the overall structure:

・client-service/
This module contains the client-side application used to communicate with the gRPC services.
client-service/
└── src/
    └── main/
        └── java/
            ├── config/
            │   └── StubConfig.java         # Configuration for gRPC stubs
            └── controller/
                └── ClientServiceApplication.java  # Entry point for the client GUI

・grpc-service/
This module implements all gRPC-based services for the Smart Home system.
grpc-service/
└── src/
    └── main/
        └── java/
            └── service/
                ├── ClimateControlService.java     # Handles climate control functionalities
                ├── SmartCameraService.java        # Handles camera monitoring and alerts
                ├── SmartLighting.java             # Controls lighting features
                └── GrpcServiceApplication.java    # Main entry point for the server

・proto/
This module contains the .proto definitions for each service. These files are used to generate Java gRPC classes.
proto/
└── src/
    └── main/
        └── proto/
            ├── climateControlService.proto        # Proto for temperature/humidity control
            ├── SmartCameraService.proto           # Proto for camera-related streaming
            └── SmartLighting.proto                # Proto for lighting operations

・target/generated-sources/protobuf/
Auto-generated files from the .proto definitions are stored here after compilation.
target/generated-sources/protobuf/
├── grpc-java/
│   └── generated.grpc/
│       ├── climateControlService/
│       │   └── ClimateControlServiceGrpc.java     # gRPC stub and base classes
│       ├── SmartCameraService/
│       │   └── SmartCameraServiceGrpc.java
│       └── SmartLighting/
│           └── SmartLightingGrpc.java
└── java/
    └── generated.grpc/
        ├── climateControlService/                # Message classes
        ├── SmartCameraService/
        └── SmartLighting/
        
・pom.xml
The Maven configuration file for managing project dependencies and plugin setup.



