#!/usr/bin/env bash
sed -r 's_\(Sample Input \d:\|Sample Output \d:\)\n_```\n\n**\1**\n```console_' $1

