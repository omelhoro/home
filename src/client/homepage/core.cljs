(ns homepage.core
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.session :as session]
            [secretary.core :as secretary :include-macros true]
            [goog.events :as events]
            [goog.history.EventType :as EventType])
  (:import goog.History))

;; -------------------------
;; Views

(defn current-page []
  [:div [(session/get :current-page)]])

(defn degrees-certificates []
  [:div [:h3 "Degree & Academic"]
   [:div {:class "row"}
    [:div {:class "col-lg-3"}
     [:a {:href "http://www.sachsenwaldschule.org/"}
      [:img {:class "img-responsive", :src "/static/media/sachsenwaldschule.gif", :alt "Sachsenwaldschule Logo"}]]]
    [:div {:class "col-lg-3 img-responsive"}
     [:a {:href "http://www.slm.uni-hamburg.de/ISlav/SlavSemTitel.html"}
      [:img {:class "img-responsive", :src "/static/media/slavistikhamburg.gif", :alt "Slavistik in Hamburg"}]]]
    [:div {:class "col-lg-3 img-responsive"}
     [:a {:href "http://www.spbu.ru"}
      [:img {:class "img-responsive", :src "/static/media/spbgu.jpeg", :alt "Saint Petersburg State University"}]]]]
   [:h3 "Worked & Working"]
   [:div {:class "row"}
    [:div {:class "col-lg-3"}
     [:a {:href "http://www.lima.uni-hamburg.de/index.php/en"}
      [:img {:src "/static/media/lima.jpeg", :alt "Lima - Linguistiic network", :class "img-responsive"}]]]
    [:div {:class "col-lg-3"}
     [:a {:href "http://ifsh.de"}
      [:img {:src "/static/media/ifsh.jpeg", :alt "Ifsh - foreign politics", :class "img-responsive"}]]]
    [:div {:class "col-lg-3"}
     [:a {:href "http://auswaertiges-amt.de"}
      [:img {:src "/static/media/aa.jpeg", :alt "Auswaertiges Amt - German Foreign Ministry", :class "img-responsive"}]]]
    [:div {:class "col-lg-3"}
     [:a {:href "http://www.achaase.de"}
      [:img {:src "/static/media/achaase.jpeg", :alt "Ac Haase - Export nach Russland", :class "img-responsive"}]]]]]
  )

(defn work-samples []
  [:div [:h3 "Work Samples"
         [:small "Combining Inkscape, Gimp, Python and R"]]
   [:div {:class "row"}
    [:div {:class "col-lg-6"}
     [:h4 "Infographic about Kleinstprojekte in Moldova"]
     [:a {:href "/static/media/pics/mold_map_ex.png"}
      [:img {:class "alignnone size-medium wp-image-66", :src "/static/media/pics/mold_map_small.png", :alt "Moldova Infographic", :width "212", :height "300"}]]]
    [:div {:class "col-lg-6"}
     [:h4 "\n      Conference presentations at\n      "
      [:a {:href "http://www.lima.uni-hamburg.de/index.php/de/veranstaltungen/lima-abschlusskonferenz"} "MIMS 2"] " (as co-author and designer)\n    "]
     [:a {:href "/static/media/pics/poster_vot.pdf"} "Poster for Voice Onset Time (VOT)\n    "
      [:p
       [:img {:src "/static/media/pics/poster_vot_small.png", :alt "Lima conference", :width "300"}]]]]
    [:div {:class "col-lg-6"}
     [:a {:href "/static/media/pics/poster_txtdev.pdf"} "Poster for Text Deviations of Heritage Readers\n    "
      [:p
       [:img {:src "/static/media/pics/poster_txtdev_small.png", :alt "Lima conference", :width "300"}]]]]]])

