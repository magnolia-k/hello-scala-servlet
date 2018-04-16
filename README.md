# Hello World servlet app sample for scala

Scalaで書かれたServletベースのHello Worldサンプルアプケーションです。

# 使い方

```bash
$ git clone https://github.com/magnolia-k/hello-scala-servlet
$ cd hello-scala-servlet
$ sbt
sbt:Hello Scala Servlet> jetty:start
```

ブラウザから`http://localhost:8080`へアクセスすると「Hello, World」と表示されます。`http://localhost:8080?name=Scala`というように、`name`パラメータを付けると`name`で指定したパラメータの内容が`Hello`に続いて表示されます。この場合の表示は、`Hello, Scala`となります。

終わったら、アプリケーションを停止します。

```bash
sbt:Hello Scala Servlet> jetty:stop
```
