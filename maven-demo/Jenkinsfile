def gv
pipeline{
  agent any
  tools{
    maven 'maven_3.9'
  }
  stages{
    stage('init'){
      steps{
        script{
          gv = load "maven-demo/script.groovy"
        }
      }
    }

    stage('BuildJar'){
      steps{
        script{
          gv.buildJar()
        }
      }
    }

    stage('BuildImage'){
      steps{
        script{
          gv.buildImage()
        }
      }
    }
    
  }
}
