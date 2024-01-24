import groovy.json.JsonSlurperClassic

def jsonParse(def json) {
    new groovy.json.JsonSlurperClassic().parseText(json)
}
pipeline {
  agent any
  environment {
    appName = "variable"
  }
  stages {

 stage("paso 1"){

      steps {
          script {
           echo "Hola mundo"
        }
      }
    }
  }
  post {
      always {
          deleteDir()
          echo "fase always"

      }
      success {
            echo "fase success"

        }

      failure {
            echo "fase failure"

      }

  }
}
