/**
 * Created by igorf on 26.10.15.
 */
var data, education, hobby, language, misc, personals, profile, projects, technology, working;

profile = [
    {
        title: "Coder",
        text: "Full-Stack-Entwickler mit Python und Javascript als Technologien. Struktur reicht von klassischen Server-Seiten (Sails.js & flask) bis zu SPAs (Angular, React, Durandal). Nutzung funktionaler, logischer und objektorientierter Paradigmen. Erste Erfahrung in SEO und GAnalytics."
    }, {
        title: "Linguist",
        text: "5-Jähriges Studium der Slavistik mit dem Schwerpunkt 'Russische Linguistik'. Mehrmalige Teilnahme an Projekten zur Phonetik und Pragmatik. Pädagogische Erfahrung als zweimaliger Tutor in linguistischen Seminaren und Deutsch-Lehrer. Abschlussarbeit als Web-App realisiert."
    }, {
        title: "Datenanalyst",
        text: "Akademische und wirtschaftliche Erfahrung in Datenanalyse. Kenntnis der Statistiksprache R und Python's pandas sowie Excel-basierter Auswertung. Arbeit mit quantitativen und qualitativen Daten. Erfahrung in gängigen Formaten wie .csv, .json, .xml. Nutzung von Semantic Web-APIs."
    }
];

personals = [
    {
        cat: "Geburtsdatum",
        item: "15.04.1989"
    }, {
        cat: "Geburtsort",
        item: "Temirtau, Kasachstan (Auswanderung 1998)"
    }, {
        cat: "Vatersberuf",
        item: "Java-Softwareentwickler"
    }, {
        cat: "Muttersberuf",
        item: "Krankenschwester"
    },
];

education = [
    {
        ed_name: "FOM",
        timerange: "März 2015 - September 2015",
        add_info: ["1 Semester - Abendstudium (aufgehört, da ich mich stärker auf Arbeit konzentrieren wollte)", "B.Sc. in Wirtschaftsinformatik",]
    }, {
        ed_name: "Universität Hamburg",
        timerange: "2009-2014",
        add_info: ["B.A. in Slavistik (Schwerpunkt: Russische Linguistik)", "B.A.-These: Vergleich der Silbenmodelle des Russischen mit Hilfe eines Natural Language Processing-Ansatzes", "Nebenfach: Geschichte", "Abschlussnote: 1.34"]
    }, {
        ed_name: "Staatliche Universität St. Petersburg",
        timerange: "Sommersemester 2013",
        add_info: ["Auslandssemester", "Schwerpunkt: Allgemeine Linguistik"]
    }, {
        ed_name: "Gymnasium 'Sachsenwaldschule'",
        timerange: "2001-2009",
        add_info: ["Abitur in Deutsch, Geschichte, Mathematik und Wirtschaft", "Abschlussnote: 2.9"]
    }
];

