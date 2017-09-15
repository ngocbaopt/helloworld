pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage ('No-op') {
            steps {
                sh 'ls'
            }
        }
        stage ('build') {
            steps {
                sh 'mvn --version'
            }
        }

        stage ('Test') {
            steps {
                sh './gradlew check'
            }
        }
    }

    post {
        always {
            echo 'One way or another, I have finished'
            delete
        }
        always {
            archive 'build/libs/**/*.jar'
            junit 'build/reports/**/*.xml'
        }
    }
}