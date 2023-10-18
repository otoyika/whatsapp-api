job("Build and push Docker") {
    host("Build artifacts and a Docker image") {
        dockerBuildPush {
            tags {
                +"otoyika.registry.jetbrains.space/p/main/containers/whatsapp-api:1.0.${"$"}JB_SPACE_EXECUTION_NUMBER"
                +"otoyika.registry.jetbrains.space/p/main/containers/whatsapp-api:latest"
            }
        }
    }
}