pipeline {
    agent any

    environment {
        DOCKER_IMAGE="app2"
    }

    stages{
        stage('code checkout'){

            steps {
                git clone git@github.com:kovvur/webservices.git
            }
        }

        stage('Build code'){
            steps{
                script{
                    dir('webProject'){
                        sh "mvn clean package &"
                    }
                }
            
            }
        }

        stage('Build Docker image'){
            steps{
                script {
                    sh "docker build -t ${DOCKER_IMAGE} ." 
                }
            }
        }

        stage('Push Docker image to Dockerhub'){
            steps{
                script{
                    sh "docker ${DOCKER_IMAGE} app2 kovvur/first_repository:${DOCKER_IMAGE}"
                    sh "docker push kovvur/first_repository:${DOCKER_IMAGE}"
                }
            }
        }

        stage('Run Docker Container'){
            steps{
                script{
                    sh "docker run -d -p 8081:8081 ${DOCKER_IMAGE}"
                }
            }
        }
    }
}
