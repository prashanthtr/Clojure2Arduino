(defproject clojure-git "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.keminglabs/c2 "0.2.3"]
                 [clodiuno "0.0.2-SNAPSHOT"]
                 ;[vrepl "1.1.1"]
                 ]
  :native-dependencies [[org.clojars.nakkaya/rxtx-macosx-native-deps "2.1.7"]]
  :dev-dependencies [[native-deps "1.0.5"]]
  ;:min-lein-version "2.0.0"
  ;:main vrepl.main
  :jvm-opts ["-d32"]
  )
