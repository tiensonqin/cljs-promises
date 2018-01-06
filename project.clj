(defproject com.tiensonqin/cljs-promises "0.0.1"
  :description "A ClojureScript library for working with JavaScript promises"

  :url "https://github.com/tiensonqin/cljs-promises"

  :scm {:name "git"
        :url "https://github.com/tiensonqin/cljs-promises"}

  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "examples"
              :source-paths ["src" "examples/src"]
              :compiler {
                :output-to "examples/js/examples.js"
                :output-dir "examples/out"
                :optimizations :none
                :source-map true}}]})
