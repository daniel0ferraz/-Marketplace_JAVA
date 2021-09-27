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
public class Fornecedor {

  public String Nome;
  public String CNPJ;
  protected String Endereco;
  

  public void setNome(String Nome) {
    this.Nome = Nome;
  }

  public void setCNPJ(String CNPJ) {
    this.CNPJ = CNPJ;
  }

  public void setEndereco(String Endereco) {
     this.Endereco = Endereco;
  }

  public String getNome() {
    return Nome;
  }

  public String getCNPJ() {
    return CNPJ;
  }

  public String getEndereco() {
    return Endereco;
  }

  public void Cancela_Pedido() {
   System.out.println("Cancelar Pedido: ");
  }
    
}