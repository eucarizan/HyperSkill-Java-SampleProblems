#!/usr/bin/env bash
if [[ -z $1 ]] || [[ -z $2 ]] || [[ -z $3 ]] || [[ -z $4 ]]; then
    echo "please provide a \$1:line number / \$2:problem number / \$3:project name / \$4:path"
else
    sed -i "$1i [$3](./$4/README.md)||$2" README.md
    sed -ir "2s/\(.*\)/- count ($2)/" README.md
    sed -i "5i 1. [$3](./$4/README.md)" README.md 
    sed -i "10d" README.md
    sed -ir '6,9s/\([0-9]\)\(.*\)/echo "$((\1+1))\2"/ge' README.md
    rm README.mdr
fi
