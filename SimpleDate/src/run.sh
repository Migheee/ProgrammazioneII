#!/bin/bash

# Percorsi relativi dalla cartella src
OUT_DIR="../out/production/SimpleDate"

# Compila tutti i file .java nella cartella corrente
javac -d "$OUT_DIR" *.java

# Controlla se la compilazione è andata a buon fine
if [ $? -ne 0 ]; then
    exit 1
fi

# Esegui Main
java -cp "$OUT_DIR" Main
