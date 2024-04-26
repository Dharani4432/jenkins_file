pipeline {
    agent any

    environment {
        DIRECTORY_PATH = "path/to/your/code"
        TESTING_ENVIRONMENT = "test"
        PRODUCTION_ENVIRONMENT = "Dharani_Reddy" 
    }

    stages {
        stage('Build') {
            steps {
                echo "Fetching source code from the directory path specified by the environment variable: ${DIRECTORY_PATH}"
                echo "Compiling the code and generating any necessary artifacts"
            }
        }
        stage('Test') {
            steps {
                echo "Running unit tests"
                echo "Running integration tests"
            }
        }
        stage('Code Quality Check') {
            steps {
                echo "Checking the quality of the code"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying the application to a testing environment specified by the environment variable: ${TESTING_ENVIRONMENT}"
            }
        }
        stage('Approval') {
            steps {
                echo "Waiting for manual approval (simulated sleep for 10 seconds)"
                sleep 10
            }
        }
        stage('Deploy to Production') {
            steps {
                echo "Deploying the code to the production environment: ${PRODUCTION_ENVIRONMENT}"
            }
        }
    }
}
