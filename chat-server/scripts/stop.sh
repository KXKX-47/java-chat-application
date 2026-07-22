#!/bin/bash

PID=$(pgrep -f chat-server.jar)

if [ -n "$PID" ]; then
    kill -15 "$PID"
fi