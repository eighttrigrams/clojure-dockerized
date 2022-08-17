# Clojure dockerized

## Spin up the docker container

Run

    docker-compose -f clj-dev/docker-compose.yaml run --entrypoint "/bin/bash" clojure

## Run as program

Inside the container, run 

```
root@bxyz:/usr/local/app# clj -X:run
{:some "data"}
```

## REPL

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

## nREPL

In the host system, figure out how to obtain the ip address of the
running docker container.

Inside the container, run

    $ make repl

### VSCode

In the host system in your VSCode

- REPL
    - Connect to a running REPL in your project
        - Generic
            - \<ipaddress>:47481

Voilà!

## Rebuild the container

To rebuild the container after a change in `deps.edn` or `Makefile` use

    docker-compose -f clj-dev/docker-compose.yaml build clojure
