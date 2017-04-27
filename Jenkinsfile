def mvn(arguments) {
	withEnv(["PATH+MAVEN=${tool 'M3'}/bin"]) {
		sh "mvn ${arguments}"
	}
}

stage "Checkout"
node {
	checkout scm
}

stage "Compile"
node {
	mvn "clean compile"
}

stage "Analyze"
node {
	mvn "verify"
}

//stage "Publish to Nexus"
//node {
//	mvn "deploy:deploy"
//}