(defn seminar-papers []
  [:div
   [:h3 "University"]

   [:p "Take a look at my BA-Thesis:"]
   [:p
    [:a {:href "/static/tex-mydocs/ba-thesis/ba-thesis.pdf"} "Vergleich der Silbenmodelle des Russischen mit Hilfe eines Natural Language Processing-Ansatzes"]]
   [:p {:class "alert alert-warning"} "Although the description and the results are valid, the technical side is not. Recently I rewrote this app in Clojure with cljx-sources to work in web and desktop, also\n  "
    [:strong "disabled Sampa-Notation"] " which leads to a different output. Results and the app are in projects-section.\n"]
   [:p "Or look at my other seminar works."]
   [:h4 "My seminar papers"]
   [:h5 "Slavistics (major)"]
   [:ul
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/blackmonk/blackmonk.pdf"} "Der mentale Zustand A.V. Kovrins in der Erzählung “Der schwarze Mönch” von A.P. Čechov"]]
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/intonation/intonation.pdf"} "Beschreibungsmodelle der russischen Intonation"] " (In co-authorship),\n    "
     [:span {:class "label label-warning"} "Paper is uncorrected, so be cautious"]]
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/rhythm/rhythm.pdf"} "Rhythmusvariation bei Muttersprachlern des Russischen"]]]
   [:h5 "History (minor)"]
   [:ul
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/january_uprising/january_uprising.pdf"} "Quellenanalyse von “The Polish National Committee’s Proclamation of January 22, 1863″ "]]
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/panslavism/panslavism.pdf"} "Der Panslawismus in der ersten Hälfte des 19. Jahrhunderts"]]
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/mongols/mongols.pdf"} "Ein Brief des Kaisers über die Mongolengefahr"]]
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/kazachs/kazachs.pdf"} "Die Unabhängigkeit Kasachstans 1985-1991"]]
    [:li
     [:a {:href "/static/tex-mydocs/sem_papers/brest-litovsk/brest-litovsk.pdf"} "Außenpolitik der Bolschewiki von der Novemberrevolution bis zum Frieden von Brest-Litowsk: Konzept oder Pragmatismus?"]]]
   [:h5 "Miscellaneous"]
   [:ul
    [:li
     [:a {:href "http://www.bergedorfer-zeitung.de/printarchiv/reinbek/article123207695/Reinbeker-schreibt-ein-Stueck-Weltgeschichte-mit.html"} "Reinbeker schreibt Stück Weltgeschichte mit"]]
    [:li
     [:a {:href "/static/tex-mydocs/other_papers/intkult/intkult.pdf"} "Reflektionen über meine interkulturellen Erfahrungen"]]
    [:li
     [:a {:href "/static/tex-mydocs/other_papers/foreign_exp/foreign_exp_pet.pdf"} "Erfahrungsbericht zum Auslandssemester in St. Petersburg"]]
    [:li
     [:a {:href "/static/tex-mydocs/other_papers/job_disc/job_disc.pdf"} "Interview über einen Beruf in der Senatskanzlei"]]
    [:li
     [:a {:href "/static/tex-mydocs/other_papers/intern_foreign/intern_foreign.pdf"} "Praktikum in der Deutschen Botschaft in Moldawien"]]]]
  )


(defn abilities []
  [:div {:class "container"}
   [:h3 "Short CV"]
   [:div {:class "row"}
    [:div {:class "col-lg-6"}
     [:h4 "Working experience"]
     [:ul
      [:li "\n            Intern at the German Embassy in Moldova\n        "]
      [:li "\n            Teacher of German in St. Petersburg\n        "]
      [:li "\n            Student Assistant in two projects at U Hamburg\n        "]
      [:li "\n            Two times tutor in Russian linguistics\n        "]]
     [:h4 "Education"]
     [:ul
      [:li "\n            BA at the \n            "
       [:strong "University of Hamburg"] "\n            in Slavistics (major) and History  (minor)\n        "]
      [:li "\n            Exchange semester at the\n            "
       [:strong "State University of St. Petersburg"] "\n            in Russia\n        "]
      [:li "\n            German Abitur in Schleswig-Holstein\n        "]]
     [:h4 "Languages"]
     [:ul
      [:li "\n            German (native)\n        "]
      [:li "\n            Russian (near-native)\n        "]
      [:li "\n            English (advanced)\n        "]
      [:li "\n            Slovenian (intermediate)\n        "]
      [:li "\n            Portuguese (beginner)\n        "]]]
    [:div {:class "col-lg-6"}
     [:h4 "Computer abilities"]
     [:h5 "Beginners level"]
     [:ul
      [:li "GIMP"]
      [:li "Audacity"]
      [:li "\n            Microsoft Office\n        "]]
     [:h5 "Advanced level"]
     [:ul
      [:li "\n            Inkscape (and raw SVG)\n        "]
      [:li "\n            Linux-related software/tools\n        "]
      [:li "\n            Python (especially pandas and NLTK)\n        "]
      [:li]]
     [:h5 "Academic software"]
     [:ul
      [:li "Praat"]
      [:li "Exmaralda"]
      [:li "Latex"]
      [:li "MaxQDA"]]]]]
  )

