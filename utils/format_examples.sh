#!/usr/bin/env bash
sed -ir 's_\(Sample.*:\)\r_```\n\n**\1**\n```console_' $1
