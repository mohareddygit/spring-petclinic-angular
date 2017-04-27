stage "Checkout"

node {
	checkout scm
}

stage "Compile"

node {
	withEnv(["PATH+MAVEN=${tool 'M3'}/bin"]) {
		sh "mvn compile"
	}

}
