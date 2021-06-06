# Readme

## Podman/Docker
The easiest way to deploy a Ktor application to a server is through a Podman or Docker container.

To do that, first build the application by running the `distTar` task and copy the resulting tarball to the `podman` directory like so:
```shell
./gradlew :distTar
cp ./app/build/distributions/app-0.0.1.tar ./podman/
```

Then from the `podman` directory, simply build the image, create the container, and start it.
```shell
podman build --tag basicktor:v0.0.1 .
podman create --name BasicKtorServer --publish 0.0.0.0:9291:8080 localhost/basicktor:v0.0.1
podman start BasicKtorServer
# podman stop BasicKtorServer
```

You should get a message when visiting [127.0.0.1:9291/](http://127.0.0.1:9291/).