(defn programming []

  [:div [:h3 "Coding"]
   [:div.row
    [:div.col-lg-9
     [:p
      [:h4 "Personal:"]
      "My private projects are mostly in ClojureScript (Reagent & Express). This site is made so :)"
      "That's the " [:a {:href "https://github.com/omelhoro/reagent-template"} "custom template"] "."
      [:br]
      "Here is a list of some personal projects:"
      [:ul
       [:li "phonological, like " [:a {:href "https://russyll.fischerops.com"} "syllable dividing"] " and " [:a {:href "https://russtress.fischerops.com"} "automatic stress setting"]]
       [:li "phonetic" [:a {:href "/#workviz"} " rhythm and intonation"]]
       [:li "morphological, tagging and lemmatizing"]
       [:li "pedagogical" [:a {:href "https://langapps.fischerops.com"} " enhancement of a language course with games"]]
       [:li "visualization of " [:a {:href "https://data.fischerops.com"} "linguistic data"]]
       [:li "semantic:" [:a {:href "https://data.fischerops.com/#/kosovotopic"} " tagging/clustering of emotions of Russian politicians"]]
       ]
      ]
     [:p [:h4 "Professionaly:"]
      "In my job at " [:a {:href "https://eversolve.io"} "Eversolve "]
      "I'm using JavaScript everywhere: MEAN, some MeteorJS, ReactJS. Everything packed in nice Docker-Containers :D"
      [:p "Some of our customers include:"]
      [:ul
       [:li [:a {:href "https://www.apllogistics.com"} "Espit & APLL"]]
       [:li [:a {:href "http://www.gts-web.de/"} "Green Technology Solutions"]]
       [:li [:a {:href "http://sales-verlag.de/"} "Sales-Verlag"]]
       [:li [:a {:href "http://www.ecophoenixx.de"} "FVH-Ecophoenixx"]]
       ]
      ]
     ]
    [:div.col-lg-3 [:img.photoofme {:src "/static/media/igorfischer1.jpg" :alt "Igor Fischer in Reinbek"}]]

    ]
   ]
  )


(defn year-2016 []
  [:div
   [:h4 "I've also made a plan what my profile is going to be in middle 2016"]
   [:h4 "That are the things I want to know really well:"]
   [:ul
    [:li "Abilities: Cross-Plattform-Development (iOS, Android, WP, Mac, Linux, Windows) & SPAs"]
    [:li "Languages: Swift, {one language for Android: Java | Kotlin | Scala}, C#, TypeScript"]
    [:li "DBs: MongoDB, Neo4J, PostgresQL"]
    [:li "App-Development: Appcelerator, Xamarin, React-Native, Cordova"]
    [:li "SPA-Frameworks: Angular, React, PouchDB"]
    [:li "Backend: LoopBack, Sails, MeteorJS"]
    [:li "Certifications"
     [:ul
      [:li "Xamarin-University"]
      [:li "StrongLoop NodeJS"]
      [:li "MongoDB-University"]
      [:li "iOS-Development (Udacity)"]
      [:li "Android-Development (Udacity)"]
      [:li "Cloudacademy AWS"]
      ]]
    ]
   ]
  )

(enable-console-print!)


(defn about-page []
  [:div [:h2 "Coder, Linguist, Eversolver"]
   [:div.row
    [:div.col-xs-8
     [:p.summary
      "I'm a former BA-student of Russian Linguistics and History at the University of Hamburg. I enjoy combining humanities with digital technologies - "
      [:strong "Digital Humanities. "]
      "Now I'm working at " [:a {:href "https://eversolve.io"} "Eversolve "] "."
      ]
     ]
    ]
   ])


(defn home-page []
  [:div
   (about-page)
   (programming)
   (seminar-papers)
   (degrees-certificates)
   (abilities)
   (work-samples)
   (year-2016)
   ]
  )


(def bio-data (js->clj js/data))

(print (keys bio-data))
(print (get bio-data "profile"))
(print (:technology bio-data))

