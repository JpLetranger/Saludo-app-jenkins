pipeline {
    agent any
    
    tools {
        maven 'Maven-3.6'
        jdk 'JDK-11'
    }
    
    stages {
        stage('🔄 Checkout') {
            steps {
                echo '📥 Clonando código desde GitHub...'
                checkout scm
            }
        }
        
        stage('🧹 Limpiar') {
            steps {
                echo '🧹 Limpiando proyecto...'
                sh 'mvn clean'
            }
        }
        
        stage('⚙️ Compilar') {
            steps {
                echo '⚙️ Compilando código Java...'
                sh 'mvn compile'
            }
        }
        
        stage('🧪 Pruebas') {
            steps {
                echo '🧪 Ejecutando pruebas unitarias...'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('📦 Empaquetar') {
            steps {
                echo '📦 Generando JAR...'
                sh 'mvn package'
            }
        }
        
        stage('🚀 Ejecutar App') {
            steps {
                echo '🚀 Probando ejecución de la aplicación...'
                sh 'java -cp target/classes com.ejemplo.saludo.App "Jenkins CI/CD"'
            }
        }
    }
    
    post {
        success {
            echo '✅ ¡Pipeline ejecutado exitosamente!'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        failure {
            echo '❌ Pipeline falló. Revisar logs.'
        }
        always {
            echo '🧹 Limpiando workspace...'
            cleanWs()
        }
    }
}
