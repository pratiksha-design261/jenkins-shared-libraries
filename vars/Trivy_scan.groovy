def call() {
    sh "trivy fs ."
}

// trivy: This is a powerful, open-source vulnerability scanner used for scanning containers, filesystems, and repositories.
// fs: The fs command tells Trivy to scan the filesystem. This mode scans files and directories on the local machine (or Jenkins workspace) for vulnerabilities, including known vulnerabilities in system packages, libraries, and configuration files.
// . (dot): Refers to the current directory. The scan will be performed on the current directory (where Jenkins checks out the source code or runs the build).
