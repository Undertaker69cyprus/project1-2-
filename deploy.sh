#!/bin/bash
# deploy.sh - Script to deploy the application

echo "Deploying the finance-app Docker container..."

# Stop and remove any existing container with the same name
docker stop finance-app || true
docker rm finance-app || true

# Run the new container
docker run -d --name finance-app -p 8080:8080 finance-app

echo "Finance app deployed successfully!"
