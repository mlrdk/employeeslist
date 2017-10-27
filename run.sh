#!/bin/bash

case $1 in
    "local") docker run -it localimage  ;;
    "remote") docker build -it remoteimage . ;;
    "default") docker build -it localimage . ;;
esac
