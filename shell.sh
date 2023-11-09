#!/bin/bash
GITHUB_REPO="https://github.com/bathinasirisha/learnings.git"
BRANCH="dev"
TMP_DIR="/tmp"
HTTPD_PATH="/var/www/html"
APP_NAME="Apache"

# Clone the Git repository and checkout the specified branch
git clone -b $BRANCH $GITHUB_REPO $TMP_DIR/$APP_NAME

# Stop the Apache service
sudo service httpd stop

# Copy the application to the Apache path
sudo cp -r $TMP_DIR/$APP_NAME/* $HTTPD_PATH/

# Start the Apache service
sudo service httpd start

# Delete the application in /tmp
rm -rf $TMP_DIR/$APP_NAME

echo "Deployment complete."
