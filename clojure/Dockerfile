FROM clojure:latest

ADD ./clj-server/project.clj /code/clj-server/project.clj

WORKDIR /code/clj-server

RUN apt-get update
RUN apt-get install screen
RUN lein deps
RUN lein clean
RUN lein compile

ADD . /code

WORKDIR /code/clj-server

EXPOSE 5000


