// my-shared-library/vars/mavenBuild.groovy
def call() {
    pipeline {
        agent any  // Use any available agent

        stages {
            stage('Checkout') {
                steps {
                    checkout scm  // Checkout the source code from the SCM (Git)
                }
            }

            stage('Maven Build') {
                steps {
                    script {
                        // Run the Maven build command
                        sh "mvn clean install -DskipTests"
                    }
                }
            }

            stage('Test') {
                steps {
                    // Run tests using Maven
                    sh "mvn test"
                }
            }
        }
    }
}