working = [
    {
        name: "Eversolve",
        job: "Software-Entwickler",
        location: "Hamburg",
        timerange: "April 2014 -",
        subtitle: "Frontend & Backend - Mit-Verantwortung",
        add_info: ["Frontends mit Knockout, Durandal, Angular und ReactJS", "Backend mit NodeJS & Socket.io", "Testing mit Jasmine & Selenium (Python-Bindings)"]
    },
    {
        name: "Everbase - Next Gen Fileserver",
        job: "Freiberuflicher Software-Entwickler",
        location: "Hamburg",
        timerange: "August 2014 -",
        subtitle: "Frontend",
        add_info: ["Frontend mit Angular und Ionic", "Async/Await & Babel.js", "Umgang mit einer Socket-gesteuerten API zum C++ Backend"]
    },
    {
        name: "A.C. Haase",
        job: "Assistent für Analytik und Administration",
        location: "Hamburg",
        timerange: "Dezember 2014 - Februar 2015",
        subtitle: "Bereich: Vertrieb und Marketing in Osteuropa",
        attachs: [{link: "/static/Referenz_Haase.pdf", title: "Arbeitszeugnis"}],
        add_info: ["Kontakt mit Exportmärkten in Russland und Ukraine", "Analyse der Marktsituation (Excel-basiert)", "Programmierung einer Auswertungsplattform (Python/Javascript/SQL; leider unbeendet wegen Russlandkrise)"]
    }, {
        name: "IFSH",
        location: "Hamburg",
        job: "Stud. Hilfskraft",
        timerange: "März-Oktober 2014",
        subtitle: "Projekttitel: Claiming Respect",
        attachs: [{link: "/static/Referenz_IFSH.pdf", title: "Arbeitszeugnis"}],
        add_info: ["Internetsuche von Texten russischer Politiker", "Annotieren von Emotionen", "Web-Darstellung der (ersten) Ergebnisse"]
    }, {
        name: "Auswärtiges Amt",
        location: "Chisinau, Moldawien",
        job: "Praktikant",
        timerange: "Juli-August 2013",
        subtitle: "Arbeit im Wirtschafts- und Kulturbereich",
        attachs: [{link: "/static/Referenz_DeutschBot.pdf", title: "Arbeitszeugnis"}],
        add_info: ["Datenaufbereitung für Pressearbeit", "Digitalisierung von Archiven", "Zusammenarbeit mit OSZE und anderen inter. Partnern"]
    }, {
        name: "Deutsch-Zentrum",
        location: "St. Petersburg, Russland",
        job: "Deutsch-Lehrer",
        timerange: "April-Juli 2013",
        subtitle: "Unterrichten von Gruppen mit dem Level A2-B2",
        attachs: [{link: "/static/Referenz_DeutschZentrum.pdf", title: "Arbeitszeugnis"}],
        add_info: ["Konventioneller Unterricht in kleinen Gruppen (< 12 Teilnehmer)", "Skype-Unterricht", "Gestaltung von Konversationskursen"]
    }, {
        name: "Universität Hamburg",
        location: "Hamburg",
        job: "Stud. Hilfskraft",
        timerange: "Mai-Dezember 2012 & September 2013-Januar 2014",
        attachs: [{link: "/static/Referenz_Prof. Krause.pdf", title: "Arbeitszeugnis"}],
        subtitle: "Projekttitel: Phonetic aspects of Russian-German language contact with respect to transfer, incomplete aquisition and attrition",
        add_info: ["Sammlung, Zusammenfassung und Verwertung von wissenschaftlicher Literatur", "Segmentierung lautsprachlicher (phonetischer) Daten von Kindern", "Datenvisualisierung und Posterdesign für eine Konferenz"]
    }, {
        name: "Institut für Slavistik",
        location: "Hamburg",
        job: "Tutor",
        timerange: " Wintersemester 2011 & 2012",
        subtitle: "Seminartitel: Systemlinguistische Beschreibung des Russischen",
        add_info: ["Vorbereitung und Durchführung von Übungen in großen Gruppen (> 25 Teilnehmer)", "Organisatorische Unterstützung des Seminars"]
    }
];

misc = [
    {
        topic: "Mitglied der Jugendorganisation 'Jugendwelle' zur Förderung Russlanddeutscher Kultur",
        location: "Tver, Russland",
        timerange: "Seit Jan. 2015"
    }, {
        topic: "Teilnehmer am 10. Deutsch-Russischen Jugendparlament",
        location: "Potsdam",
        timerange: "Dez. 2014"
    }, {
        topic: "Teilnehmer am 9. Deutsch-Russischen Jugendparlament",
        location: "Kassel",
        timerange: "Dez. 2013"
    }, {
        topic: "Herbstschule zum Thema 'Raising Language Awareness in Multilingual Settings'",
        location: "Hamburg",
        timerange: "Okt. 2012"
    }, {
        topic: "Sommerschule 'Sprache und Kultur Kasachstans' im DAAD-Programm 'go east'",
        location: "Almaty, Kasachstan",
        timerange: "Sep.-Okt. 2011"
    }, {
        topic: "Sommerschule 'Rossicum - Russische Sprache und Kultur'",
        location: "St. Petersburg",
        timerange: "Juli-Aug. 2011"
    }
];

language = [
    {
        name: "Deutsch",
        level: "Muttersprache"
    }, {
        name: "Englisch",
        level: "Sehr gut"
    }, {
        name: "Russisch",
        level: "Sehr gut"
    }, {
        name: "Slowenisch",
        level: "Mittlere Kenntnisse"
    }, {
        name: "Portugiesisch",
        level: "Grundkenntnisse"
    }
];

