FROM ubuntu:latest
LABEL authors="pplad"

ENTRYPOINT ["top", "-b"]