package org.lessons.java.iterator;


// ! Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo all’ultimo).

// Bonus :
// Prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
// Buon lavoro!

//% Ho un array di interi : interi
// & un numero che mi dica dove mi trovo mentre lo scorro : indice corrente

// * un metodo con lo scopo di sapere se ho altri elementi da scorrere
// @ un metodo che scorre gli elementi restituendomi ad ogni invocazione l'elemento successivo
    // ^ per poterlo fare incrementa di uno l'indice corrente in cui mi trovo


public class Ciclabile {
    private int[] interi; 
    private int indiceCorrente;

    public Ciclabile(){
        this.indiceCorrente = -1;
        this.interi = new int[0];
    }

    public Ciclabile(int[] interi){
        this.indiceCorrente = -1;
        this.interi = interi;
    }

    public int[] getInteri() {
        return this.interi;
    }

    public int getIndiceCorrente() {
        return this.indiceCorrente;
    }

    public int getElementoSuccessivo() throws Exception {
        if (hasAncoraElementi()){
            this.indiceCorrente = this.indiceCorrente + 1;
            return this.interi[this.indiceCorrente];
        } else {
            throw new Exception("Indice troppo grande per l'array in uso"); //! da ritornare con un'eccezione
        }
    }

    public boolean hasAncoraElementi(){
        return this.indiceCorrente < this.interi.length - 1;
    }

    public void addElemento(int nuovoIntero){ // # append
        // & creo un nuovo array della lunghezza del precedente + 1
        int[] nuoviInteri = new int[this.interi.length + 1];

        // $ copio l'array di prima in quello nuovo 
        for (int i = 0; i < this.interi.length; i++) {
            nuoviInteri[i] = this.interi[i];
        }

        // * aggiungo l'ultimo elemento alla fine
        nuoviInteri[nuoviInteri.length - 1] = nuovoIntero; 

        // # sostituisco l'array iniziale con quello nuovo
        this.interi = nuoviInteri;
    }

    public void addElementoInTesta(int nuovoIntero){ // $ prepend
        // & creo un nuovo array della lunghezza del precedente + 1
        int[] nuoviInteri = new int[this.interi.length + 1];

        // * aggiungo l'ultimo elemento all'inizio
        nuoviInteri[0] = nuovoIntero; 

        // $ copio l'array di prima in quello nuovo ad un posto piu' avanti 
        for (int i = 0; i < this.interi.length; i++) {
            nuoviInteri[i + 1] = this.interi[i];
        }

        // # sostituisco l'array iniziale con quello nuovo
        this.interi = nuoviInteri;
    }

    private void setInteri(int[] interi) {        
        this.interi = interi;
    }
    private void setIndiceCorrente(int indiceCorrente) {
        this.indiceCorrente = indiceCorrente;
    }

}
