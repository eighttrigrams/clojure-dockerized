# Clojure dockerized

Run

    docker-compose -f clj-dev/docker-compose.yaml run --entrypoint "/bin/bash" clojure

Inside the container, run 

```
root@bxyz:/usr/local/app# clj -X:run
{:some "data"}
```

To get a REPL, run

```
root@bxyz:/usr/local/app# clj
Clojure 1.11.1
user=> (require 'main) ; or (require 'main :reload) 
                       ; or (require 'main :reload-all) after you've made some changes
nil
user=> (main/read-json "data.json")
{:some "data"}
```

Use `ctrl+d` or `ctrl+d` to exit from the Clojure REPL and then `ctrl+d` or type `exit` to exit from the docker container.

To rebuild the container after a change in deps.edn use

    docker-compose -f clj-dev/docker-compose.yaml build clojure

