#!/bin/bash


# 動作確認出力
echo "RUN実行確認" >> $(date +"%Y%m%d%H").txt

# カレントディレクトリを取得する
APP_HOME="`pwd -P`"
echo "カレントディレクトリ取得確認" + $APP_HOME >> $(date +"%Y%m%d%H").txt


CLASSPATH="C:/pleiades/2026-08/Saikoro.jar"

# classファイルを実行(java -cp 【クラスパス】 【実行するクラス】)
java -jar $CLASSPATH
echo "classファイルを実行終了" >> $(date +"%Y%m%d%H").txt