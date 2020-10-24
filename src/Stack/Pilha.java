package Stack;

public class Pilha {
    int elementos[]; // Array de elementos;
    int topo; // Atributo para identificar o topo;

    public Pilha(){ //Construtor
        elementos   = new int[10];
        topo        = -1; // Posição inválida do vetor;
    }

    public void push(int e){ //Adicionando elemento na pilha;

        topo++; // Mudando o topo para a posição[0];
        elementos [topo] = e; //  Adicionando elemento na posição topo que agora está [0];

    }

    public int pop(){

        int e; // Criação da variável e;
        e = elementos[topo]; //Minha variável e recebe o elemento que está no topo;
        topo--; // Tiro o que está no meu topo;
        return e; // Retorno agora a variável retirada;

    }

    public boolean isEmpty(){

        return (topo == -1);
    }

    public boolean isFull(){
        return (topo == 9);

    }

    public int top(){
        return elementos[topo];

    }

}
