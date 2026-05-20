def buildJar(){
    echo 'Building Jar File ... '
    sh 'mvn -f maven-demo/pom.xml package'
}

def buildImage(){
    echo 'Building Image ... '
    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'pwd', usernameVariable: 'user')]){
        sh 'docker build -f maven-demo/Dockerfile -t happytaipan/my-maven-app:2.0 .'
        sh 'docker login -u ${user} -p ${pwd}'
        sh 'docker push happytaipan/my-maven-app:2.0'
    }
}

return this