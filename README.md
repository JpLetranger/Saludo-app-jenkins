# SaludoApp 👋
> Aplicación Java con Maven - Demo Pipeline CI/CD Jenkins

[![Java](https://img.shields.io/badge/Java-21-red.svg)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue.svg)](https://maven.apache.org/)
[![Jenkins](https://img.shields.io/badge/Jenkins-Pipeline-orange.svg)](https://jenkins.io/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Una aplicación Java simple desarrollada para demostrar la implementación de un pipeline CI/CD completamente automatizado usando Jenkins, Maven y GitHub en entorno WSL Ubuntu.

## 📋 Características

### ☕ Aplicación Java
- **Mensajes personalizados** con validación de entrada
- **Pruebas unitarias** completas con JUnit
- **Arquitectura Maven** estándar
- **Compatibilidad Java 21** con features modernas
- **Logging y manejo de errores** integrado

### 🔄 CI/CD Automatizado
- **Pipeline Jenkins** declarativo como código
- **Build automático** en cada push a GitHub
- **Ejecución de pruebas** unitarias automáticas
- **Generación de artefactos** JAR
- **Reportes de cobertura** y calidad
- **Tiempo de build:** 2-5 minutos

## 🗂️ Arquitectura

```
┌─────────────┐    ┌──────────────────┐    ┌─────────────────┐    ┌──────────────┐
│   GitHub    │───▶│     Jenkins      │───▶│ Maven Build &   │───▶│ JAR Artifact │
│ Repository  │    │   (CI/CD)        │    │ Unit Tests      │    │  & Reports   │
└─────────────┘    └──────────────────┘    └─────────────────┘    └──────────────┘
       │                     │                       │                     │
   git push           Jenkinsfile              mvn clean test         Deployable JAR
```

## 🛠️ Stack Tecnológico

### Backend
- **Java 21** - Runtime y lenguaje principal
- **Maven 3.x** - Gestión de dependencias y build
- **JUnit 4** - Framework de testing

### DevOps/CI
- **Jenkins** - Servidor de automatización CI/CD
- **Git/GitHub** - Control de versiones
- **Jenkinsfile** - Pipeline as Code
- **WSL Ubuntu** - Entorno de desarrollo

### Herramientas de Desarrollo
- **Git** para control de versiones
- **Maven** para gestión de proyecto
- **nano/VSCode** como editores principales

## 📦 Instalación Local

### Prerrequisitos
- Java 21 (OpenJDK)
- Maven 3.x
- Git
- Jenkins (opcional para CI/CD local)

### Setup
```bash
# Clonar repositorio
git clone https://github.com/tu-usuario/saludo-app-jenkins.git
cd saludo-app-jenkins

# Compilar proyecto
mvn clean compile

# Ejecutar pruebas
mvn test

# Generar JAR
mvn package

# Ejecutar aplicación
java -cp target/classes com.ejemplo.saludo.App "Tu Nombre"
```

### Estructura del Proyecto
```
saludo-app/
├── README.md                    # Este archivo
├── .gitignore                   # Archivos ignorados por Git
├── pom.xml                      # Configuración Maven
├── Jenkinsfile                  # Pipeline CI/CD as Code
└── src/
    ├── main/java/com/ejemplo/saludo/
    │   └── App.java            # Clase principal
    └── test/java/com/ejemplo/saludo/
        └── AppTest.java        # Pruebas unitarias
```

## 🚀 Pipeline CI/CD

### Jenkinsfile - Pipeline Automatizado
El proyecto incluye un pipeline Jenkins completamente configurado:

```groovy
pipeline {
    agent any
    
    environment {
        JAVA_HOME = '/usr/lib/jvm/java-21-openjdk-amd64'
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }
    
    stages {
        stage('🔧 Verificar Entorno') { ... }
        stage('🔄 Checkout') { ... }
        stage('🧹 Limpiar') { ... }
        stage('⚙️ Compilar') { ... }
        stage('🧪 Pruebas') { ... }
        stage('📦 Empaquetar') { ... }
        stage('🚀 Ejecutar App') { ... }
    }
}
```

### Flujo de Trabajo
1. **Push a GitHub** → Trigger automático (polling o webhook)
2. **Checkout Stage** → Jenkins clona el código más reciente
3. **Compile Stage** → Maven compila el proyecto Java
4. **Test Stage** → Ejecuta pruebas unitarias con JUnit
5. **Package Stage** → Genera JAR ejecutable
6. **Execute Stage** → Prueba la aplicación compilada
7. **Archive** → Almacena artefactos para descarga

## 📊 Características del Pipeline

### ✅ Validaciones Incluidas
- **Verificación de entorno** (Java, Maven)
- **Compilación sin errores**
- **100% de pruebas pasando**
- **Generación exitosa de JAR**
- **Ejecución funcional de la app**

### 📈 Reportes Generados
- **Test Results** - Resultados detallados de JUnit
- **Build Artifacts** - JAR descargable
- **Console Logs** - Logs completos de ejecución
- **Build History** - Historial de builds con tendencias

## 🎯 Caso de Uso

Este proyecto fue desarrollado como demostración para:

### 📚 Evaluación Académica
- **Materia:** Integración Continua y DevOps
- **Objetivo:** Implementar pipeline CI/CD con Jenkins
- **Alcance:** Automatización completa de build y testing

### 💼 Skills Demostrados
- **Pipeline as Code** con Jenkinsfile
- **Maven Build Automation**
- **Unit Testing** con JUnit
- **Git Integration** con Jenkins
- **Java Development** moderno
- **DevOps Best Practices**

## 🔒 Configuración de Seguridad

### Jenkins Security
- **Usuario administrador** configurado
- **Credenciales GitHub** seguras
- **Workspace isolation** por proyecto
- **Build artifact** protección

### Best Practices Implementadas
- **Pipeline as Code** versionado
- **Automated testing** obligatorio
- **Clean workspace** después de build
- **Error handling** en todas las etapas

## 📈 Métricas y Monitoreo

### Jenkins Built-in Metrics
- **Build success rate** tracking
- **Build duration** histórico
- **Test results** trending
- **Artifact generation** confirmación

### Key Performance Indicators
- **Build Time:** 2-5 minutos promedio
- **Test Success Rate:** 100% target
- **Code Coverage:** Reportado via JUnit
- **Failure Rate:** < 5% objetivo

## 🧪 Testing

### Pruebas Unitarias Incluidas
```java
@Test
public void testSaludoConNombre() {
    assertEquals("¡Hola, DevOps!", App.generarSaludo("DevOps"));
}

@Test
public void testSaludoSinNombre() {
    assertEquals("¡Hola, Mundo!", App.generarSaludo(""));
}

@Test
public void testSaludoConNull() {
    assertEquals("¡Hola, Mundo!", App.generarSaludo(null));
}
```

### Cobertura de Testing
- **Funciones principales:** 100% cubierto
- **Edge cases:** Manejo de null y strings vacíos
- **Integration testing:** Prueba end-to-end en pipeline

## 👨‍💻 Contribución

Para contribuir a este proyecto educativo:

1. **Fork** el repositorio
2. **Create feature branch:** `git checkout -b feature/nueva-funcionalidad`
3. **Commit changes:** `git commit -am 'Add nueva funcionalidad'`
4. **Push to branch:** `git push origin feature/nueva-funcionalidad`
5. **Submit Pull Request**

## 📚 Recursos de Aprendizaje

### Documentación Relevante
- [Jenkins Pipeline Syntax](https://jenkins.io/doc/book/pipeline/syntax/)
- [Maven Getting Started](https://maven.apache.org/guides/getting-started/)
- [JUnit 4 Documentation](https://junit.org/junit4/)
- [Java 21 Features](https://openjdk.org/projects/jdk/21/)

### Comandos Útiles
```bash
# Ejecutar solo pruebas
mvn test

# Compilar sin pruebas
mvn compile -DskipTests

# Limpiar proyecto
mvn clean

# Ver dependencias
mvn dependency:tree

# Ejecutar con argumentos
java -cp target/classes com.ejemplo.saludo.App "Argumento"
```

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver [LICENSE](LICENSE) para detalles.

## 📞 Contacto

**Desarrollador:** Juan Pablo Gajardo  
**Email:** jgajardodev@gmail.com  
**GitHub:** https://github.com/JpLetranger

---

### 🏆 Tecnologías y Herramientas

<div align="center">
  
![Java](https://img.shields.io/badge/-Java-007396?style=flat-square&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/-Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white)
![Jenkins](https://img.shields.io/badge/-Jenkins-D24939?style=flat-square&logo=jenkins&logoColor=white)
![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat-square&logo=github&logoColor=white)
![JUnit](https://img.shields.io/badge/-JUnit-25A162?style=flat-square&logo=junit5&logoColor=white)
![Ubuntu](https://img.shields.io/badge/-Ubuntu-E95420?style=flat-square&logo=ubuntu&logoColor=white)

</div>

---

<div align="center">
  <p><strong>DevOps = Integración Continua - Automatización de Construcción con Jenkins</strong></p>
  <p>© 2025 SaludoApp CI/CD Demo Project</p>
</div>