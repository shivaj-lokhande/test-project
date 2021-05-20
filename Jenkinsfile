def gv 
pipeline{
  agent any
parameters {
  choice (choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Enter the choice of version ', name: 'VERSION')
  booleanParam (defaultValue: true, description: 'enter the if you want to execute tests or not', name: 'executeTests')
}

  stages {
    stage("init"){
      steps{
        script {
          gv =load "script.groovy"
        }
        }
    }
    stage("build"){
      steps{
        script {
          gv.buildApp()
        }
      }
    }
   
    stage("test"){
      steps{
        when {
          expression{
            params.executeTests
          }
        }
        script {
        gv.testApp()
        }
      }
    }
    
    stage("deploy"){
      steps{
        script{
          gv.deployApp()
        }
      }
    }
    
  }

}
