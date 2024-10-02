//importações
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;



//classe principal
public class Supermercado {
    public static void main(String[] args) {
        Telas.menuPrincipal();
    }
}



class Telas {
    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        int opcao = 0;
        
        while(true) {
            System.out.println("OPÇÕES");
            System.out.println("1) Pegar novo carrinho de compras");
            System.out.println("2) Adicionar produto ao carrinho de compras");
            System.out.println("3) Remover produto do carrinho de compras");
            
            System.out.print("\nR: ");
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    cliente.pegarNovoCarrinho();
                    break;
                    
                case 2:
                    Telas.adicionarProduto();
                    break;
    
                case 3:
                    Telas.removerProduto();
                    break;
                    
                default:
                    break;
            }
        }
    }
    
    public static void adicionarProduto() {
        String[] nomesProdutos = {
            "Arroz", "Feijão", "Macarrão", "Açúcar", "Sal", "Café",
            "Leite", "Ovos", "Manteiga", "Queijo", "Presunto", "Frango",
            "Carne Moída", "Peixe", "Batata", "Cebola", "Alho", "Tomate",
            "Cenoura", "Maçã", "Banana", "Laranja", "Uva", "Abacate", 
            "Melancia", "Pão", "Margarina", "Iogurte", "Molho de Tomate",
            "Ketchup", "Mostarda", "Maionese", "Óleo", "Vinagre", "Cereais",
            "Granola", "Biscoito", "Chocolate", "Sorvete", "Sucos", "Refrigerante",
            "Água Mineral", "Chá", "Temperos", "Ervas", "Tortilla", "Pizza Congelada",
            "Snacks", "Ração para Animais", "Sabão em Pó"
        };
        
        for(int i = 0; i < nomesProdutos.length; i++)
            System.out.println((i + 1) + ") " + nomesProdutos[i]);
        
        int opcao = 0;
        System.out.print("ID: ");
        opcao = scanner.nextInt();
        
        
        Telas.limparTela();
    }
    
    public static void removerProduto() {
        
    }
    
    public static void limparTela() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
}



class Cliente {
    private List<CarrinhoDeCompras> carrinhos;
    
    public Cliente() {
        this.carrinhos = new ArrayList<>();
    }
    
    public void pegarNovoCarrinho() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        this.carrinhos.add(carrinho);
    }
}



class CarrinhoDeCompras {
    private static int idAtual = 0; 
    private int idCarrinhoDeCompras;
    private List<Produto> produtos;
    
    public CarrinhoDeCompras() {
        this.idCarrinhoDeCompras = ++this.idAtual;
        this.produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void removerProduto(int id) {
        this.produtos.remove(id);
    }
    
    public void exibirProdutos() {
        for(Produto produto : this.produtos)
            System.out.println(produto.get_nome());
    }
}



class Produto {
    private String nome;
    private String unidadeDeMedida;
    private float peso;
    private int quantidadeDeUnidades;
    
    public Produto(String nome, String unidadeDeMedida, float peso, int quantidadeDeUnidades) {
        this.nome = nome;
        this.unidadeDeMedida = unidadeDeMedida;
        this.peso = peso;
        this.quantidadeDeUnidades = quantidadeDeUnidades;
    }
    
    public String get_nome() {
        return this.nome;
    }
    
    public void set_peso(float peso) {
        this.peso = peso;
    }
    
    private float gerarPesoAleatorio() {
        Random random = new Random();
        return random.nextFloat();
    }
}
