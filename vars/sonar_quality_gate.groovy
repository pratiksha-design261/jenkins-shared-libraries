def call() {
    timeout(time: 1, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: false
    }
}

// waitForQualityGate: This is a Jenkins step specifically used with SonarQube. It waits for the SonarQube quality gate result after the code has been analyzed. SonarQube’s Quality Gate is a set of conditions (like code coverage, bugs, or vulnerabilities) that the code must meet to be considered good.
// abortPipeline: false: This parameter indicates that the pipeline should not be aborted even if the quality gate fails. Normally, if the quality gate fails (e.g., the code quality is below acceptable thresholds), the pipeline might be aborted. However, by setting abortPipeline: false, it ensures that the pipeline continues regardless of the quality gate status.