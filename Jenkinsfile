node{
   stage('SCM Checkout'){
       git credentialsId: 'git-creds', url: 'https://github.com/ilanmg/Selenium_Docker'
   }
   stage('Mvn Package'){
     def mvnHome = tool name: 'Apache Maven 3.6.0', type: 'maven'
     def mvnCMD = "${mvnHome}/bin/mvn"
     sh "${mvnCMD} clean package"
   }
   stage('Build Docker Image'){
     sh 'docker build -t ilanmg/selenium_docker .'
   }
   stage('Push Docker Image'){
    
     sh 'docker push ilanmg/Selenium_Docker'
   }
   stage('Run Container on Dev Server'){
     def dockerRun = 'docker run -p 8080:8080 -d --name my-app ilanmg/Selenium_Docker'
     sshagent(['dev-server']) {
       sh "ssh -o StrictHostKeyChecking=no ec2-user@172.31.18.198 ${dockerRun}"
     }
   }
}



docker run -p 8080:8080 -v /var/run/docker.sock:/var/run/docker.sock --name jenkins jenkinsci/blueocean

bash-4.4# chmod 777 /var/run/docker.sock




