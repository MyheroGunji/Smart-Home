# Smart Home Project - Structure Overview

## Author: **Mahiro Gunji** 

This project is a gRPC-based Smart Home simulation that includes modular services for:

-  Climate Control  
-  Smart Camera Monitoring  
-  Smart Lighting  

Below is the overall structure:

---

## 📁 `client-service/`

Client-side application that communicates with the gRPC server.

```
client-service/
├── src/
│   └── main/
│       └── java/
│           ├── config/
│               └── StubConfig.java  # Configuration for gRPC stubs
│               └── SecurityConfig.java               
│           ├── controller/
│               └── ClimateController
│           ├── security/                   
│           │   └── ApiKeyFilter.java 
│           ├── ClientServiceApplication.java  # Entry point for the client GUI
│           └── gui/                
│               ├── ClimateControlClientGUI.java
│               ├── SmartLightingClientGUI.java
│               └── SecurityCameraClientGUI.java
└── pom.xml

```

---

## 📁 `grpc-service/`

Server-side gRPC service implementations for each smart home feature.

```
grpc-service/
└── src/
    └── main/
        └── java/
            └── service/
                ├── ClimateControlService.java     # Handles climate control functionalities
                ├── SmartCameraService.java        # Handles camera monitoring and alerts
                ├── SmartLighting.java             # Controls lighting features
                └── GrpcServiceApplication.java    # Main entry point for the server

```

---

## 📁 `proto/`

Contains the `.proto` interface definitions for all services.

```
proto/
└── src/
    └── main/
        └── proto/
            ├── climateControlService.proto        # Proto for temperature/humidity control
            ├── SmartCameraService.proto           # Proto for camera-related streaming
            └── SmartLighting.proto                # Proto for lighting operations

```


---

## 📁 `target/generated-sources/protobuf/`

Generated code from `.proto` files after compilation. Includes both gRPC service stubs and message classes.

```
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
```


