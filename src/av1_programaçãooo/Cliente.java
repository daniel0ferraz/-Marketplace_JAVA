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
public class Cliente {
    protected String Nome;
    protected String CPF;
    protected String Email;
    protected String Telefone;
    
     public void setNome(String Nome) {
        this.Nome = Nome;
    }
      
      public void setCPF(String CPF) {
          this.CPF = CPF;
      }
      
      public void setEmail(String Email) {
          this.Email = Email;
      }
      
      public void setTelefone(String Telefone){
          this.Telefone = Telefone;
      }
      
     public String getNome() {
         return Nome;
     }
     
     public String getCPF(){
         return CPF;
     }
     
     public String getEmail() {
         return Email;
     }
     
     public String getTelefone() {
         return Telefone;
     }
     
      public void Cancela_Pedido(){
          System.out.println("Cancela_Pedido");
      }
      
}
