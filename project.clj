(defproject lein-webdav "0.1.0-SNAPSHOT"
  :description "A simple plugin that enables deploying to webdav repos."
  :url "https://github.com/tobias/lein-webdav"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.apache.maven.wagon/wagon-webdav-jackrabbit "2.4"]]
  :eval-in-leiningen true
  :signing {:gpg-key "01116F12"}
  :lein-release {:deploy-via :clojars})
