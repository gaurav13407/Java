#!/bin/bash

# Find the first Java file recursively
FILE=$(find . -type f -name "*.java" | head -n 1)

# Check if any Java file was found
if [ -z "$FILE" ]; then
  echo "❌ No .java file found in this directory or its subfolders!"
  exit 1
fi

# Extract class name and directory
FILENAME=$(basename "$FILE" .java)
DIR=$(dirname "$FILE")

echo "📁 Found Java file: $FILE"
echo "📦 Compiling..."
javac "$FILE"

# If compilation fails
if [ $? -ne 0 ]; then
  echo "❌ Compilation failed!"
  exit 1
fi

echo "🚀 Running $FILENAME..."
(cd "$DIR" && java "$FILENAME")

# Delete all .class files after execution
echo "🧹 Deleting all .class files..."
find . -type f -name "*.class" -delete

