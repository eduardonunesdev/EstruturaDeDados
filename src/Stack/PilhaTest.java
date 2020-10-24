package Stack;

public class PilhaTest {
    public static void main(String[] args) {

        Pilha p = new Pilha(); //Estanciando a classe Pilha;

        p.push(23);//Adicionando elementos atravéz do método PUSH;
        p.push(55);
        p.push(19);
        p.push(78);

        while (!p.isEmpty()){ //Enquanto a pilha não estiver vazia;
            int elemento = p.pop(); // A variável elemento recebe a função pop (desempilhar);
            System.out.println("Desenpilhando" + elemento); //Mostra o elemento que está sendo desempilhado;
         }
    }
}
