#!/usr/bin/env bash
if [[ -z $1 ]]; then
    echo "please provide a filename"
else
    if [[ -z $2 ]]; then
	echo "please provide a method name"
    else	
	sed -ir 's_\(Sample.*:\)\r_```\n\n**\1**\n```console_' README.md
	rm *.mdr
	PATH_MAIN="src/main/java/dev/nj/solutions/"
	PATH_TEST="src/test/java/"
	mv ${PATH_MAIN}Solution.java ${PATH_MAIN}$1.java
	mv ${PATH_TEST}SolutionTest.java ${PATH_TEST}$1Test.java
	sed -i "s/Solution/$1/" ${PATH_MAIN}$1.java ${PATH_TEST}$1Test.java README.md
	sed -i "s/method/$2/" ${PATH_MAIN}$1.java ${PATH_TEST}$1Test.java
	sed -i "s/param test/$2 test/" ${PATH_TEST}$1Test.java
    fi
fi