(defn cv-main []
  [:style ".label {margin: 5px;}"]
  [:div {:id "vita"}
   [:section
    [:div {:class "row"}
     [:div {:class "col-xs-8 text-center"}
      [:h1 {:id "person-name", :class "text-capitalize" :style {:color "black"}} "Igor Fischer"]
      [:ul {:class "list-inline"}
       [:li "01573 6694292"]
       [:li [:a {:href "mailto:ich@ifischer.hamburg"} "ich@ifischer.hamburg"]]]
      [:ul {:class "list-inline"}
       [:li "Kirschenweg 38G\n                 "]
       [:li "21465 Reinbek\n                 "]]
      [:ul {:class "list-inline"}
       [:li
        [:a {:href "https://home.fischerops.com"} "https://home.fischerops.com"]]
       [:li
        [:a {:href "https://github.com/omelhoro"} "https://github.com/omelhoro"]]]]
     [:div {:class "col-xs-4 text-center"}
      [:img {:id "my_pic", :src "/static/media/igorfischer.jpg", :alt ""}]]]]
   [:section {:id "profile"}
    [:h3 "Profil"]
    [:div {:class "row"}
     (for [prof (get-in bio-data ["profile" "data"])] [:div.col-xs-4 [:h4 {:style {:background "inherit"}} (prof "title")] (prof "text")])
     ""]]

   [:section {:id "projects"}
    [:h3 (get-in bio-data ["projectsProf" "name"])]
    [:ul
     (for [prj (get-in bio-data ["projectsProf" "data"])]

       [:li
        [(if (-> (prj "link") nil?) :span :a) {:href (prj "link")} (prj "desc")] [:small.label.label-info (prj "techs")]])
     ]]

   [:section {:id "projects"}
    [:h3 (get-in bio-data ["projectsPrivate" "name"])]
    [:ul
     (for [prj (get-in bio-data ["projectsPrivate" "data"])] [:li [:a {:href (prj "link")} (prj "desc")] [:div.label.label-info (prj "techs")]])
     ]]

   [:section {:id "personals"}
    [:h3 "Persönliches"] ""
    [:table {:class "table borderless"}
     [:tbody
      (for [pers (get-in bio-data ["personals" "data"])] [:tr [:td (pers "cat")] [:td {:style {:vertical-align "bottom"}} (pers "item")]])
      ]
     ]
    ]
   [:section {:id "education"}
    [:h3 "Bildung"]
    (for [degr (get-in bio-data ["education" "data"])]
      [:div [:h4 (degr "ed_name") [:span.time (degr "timerange")]]
       [:ul (for [ed_info (degr "add_info")] [:li ed_info])]]
      )
    ]
   [:section {:id "working"}
    [:h3 {:class "section"} "Arbeitsleben"]

    (for [job (get-in bio-data ["working" "data"])]
      [:div
       [:h4 (job "name")
        [:small (job "job")
         [:span.place (job "location")]]
        [:span.time (job "timerange")]]

       [:h5 (job "subtitle")]
       [:ul
        (for [add_info (job "add_info")] [:li add_info])
        (if
          (-> (job "attachs") empty?)
          ""
          [:li (for [attach (job "attachs")]
                 [:a {:href (attach "link")} (attach "title")]
                 )
           ]
          )
        ]
       ]

      )
    ]

   ;[:section {:id "technology"}
   ; [:h3 "Technologien"]
   ; [:table {:class "table"}
   ;  [:tbody
   ;   [:tr
   ;    [:td {:class "category"} "{{category}}"]
   ;    [:td
   ;     [:ul {:class "item-horizontal"} "\n                    {{#each items}}\n                    "
   ;      [:li "{{{this}}}"] "\n                    {{/each}}\n                "] "\n\n                {{#if subcats}}\n                \n                    {{#each subcats}}\n                    \n                    {{/each}}\n                "
   ;     [:table {:class "table borderless subtab"}
   ;      [:tbody
   ;       [:tr
   ;        [:td "{{category}}"]
   ;        [:td
   ;         [:ul {:class "item-horizontal subcat"} "\n                                {{#each items}}\n                                "
   ;          [:li "{{this}}"] "\n                                {{/each}}\n                            "]]]]] "\n                {{/if}}\n            "]]]]]

   [:section {:id "language"}
    [:h3 "Sprachen"]
    [:table {:class "table borderless"}
     [:tbody
      (for [lang (get-in bio-data ["language" "data"])] [:tr [:td (lang "name")] [:td (lang "level")]])
      ]
     ]
    ]
   [:section {:id "misc"}
    [:h3 "Verschiedenes"]
    [:ul

     (for [misc (get-in bio-data ["misc" "data"])]
       [:li (misc "topic") [:span.place (misc "location")] [:small [:span.time (misc "time")]]]
       )
     ]
    ]

   [:section {:id "hobby"}
    [:h3 "Freizeit"]
    [:ul {:class "item-horizontal"}
     (for [hobby (get-in bio-data ["hobby" "data"])] [:li hobby])
     ]

    ]]
  )

(defn cv []
  [:div
   (cv-main)
   ]

  )


;; -------------------------
;; Routes
(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
                    (session/put! :current-page #'home-page))

(secretary/defroute "/cv" []
                    (session/put! :current-page #'cv))

;; -------------------------
;; History
;; must be called after routes have been defined
(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
      EventType/NAVIGATE
      (fn [event]
        (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

;; -------------------------
;; Initialize app
(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (hook-browser-navigation!)
  (mount-root))