technology = [
    {
        category: "Akademisch",
        items: ["Exmaralda", "MaxQDA", "Praat", "LaTeX"]
    }, {
        category: "Office",
        items: ["Audacity", "GIMP", "Inkscape", "Microsoft & Open Office"]
    }, {
        category: "Backend-Sprachen",
        items: ["<strong>Python</strong>", "Clojure", "Prolog", "OCaml", "Scala"]
    }, {
        category: "Frontend-Sprachen",
        items: ["<strong>TypeScript</strong>", "<strong>CoffeeScript</strong>", "Dart", "ClojureScript"]
    }, {
        category: "APIs",
        items: ["XML", "JSON"],
        subcats: [
            {
                category: "Python",
                items: ["NLTK", "pandas", "flask", "lxml"]
            }, {
                category: "Web",
                items: ["d3.js", "jQuery", "Ember.js", "Knockout.js", "JSViews", "Polymer.dart", "Bootstrap"]
            }
        ]
    }, {
        category: "Datenbanken",
        items: ["SQLite", "TaffyDB"]
    }, {
        category: "Tools",
        items: ["Git", "PyCharm", "Vim", "Emacs", "Brunch.io", "Intel XDK", "Tmux", "Eclipse"]
    }
];



projects = [
    {
        link: "https://russyll.fischerops.com",
        desc: "Bachelor-These: Automatische Silbentrennung im Russischen",
        techs: "ClojureScript, Reagent, Google Closure, Bootstrap"
    }, {
        link: "https://data.fischerops.com/#/syllables",
        desc: "Bachelor-These: Interaktive Auswertung des 1-Million-Wörter Korpus",
        techs: "CoffeeScript, D3, Ember"
    }, {
        link: "https://russtress.fischerops.com",
        desc: "Automatische Betonungssetzung fürs Russische",
        techs: "ClojureScript, Reagent (Frontend), Express (Backend), Python-Flask (API)"
    }, {
        link: "https://data.fischerops.com/#/maxqda",
        desc: "Interaktive Darstellung der Arbeit innerhalb des 'Claiming Respect'-Projektes. Arbeit in Russisch",
        techs: "TypeScript, Google Charts, Bootstrap"
    },
    {
        link: "https://github.com/omelhoro/reagent-template",
        desc: "ClojureScript everywhere - template! Fork vom Ring/Compojure-Template",
        techs: "ClojureScript, NodeJS, Express",
    }
];

projectsProf = [
    {
        desc: "Programmierung des Frontends zum Backend eines Fileservers für Everbase",
        techs: "AngularJS, Ionic, Gulp"
    },
    {
        desc: "Programmierung einer Scan-Erfassungsform für APL Logistics (bei Eversolve)",
        techs: "NodeJS, MongoDB, Durandal"
    }, {
        desc: "Webplattform für Aktivierung und Wartung von remote RaspPis für Green Technology Solutions (bei Eversolve)",
        techs: "Bash, NodeJS, Protractor, Durandal"
    }, {
        link: "http://careiwo.herokuapp.com",
        desc: "Wohnmobile-Suchseite für Sales Verlag (bei Eversolve)",
        techs: "ES6, Grunt, Sails.js, Jade"
    }, {
        desc: "CPOS-Fabrikmanagement-System (verbindet ERP, OPC und IT) für Clean Value Plastics (bei Eversolve, work in progress)",
        techs: "NodeJS, Sails.js, Angular"
    },
];

hobby = ["Computerlinguistik", "Gitarre", "Sprachen", "Mountainbiken", "Apps"];

window.data = {
    name: "Igor Fischer",
    personals: {
        data: personals,
        name: "Persönliches"
    },
    projectsPrivate: {
        data: projects,
        name: "Privates Portfolio"
    },
    projectsProf: {
        data: projectsProf,
        name: "Berufliches Portfolio"
    },

    profile: {
        data: profile,
        name: "Profil"
    },
    education: {
        name: "Bildung",
        data: education
    },
    working: {
        data: working,
        name: "Erfahrung"
    },
    misc: {
        name: "Verschiedenes",
        data: misc
    },
    language: {
        data: language,
        name: "Sprachen"
    },
    technology: {
        data: technology,
        name: "Technisches"
    },
    hobby: {
        name: "Interessen",
        data: hobby
    }
};