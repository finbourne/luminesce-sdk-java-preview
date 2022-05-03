#!/bin/bash

while getopts a:m: flag
do
    case "${flag}" in
        a) application=${OPTARG};;
        m) meta=${OPTARG};;
    esac
done

if [ -z "$application" ]
  then
    echo "No application argument supplied"
    exit 1
fi

application_lower=${application,,}
application_upper=${application^^}
application_camel=${application^}

echo "Setting up repository for $application_lower-sdk-extensions-java";

echo "Setting up GitHub actions ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" .github/workflows/build-and-test.yaml
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" .github/workflows/build-and-test.yaml
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" .github/workflows/build-and-test.yaml
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" .github/workflows/cron.yaml
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" .github/workflows/cron.yaml
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" .github/workflows/cron.yaml

echo "Setting up README ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" README.md
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" README.md
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" README.md

echo "Setting up CONTRIBUTING ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" docs/CONTRIBUTING.md
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" docs/CONTRIBUTING.md
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" docs/CONTRIBUTING.md

echo "Setting up Docker ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" Dockerfile
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" Dockerfile
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" Dockerfile
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" docker-compose.yml
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" docker-compose.yml
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" docker-compose.yml

echo "Setting up config.json ..."
sed -i '' "s/CHANGEME-APPLICATION-LOWER/$application_lower/g" config.json
sed -i '' "s/CHANGEME-APPLICATION-UPPER/$application_upper/g" config.json
sed -i '' "s/CHANGEME-APPLICATION-CAMEL/$application_camel/g" config.json
sed -i '' "s/CHANGEME-META-ID/$meta/g" config.json 


echo "Moving files ..."
mkdir sdk
mv Dockerfile sdk/
mv docker-compose.yml sdk/
