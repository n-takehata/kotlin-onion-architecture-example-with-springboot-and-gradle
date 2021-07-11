# 概要
こちらのブログ記事のサンプルコードになります。  
[GradleのマルチプロジェクトによるKotlin、Spring Bootでのオニオンアーキテクチャの実現](https://blog.takehata-engineer.com/entry/realizing-an-onion-architecture-in-kotlin-and-spring-boot-with-gradle-multi-project)

以下のbook-managerというアプリケーションを、Gradleのマルチプロジェクトに変更した構成になっています。  
https://github.com/n-takehata/kotlin-server-side-programming-practice/tree/main/part2/book-manager

パッケージ構成やKotlinのプログラム部分などはbook-managerと全く同じです。  
ライブラリやGradleのプラグインのバージョンは、適宜最新バージョンにアップグレードしています。

# 実行方法
以下のいずれかの方法でアプリケーションを起動できます。

- IntelliJ IDEAのGradleビューから、[presentation]->[Tasks]->[application]->[bootRun]を実行
- ターミナルでkotlin-onion-architecture-example-with-springboot-and-gradleディレクトリから `./gradlew presentation:bootRun` を実行
- presentation配下にある、BookManagerApplication.ktのmain関数を実行