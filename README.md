# Clojure Dockerize Test

Run

    docker-compose -f clj-dev/docker-compose.yaml run --entrypoint "/bin/bash" clojure

Inside the container

```
root@bxyz:/usr/local/app# clj
Clojure 1.11.1
user=> (require 'go)
nil
user=> (go/!)
{:some "data"}
```

Use `ctrl+d` or `ctrl+d` to exit from the Clojure REPL and then `ctrl+d` or type `exit` to exit from the docker container.

To rebuild the container after a change in deps.edn use

    docker-compose -f clj-dev/docker-compose.yaml build clojure

