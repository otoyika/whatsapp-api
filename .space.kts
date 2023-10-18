job("Build and push Docker") {
    host("Build artifacts and a Docker image") {
        dockerBuildPush {
            tags {
                +"api:1.0.${"$"}JB_SPACE_EXECUTION_NUMBER"
                +"api:latest"
            }
        }
    }
}