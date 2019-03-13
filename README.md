# SPA勉強用調整くん

## TODO

* 一覧からリンクを押して調整画面を開ける
* イベントの登録ができる。
  * 登録用のAPIの作成
  * 日付をいくらでも加えれる
* 調整画面を作成する
  * 回答ができる
  * 現在の人数集計を出せる
  * 回答内容の変更ができる

* yarn buildした時にjavaの方にリソースをコピーする
* herokuで動かせるようにする

## 動作確認

package.jsonにプロキシを設定したので両方動かせばとりあえず動く
```
$ mvn spring-boot:start
$ cd frontend
$ yarn start
```
