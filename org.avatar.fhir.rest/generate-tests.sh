#!/bin/bash -e

usage() {
  cat << EOF
Generates Avatar Libraries REST API tests based on OpenAPI / Swagger spec

Usage : $(basename $0) [smoke-tests]
  ex :
    Generate smoke tests
     $ $(basename $0) smoke-tests

EOF
}

if [ $# != 1 ]; then
  usage
  printf "ERROR : Please specify type of test to generate!\n\n"
  exit 2
fi;

case "$1" in
  -h | --help)   usage;   exit 0;;
  "smoke-tests") CONFIG="/local/test/smoke-tests/smoke-tests.config.yaml";;
  *)
    usage
    echo "ERROR : Unknown test type: ${1}"
    exit 3
  ;;
esac

echo "Generating tests.."
docker run --rm \
 --network host \
 --volume ${PWD}:/local \
 openapitools/openapi-generator-cli:latest \
 generate \
 --config ${CONFIG} \
