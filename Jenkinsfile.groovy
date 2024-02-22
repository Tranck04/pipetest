pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Tranck04/pipetest.git'
            }
        }

        stage('Deploy to Instance 1') {
            steps {
                script {
                    // Replace 'your-ssh-key' with the path to your private SSH key
                    // Replace 'instance1-ip' with the IP address of your first instance
                    // Replace 'ec2-user' with the username for your instance
                    // Replace '/path/to/deployment-directory/' with the path to your deployment directory
                    // Replace 'your-html-repo/index.html' with the path to the index.html file in your repo

                    sh 'scp -i ~/.ssh/id_rsa https://github.com/Tranck04/pipetest.git/index.html ec2-user@18.208.164.160:/var/www/html/'
                }
            }
        }

        stage('Deploy to Instance 2') {
            steps {
                script {
                    // Replace 'your-ssh-key' with the path to your private SSH key
                    // Replace 'instance2-ip' with the IP address of your second instance
                    // Replace 'ec2-user' with the username for your instance
                    // Replace '/path/to/deployment-directory/' with the path to your deployment directory
                    // Replace 'your-html-repo/index.html' with the path to the index.html file in your repo

                    sh 'scp -i ~/.ssh/id_rsa https://github.com/Tranck04/pipetest.git/index.html ec2-user@54.210.130.119:/var/www/html/'
                }
            }
        }
    }
}
