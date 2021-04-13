class Main {
       
      public static void main(String[] args){
          
              Banco  p= new Banco();
              
              p.numero = 1105;
              p.dono = "Calisson Araujo";
              p.saldo = 100.0;
              p.limite = 10000.0;
              
              
              
              System.out.println("Meu nome é "+p.dono);
              System.out.println("Numero:"+p.numero+"\nSaldo:"+p.saldo+"\nLmimite:"+p.limite);
              
              System.out.println((p.Sacar(1250.0) == true ) ? "Saque efetudado com sucesso" : "Não pode ser efetuado saque, seu saldo é R$:" +p.saldo);
              
              p.Deposito(255);
              System.out.println("Novo saldo "+p.saldo);

      }
 

}
