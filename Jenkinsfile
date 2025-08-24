pipeline {
    agent any
    
    environment {
        JAVA_HOME = '/usr/lib/jvm/java-21-openjdk-amd64'
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }
    
    stages {
        stage('🔧 Verificar Entorno') {
            steps {
                sh '''
                    echo "JAVA_HOME configurado: $JAVA_HOME"
                    echo "PATH: $PATH"
                    ls -la $JAVA_HOME || echo "JAVA_HOME no accesible"
                    java -version || echo "java no funciona"
                    mvn -version || echo "mvn no funciona"
                '''
            }
        }
        
        stage('🧹 Compilar y Probar') {
            steps {
                sh 'mvn clean compile test package'
            }
        }
        
        stage('🚀 Ejecutar') {
            steps {
                sh 'java -cp target/classes com.ejemplo.saludo.App "Jenkins Test"'
            }
        }
    }
    
    post {
        success {
            echo '✅ Build exitoso'
            archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
        }
        failure {
            echo '❌ Build falló'
        }
    }
}