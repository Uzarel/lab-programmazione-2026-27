# Come contribuire

Grazie per voler migliorare il materiale del corso! Qualunque correzione è benvenuta:
refusi, errori nel codice, esempi che non compilano, frasi poco chiare, link rotti.

## In due parole

- **Errore piccolo e ovvio** (refuso, `;` mancante, nome sbagliato) → apri direttamente una **pull request**.
- **Dubbio, errore concettuale, proposta di modifica più ampia** → apri prima una **issue**, così ne discutiamo.
- Non serve essere esperti di git: la guida qui sotto copre tutto quello che serve.

## Aprire una pull request (passo passo)

### Dal browser, senza installare nulla (consigliato per correzioni di una riga)

1. Vai al file da correggere (es. `lezioni/L01/Lezione01_Benvenuti_in_Java.tex`).
2. Clicca la matita ✏️ in alto a destra («Edit this file»). GitHub crea automaticamente un fork nel tuo account.
3. Fai la modifica nell'editor.
4. In basso, scrivi un titolo breve (es. `L01: corretto refuso in slide 12`) e clicca **Propose changes**.
5. Nella pagina successiva clicca **Create pull request**, compila il modulo e invia.

### Da terminale (per modifiche più grandi o se vuoi ricompilare le slide)

```bash
# 1. Fai il fork della repo dal pulsante "Fork" in alto a destra, poi:
git clone https://github.com/TUO-USERNAME/lab-programmazione-2026-27.git
cd lab-programmazione-2026-27

# 2. Crea un branch con un nome parlante
git checkout -b fix/L03-esempio-array

# 3. Modifica, poi verifica che compili (vedi README per i requisiti)
cd lezioni/L03 && pdflatex -shell-escape Lezione03_*.tex   # oppure: javac Esercizio.java

# 4. Commit e push
git add .
git commit -m "L03: corretto indice fuori range nell'esempio Array"
git push origin fix/L03-esempio-array

# 5. Su GitHub compare il pulsante "Compare & pull request": cliccalo e compila il modulo.
```

## Regole per le PR

- **Una PR, una cosa.** Un refuso e una modifica a un esercizio vanno in due PR separate: sono più facili da rivedere.
- **Titolo**: `LNN: cosa hai cambiato` (es. `L05: aggiunto import mancante in Punto.java`).
- **Modifica il `.tex`, non il PDF.** I PDF li ricompilo io dopo il merge, così non ci sono conflitti sui file binari. Se hai ricompilato e vuoi allegare il PDF, va bene, ma non è richiesto.
- **Codice Java**: deve compilare con `javac` senza warning e rispettare le convenzioni viste a lezione (nomi, indentazione a 4 spazi).
- **Non cambiare lo stile delle slide** (tema, colori, font) senza prima aprire una issue.
- Se la modifica tocca la sostanza di una spiegazione, scrivi nel modulo della PR **perché** la versione attuale è sbagliata o poco chiara.

## Aprire una issue

Usa i modelli proposti quando clicchi «New issue»:

- **Errore nelle slide** — indica lezione, numero di slide e cosa non va.
- **Errore nel codice** — indica il file e incolla l'errore del compilatore o l'output sbagliato.
- **Proposta** — per idee, esercizi extra, chiarimenti.

## Cosa succede dopo

Rivedo le PR di norma entro la lezione successiva. Posso chiederti modifiche nei commenti: ti basta
fare un altro commit sullo stesso branch e la PR si aggiorna da sola. Dopo il merge il sito si aggiorna in un paio di minuti
e il tuo nome compare tra i [contributori](../../graphs/contributors).

## Codice di condotta

Siamo in un'aula, anche se virtuale: critiche al materiale sì, alle persone no. Ogni contributo, anche piccolo, è apprezzato.
