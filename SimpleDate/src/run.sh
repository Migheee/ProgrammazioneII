#!/bin/bash

# Percorsi relativi dalla cartella src
OUT_DIR="../out/production/SimpleDate"

# Crea la cartella di output se non esiste
mkdir -p "$OUT_DIR"

# Compila tutti i file .java nella cartella corrente con preview features abilitate
javac -d "$OUT_DIR" *.java

# Controlla se la compilazione è andata a buon fine
if [ $? -ne 0 ]; then
    echo "Errore durante la compilazione!"
    exit 1
fi

# Esegui Main con preview features abilitate
java -cp "$OUT_DIR" Main

