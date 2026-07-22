#!/bin/bash

export SPRING_PROFILES_ACTIVE=prod

java - Xms1G -Xmx2G -Dspring.config.additional-location=file:/home/kaixun/chat-platform/chat-server/src/main/resources \
-jar /home/kaixun/chat-platform/chat-server/src/main/chat-server.jar