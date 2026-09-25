# Laboratorio di Programmazione — A.A. 2026/27

Materiale del corso di **Laboratorio di Programmazione** (Java), Ingegneria Informatica II anno,
I semestre, Sede di San Giovanni a Teduccio. Docente: Mattia Fonisto.

Sito con l'elenco delle lezioni: **https://Uzarel.github.io/lab-programmazione-2026-27/**

## Struttura della repo

```
├── index.md              homepage del sito (GitHub Pages)
├── lezioni/
│   ├── L01/              Lezione 1: slide (.tex + .pdf) + esercizi/ (sorgenti .java)
│   ├── L02/
│   └── ...
└── CONTRIBUTING.md       come segnalare errori e proporre correzioni
```

Ogni cartella `lezioni/LNN/` contiene il sorgente LaTeX **e** il PDF già compilato, così gli studenti
scaricano direttamente il PDF e i sorgenti restano versionati.

## Compilare le slide

Le slide sono in LaTeX/Beamer con diagrammi Mermaid renderizzati al volo dal pacchetto `ltmermaid`.

**Requisiti**

1. TeX Live completa (pdflatex, beamer, listings, booktabs, adjustbox, babel italiano)
2. Il pacchetto `ltmermaid`: `tlmgr install ltmermaid`
3. Node.js + Mermaid CLI: `npm install -g @mermaid-js/mermaid-cli` (deve esistere il comando `mmdc`)

**Compilazione di una lezione**

```bash
cd lezioni/L01
pdflatex -shell-escape Lezione01_Benvenuti_in_Java.tex
pdflatex -shell-escape Lezione01_Benvenuti_in_Java.tex   # seconda passata per i riferimenti
```

I diagrammi renderizzati finiscono in una cartella `mermaid/` accanto al `.tex` (ignorata da git).

**Convenzioni nei sorgenti**

- ogni frame con `lstlisting` o `mermaid` è dichiarato `[fragile]`
- diagrammi inline con `\begin{mermaid} ... \end{mermaid}`
- codice Java con lo stile `javastyle`, righe di terminale con lo stile `shell`

## Esercizi

I sorgenti degli esercizi svolti a lezione sono in `lezioni/LNN/esercizi/`. Si compilano ed eseguono con:

```bash
javac NomeFile.java && java NomeFile
```

## Contribuire

Hai trovato un refuso, un esempio che non compila, una spiegazione poco chiara?
Leggi [CONTRIBUTING.md](CONTRIBUTING.md): apri una issue o una pull request. Le correzioni sono benvenute.

## Licenza

Il materiale didattico (slide, testi) è rilasciato con licenza
[CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/deed.it);
il codice degli esercizi con licenza MIT.
