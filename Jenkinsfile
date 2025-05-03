// my-shared-library/Jenkinsfile
@Library('my-shared-library') _  // Import the shared library

pipeline {
    agent any  // Use any available agent

    stages {
        stage('Build and Test') {
            steps {
                script {
                    mavenBuild()  // Call the shared library function to perform the Maven build
                }
            }
        }
    }
}
