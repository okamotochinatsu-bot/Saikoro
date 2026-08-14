#!/bin/bash

# 動作確認出力
echo "RUN実行確認" >> $(date +"%Y%m%d%H").txt
CLASSPATH="C:/pleiades/2026-08/Saikoro.jar"

# 実行
java -jar $CLASSPATH
echo "classファイルを実行終了" >> $(date +"%Y%m%d%H").txt