pipeline {
	agent any
	tools {
		jdk 'jdk-17'
		maven 'jenkins-maven'
	}
	stages {
		stage('Build') {
			steps {
				sh "mvn clean install -DskipTests"
			}
		}
		stage('Test') {
			steps {
				sh "mvn test"
			}
		}
		stage("Publish to Nexus Repository Manager") {
			steps {
				sh "mvn deploy -DskipTests"
			}
		}
	}
}