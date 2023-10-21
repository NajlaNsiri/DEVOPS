pipeline {
    agent any

    stages {
        stage('Checkout GIT') {
            steps {
                echo 'pulling...'
                git branch: 'Mouadh',
                url: 'https://github.com/NajlaNsiri/DEVOPS.git'
            }
        }
        stage('testing Maven') {
            steps {
                sh "mvn -version"
            }
        }
    }
}
