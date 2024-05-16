#!/usr/bin/env bash
if [[ -z $1 ]]; then
    echo "please provide a \$1:description"
else
    echo -e "problem number\t>> $(head -n2 ../../README.md | tail -n1)"
    echo -e "path\t\t>> $(echo $PWD | sed -r 's:.*sample_problems/::')"
    # echo -e "project name\t>> $(echo $PWD | sed -r 's:.*/::')"
    echo -e "problem name\t>> $(head -n1 README.md)"
    FORGREP=$(echo $PWD | sed -r 's:.*sample_problems(.*)/.*:\1:')
    cat -n ../../README.md | grep "${FORGREP}" | tail -n +6 | grep -E "$1"
fi
