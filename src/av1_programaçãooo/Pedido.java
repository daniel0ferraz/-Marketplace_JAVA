/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av1_programaçãooo;

/**
 *
 * @author Daniel
 */
public class Pedido {
    
    public int Quant_Prod;
    public String Cod_Pedido;
    public String Forma_Pagamento;
    public Double Valor_Pedido;
    protected String End_Entrega;
    
    
    public void setQuant_Prod(int Quant_Prod) {
       this.Quant_Prod = Quant_Prod;
    }
    
    public void setCod_Pedido(String Cod_Pedido) {
        this.Cod_Pedido = Cod_Pedido;
    }
    
    public void setForma_Pagamento(String Forma_Pagamento) {
      this.Forma_Pagamento = Forma_Pagamento;
    }
    
    public void setValor_Pedido(Double Valor_Pedido) {
        this.Valor_Pedido = Valor_Pedido;
    }

    public void setEnd_Entrega(String End_Entrega) {
      this.End_Entrega = End_Entrega;
    }
    
    public int getQuant_Prod(){
        return Quant_Prod;
    }
    
    public String getCod_Pedido() {
        return Cod_Pedido;
    }
    
    public String getForma_Pagamento(){
        return Forma_Pagamento;
    }
    
    public Double getValor_Pedido(){
        return Valor_Pedido;
    }
    
    public String getEnd_Entrega(){
        return End_Entrega;
    }
   
    
}
