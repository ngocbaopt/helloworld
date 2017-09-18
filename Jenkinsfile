pipeline {
    agent none
    stages {
        stage ('build') {
            steps {
                echo "Build"
            }
        }

        stage ('Test') {
            steps {
                echo "Test"
            }
        }

        stage ('Deploy - Staging') {
            steps {
                echo "Deploy - Staging"
            }
        }

        stage ('Sanity - Check') {
            steps {
                echo "Sanity - Check"
            }
        }

        stage ('Deploy - Production') {
            steps {
                echo "Deploy - Production"
            }
        }
    }

    post {
        always {
            echo "One way or another, I have finished"
        }

        success {
            echo "I succeeded"
        }

        unstable {
            echo "I'm unstable"
        }

        failure {
            echo "I failed:("
        }

        changed {
            echo "Things were different before"
        }

    }
}
