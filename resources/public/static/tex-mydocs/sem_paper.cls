\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{sem_paper}[2011/03/26 My custom CV class]
\LoadClass[12pt,headsepline,a4paper]{scrartcl}
\RequirePackage[OT2,T1]{fontenc}
\RequirePackage[russian,ngerman]{babel}
\RequirePackage[onehalfspacing]{setspace}
\RequirePackage[utf8]{inputenc}
\RequirePackage{scrpage2}  %<---
\RequirePackage{bibentry}
\RequirePackage[a4paper]{geometry}
\RequirePackage[
backend = bibtex8,
bibencoding = utf8,
defernumbers=true,
natbib = true,
style = verbose-ibid, 
maxnames = 2,
minnames = 1,
backref = true,
backrefstyle = two, 
]{biblatex}
\RequirePackage{eurosym}

\newcommand{\textcyr}[1]{{\fontencoding{OT2}\fontfamily{wncyr}\selectfont #1}}
\geometry{left=3cm,right=3cm,top=2cm,bottom=2cm}

\newcommand{\npsection}[1]{
    \newpage
    \section{#1}}

\pagestyle{scrheadings}%<
\clearscrheadfoot
\chead{\leftmark}
\automark[section]{section} 
\rohead{\pagemark}

\newcommand{\closuresection}[1]{
\section*{#1}
\markboth{#1}{#1}
\addcontentsline{toc}{section}{#1}
}

\newcommand{\tocpaper}[0]{
\tableofcontents
\thispagestyle{empty}
\pagenumbering{arabic}
\newpage
}

\newcommand{\titlepg}[6]{
\begin{titlepage}
\date{}
\author{}

\title{\Large #1}
{\let\newpage\relax\maketitle}

\begin{center}
\vfill
vorgelegt von\\
Igor Fischer \\
\null
Hamburg #2
\vfill
\end{center}

\begin{minipage}{0.5\textwidth}
\begin{flushleft} 
Universität Hamburg\\
#3\\
#4\\
#5\\
#6\\
\end{flushleft}
\end{minipage}
\vline
\begin{minipage}{0.5\textwidth}
\end{minipage}

\pagenumbering{gobble}
\end{titlepage}}

\newcommand{\literature}[0]{
    \newpage
    \addcontentsline{toc}{section}{Literatur}
    \printbibliography
}

