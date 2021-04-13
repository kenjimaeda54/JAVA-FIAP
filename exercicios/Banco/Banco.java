class Banco{
  int numero;
  String dono;
  double saldo;
  double limite;
 
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
