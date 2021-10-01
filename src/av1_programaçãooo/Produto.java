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
public class Produto {

  public String Nome;
  public String Cod_Prod;
  public Double Valor_Produto;
  public String Desc;
  public int Estoque;

  public void setNome(String Nome) {
    this.Nome = Nome;
  }

  public void setCod_Prod(String Cod_Prod) {
    this.Cod_Prod = Cod_Prod;
  }

  public void setValor_Produto(Double Valor_Produto) {
    this.Cod_Prod = Cod_Prod;
  }
  
  public void setDesc(String Desc) {
    this.Desc = Desc;
  }

  public void setEstoque(int Estoque) {
    this.Estoque = Estoque;
  } 

  public String getNome() {
    return Nome;
  }

  public String getCod_Prod() {
    return Cod_Prod;
  }

  public Double getValor_Produto() {
    return Valor_Produto;
  }

  public String getDesc() {
    return Desc;
  }

  public int getEstoque() {
    return Estoque;
  }

    
}