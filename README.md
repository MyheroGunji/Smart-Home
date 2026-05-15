# Smart Home Project - Structure Overview

## Author: **Mahiro Gunji** 

## Overview
A distributed smart home simulation system developed using Java, Spring Boot, gRPC, and Eureka Server.

The project simulates multiple smart home services including climate control, smart lighting, and security camera monitoring through modular gRPC-based communication between client and server applications.

This project was developed to strengthen backend development, distributed systems, service communication, and API integration skills.

## Technologies
- Java
- Spring Boot
- gRPC
- Protocol Buffers
- Eureka Server
- Maven

## Key Features
- Modular smart home service architecture
- gRPC-based client-server communication
- Smart lighting and climate control simulation
- Security camera monitoring services
- Service discovery using Eureka Server
- API key-based security filter implementation

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
├── src/
│    └── main/
│        └── java/
│            └── service/
│                ├── ClimateControlService.java     # Handles climate control functionalities
│                ├── SmartCameraService.java        # Handles camera monitoring and alerts
│                ├── SmartLighting.java             # Controls lighting features
│                └── GrpcServiceApplication.java    # Main entry point for the server
│ 
└── pom.xml


```
---

## 📁 `eureka-server/`

Client-side application that communicates with the gRPC server.

```
eureka-server/
├── src/
│   └── main/
│       └── java/
│           ├── EurekaServerApplication/                        
│           └── resources/                
│               ├── application.yml
└── pom.xml

```
---

## 📁 `proto/`

Contains the `.proto` interface definitions for all services.

```
proto/
├──  src/
│    └── main/
│         └── proto/
│             ├── climateControlService.proto        # Proto for temperature/humidity control
│             ├── SmartCameraService.proto           # Proto for camera-related streaming
│             └── SmartLighting.proto                # Proto for lighting operations
│
└── pom.xml

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


