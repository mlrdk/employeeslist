#!/bin/bash

case $1 in
    "local") docker build -f Dockerfile_local -t localimage . ;;
    "remote") docker build -f Dockerfile_remote -t remoteimage --build-arg ssh_prv_key="$(cat id_rsa1)" --build-arg ssh_pub_key="$(cat id_rsa1.pub)"  . ;;
    "default") docker build -f Dockerfile_local -t localimage . ;;
esac
