def buildJar(){
    echo 'Building Jar File ... '
    sh 'mvn -f maven-demo/pom.xml package'
}

def buildImage(){
    echo 'Building Image ... '
    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]){
        sh 'docker build -f maven-demo/Dockerfile -t happytaipan/my-maven-app:2.0 .'
        sh 'echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin'
        sh 'docker push happytaipan/my-maven-app:2.0'
    }
}

return this