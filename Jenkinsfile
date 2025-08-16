pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME'   // Name of Maven installed in Jenkins (Manage Jenkins → Global Tool Config)
        jdk 'JAVA_HOME'      // Name of JDK installed in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning code from GitHub...'
                git branch: 'main', url: 'https://github.com/Ankit-Keshri-SDET/Selenium-TestNG-Maven-Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished - Cleaning up...'
        }
        success {
            echo 'Build & Tests completed successfully ✅'
        }
        failure {
            echo 'Build or Tests failed ❌'
        }
    }
}