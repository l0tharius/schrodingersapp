#!/bin/bash
#ref: https://stackoverflow.com/questions/59895/getting-the-source-directory-of-a-bash-script-from-within

thisDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# means the line is a comment

# Need to put the program into the project folder, bash puts you in your home directory
# and note target/ infront of .jar as we are in the root folder of the program
# Uncomment the lines below if you want to check the directory you are in
# if you to uncomment these then put a # on the clear command to comment it out
# or you will not see the echo's below.

# echo "Current Dir:"
# echo $thisDir

cd $thisDir
clear

# logging level at info default
java -cp target/schrodingersapp-v1.jar com.l0tharius.schrodingersapp.App

# logging level at debug
java -cp target/schrodingersapp-v1.jar com.l0tharius.schrodingersapp.App -v

# help text
java -cp target/schrodingersapp-v1.jar com.l0tharius.schrodingersapp.App -help

# help text
java -cp target/schrodingersapp-v1.jar com.l0tharius.schrodingersapp.App -version

echo "Press ENTER to close window ..."
read aKey
