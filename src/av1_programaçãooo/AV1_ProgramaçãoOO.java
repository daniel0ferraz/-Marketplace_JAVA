/*
 * ALUNOS
    Douglas Nascimento de Oliveira – Matricula: 2018101958
    Daniel Ferraz Coelho – Matricula: 2020100646
    Pedro Henrique dos Santos Silveira – Matricula: 2015201917
 */
package av1_programaçãooo;


public class AV1_ProgramaçãoOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Cliente cliente1 = new Cliente();
        
        cliente1.setNome("Romulo Mendonça");
        cliente1.setCPF("222.333.444-55");
        cliente1.setEmail("rm@unicarioca.com.br");
        cliente1.setTelefone("2222.5555");
        
    Fornecedor fornecedor1 = new Fornecedor();
        
        fornecedor1.setCNPJ("00.312.312/3122-99");
        fornecedor1.setEndereco("R. tiriri, 254");
        fornecedor1.setNome("Armazem 17");
        
    Pedido pedido1 = new Pedido();
        
        pedido1.setCod_Pedido("1234");
        pedido1.setQuant_Prod(2);
        pedido1.setValor_Pedido(120.00);
        pedido1.setForma_Pagamento("Debito");
        pedido1.setEnd_Entrega("R. tururu, 2132");
        
        
    Produto produto1 = new Produto();
        
        produto1.setCod_Prod("321");
        produto1.setEstoque(15);
        produto1.setNome("Caixa de som");
        produto1.setValor_Produto(249.00);
        produto1.setDesc("20%");
        
        System.out.println("\n CLiente 1: " + cliente1.getNome() + "\n CPF: " + cliente1.getCPF() + "\n Email: " + cliente1.getEmail() + "\n Tel:" + cliente1.getTelefone());
        System.out.println("\n Fornecedor: " + fornecedor1.getNome() + "\n Endereço: " + fornecedor1.getEndereco() + "\n CNPJ :" + fornecedor1.getCNPJ());
        System.out.println("\n Codigo: " + pedido1.getCod_Pedido() + "\n Quantidade: " + pedido1.getQuant_Prod() + "\n Valor pedido: R$" + pedido1.getValor_Pedido() + "\n Forma de pagamento:" + pedido1.getForma_Pagamento() + "\n Endereço entrega: " + pedido1.getEnd_Entrega());
        System.out.println("\n Codigo: " + produto1.getCod_Prod() + "\n Itens em estoque: " + produto1.getEstoque() + "\n Produto: " + produto1.getNome() + "\n Valor Produto: R$" + produto1.getValor_Produto() + "\n Desconto: " + produto1.getDesc());
                
    }
    
}
