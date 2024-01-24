import groovy.json.JsonSlurperClassic

def jsonParse(def json) {
    new groovy.json.JsonSlurperClassic().parseText(json)
}
pipeline {
  agent any
  environment {
    appName = "variable"
    GRADLE_HOME = tool 'Gradle'
    PATH = "${GRADLE_HOME}/bin:${env.PATH}"
  }
  stages {

 stage("Build"){


      steps {
          script {
           bat "git clone https://github.com/SQARafael/Amazon-CI.git"
           bat "cd Amazon-CI"
           bat "${GRADLE_HOME}\\gradle build"

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
