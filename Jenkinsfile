pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME'
        jdk 'JAVA_HOME'
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
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn clean test'
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