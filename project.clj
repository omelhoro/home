(defproject homepage "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring-server "0.4.0"]
                 [reagent "0.5.1"]
                 [reagent-forms "0.5.12"]
                 [reagent-utils "0.1.5"]
                 [ring "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [prone "0.8.2"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [environ "1.0.1"]
                 [org.clojure/clojurescript "1.7.145" :scope "provided"]
                 [secretary "1.2.3"]
                 
                 ]

  :plugins [[lein-environ "1.0.1"]
            [lein-cljsbuild "1.1.0"]
            [lein-figwheel "0.4.1"]
            [lein-asset-minifier "0.2.2"]]

  :ring {:handler homepage.handler/app
         :uberwar-name "homepage.war"}

  :min-lein-version "2.5.0"

  :uberjar-name "homepage.jar"

  :main homepage.server

  :clean-targets ^{:protect false} [:target-path
                                    [:cljsbuild :builds :app :compiler :output-dir]
                                    [:cljsbuild :builds :app :compiler :output-to]]

  :source-paths ["src/backend" "src/cljc"]

  :minify-assets
  {:assets
    {"resources/public/css/site.min.css" "resources/public/css/site.css"}}

  :cljsbuild {:builds {:app {:source-paths ["src/client" "src/cljc"]
                             :compiler {:output-to     "resources/public/js/app.js"
                                        :output-dir    "resources/public/js/out"
                                        :asset-path   "js/out"
                                        :optimizations :none
                                        :pretty-print  true}}
                       :server {
                                :source-paths ["src/backend"]
                                :compiler     {:output-dir    "out"
                                               :output-to     "out/index.js"
                                               :optimizations :none
                                               :source-map    "src-maps"
                                               :target        :nodejs}

                                }
                       }
              }

  :profiles {:dev {:repl-options {:init-ns homepage.repl}

                   :dependencies [[ring/ring-mock "0.3.0"]
                                  [ring/ring-devel "1.4.0"]
                                  [lein-figwheel "0.4.1"]
                                  [org.clojure/tools.nrepl "0.2.11"]
                                  [com.cemerick/piggieback "0.1.5"]
                                  [pjstadig/humane-test-output "0.7.0"]]

                   :source-paths ["env/dev/clj"]
                   :plugins [[lein-figwheel "0.4.1"]
                             [refactor-nrepl "2.0.0-SNAPSHOT"]
                             [lein-cljsbuild "1.1.0"]]

                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]

                   :figwheel {
                              ;:http-server-root "public"
                              ;:server-port 3449
                              ;:nrepl-port 7002
                              ;:nrepl-middleware ["cemerick.piggieback/wrap-cljs-repl"
                              ;                   
                              ;                   "refactor-nrepl.middleware/wrap-refactor"
                              ;                   ]
                              :css-dirs ["resources/public/css"]
                              ;:ring-handler homepage.handler/app
}

                   :env {:dev true}

                   :cljsbuild {:builds {:app {:source-paths ["env/dev/cljs"]
                                              :compiler {:main "homepage.dev"
                                                         :source-map true}}


                                        }

                               }}

             :uberjar {:hooks [leiningen.cljsbuild minify-assets.plugin/hooks]
                       :env {:production true}
                       :aot :all
                       :omit-source true
                       :cljsbuild {:jar false
                                   :builds {:app
                                             {:source-paths ["env/prod/cljs"]
                                              :compiler
                                              {:optimizations :advanced
                                               :pretty-print false}}
                                            :server {}
                                            }}}})
