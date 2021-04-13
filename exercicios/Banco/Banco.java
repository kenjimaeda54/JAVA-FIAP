class Banco{
  int numero;
  String dono;
  double saldo;
  double limite;
  
  
                 //preciso inferir a classe no caso Banco
  void transferir(Banco destino,double valor){
       this.saldo = this.saldo -valor;
       destino.saldo = destino.saldo + valor;
    
  
  }
  
 
   boolean Sacar( double quantidade ){
         if( this.saldo < quantidade){
             
             return false;
            
         }else {
         
             this.saldo= this.saldo - quantidade;
             return true;
         }
 
     }
     
   void Deposito(double valor) {
       this.saldo = this.saldo + valor;
      System.out.println("Depoisto feito com sucesso " +valor);
      
   }    
  
}
