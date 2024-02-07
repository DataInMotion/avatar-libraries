#!/bin/bash -e

docker run --rm \
 --network host \
 --volume ${PWD}:/test \
 --interactive \
 --env-file ./smoke-tests/smoke-tests.env \
 loadimpact/k6 \
 run /test/smoke-tests/smoke-tests.script.js

