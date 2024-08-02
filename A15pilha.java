//aqui, estou utilizando a classe "Stack" para a criação da pilha
//contudo, é mais eficiente você implementar pilhas com classes de filas ("Deque" e "arrayDeque")
//isso acontece porque em Java, essas classes não possuem o mesmo overhead que a classe "Stack" possui
//e por isso, elas possuem mais eficiência
import java.util.Stack;

public class EmpilhamentoDeLivros {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        
        stack.push("Romeu e ");
    }
}
