pipeline {
	agent any
	tools {
		jdk 'jdk-17'
		maven 'jenkins-maven'
	}
	stages {
	    stage('Checkout') {
	        steps {
	            checkout scm
	        }
	    }
		stage('Build'){
			steps {
				sh "mvn clean install -DskipTests"
			}
		}
		stage('Test'){
			steps{
				sh "mvn test"
			}
		}
		stage('Deploy') {
			steps {
			    sh "mvn jar:jar deploy:deploy"
			}
		}
	}
}
