#!/usr/bin/env bash

echo "Starting the script to build"
DOCKER_HUB_ID=$1
DOCKER_HUB_PWD=$2
MONGO_USERNAME=$3
MONGO_PWD=$4
ORIGIN_BRANCH=$5
TARGET_BRANCH=$6

echo "Source branch is $ORIGIN_BRANCH and target branch is $TARGET_BRANCH"

COMMIT=$(git rev-parse HEAD)
echo "Current commit is $currentCommit"

./gradlew check

if [ "$ORIGIN_BRANCH" == "master" ]; then
  ./gradlew bootJar
  tag="bhargodevarya/movieservice:latest"
  echo "starting the script"
  #tag+="${COMMIT:0:6}"

  echo "Creating image with tha tag $tag"

  #TODO, find a better way to pass mongo credentials
  docker image build -t "$tag" --build-arg mongo_username="$MONGO_USERNAME" --build-arg mongo_password="$MONGO_PWD" -f ./MovieServiceApp/Dockerfile .
  docker login -u "$DOCKER_HUB_ID" -p "$DOCKER_HUB_PWD"
  docker image push "$tag"
  docker logout
fi

echo "Script finished"
