FROM clojure:tools-deps
RUN mkdir -p /usr/local/app
WORKDIR /usr/local/app

COPY deps.edn /usr/local/app/deps.edn
COPY Makefile /usr/local/app/Makefile
RUN clj -A:nREPL -P
RUN clj -P