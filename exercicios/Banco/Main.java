class Main {
       
      public static void main(String[] args){
          
              Banco  p= new Banco();
             
              
              p.numero = 1105;
              p.dono = "Calisson Araujo";
              p.saldo = 100.0;
              p.limite = 10000.0;
              
              
              
              System.out.println("Meu nome é "+p.dono);
              System.out.println("Numero de registro:"+p.numero+"\nSaldo R$:"+p.saldo);
              
              System.out.println((p.Sacar(50.0) == true ) ? "Saque efetudado com sucesso R$:" : "Não pode ser efetuado saque, seu saldo é R$:" +p.saldo);
              
              p.Deposito(255);
              System.out.println("Novo saldo "+p.saldo);
              
              
               Banco  y= new Banco();
               
               y.saldo = 204030;
               
               y.transferir(p,1000);
               System.out.println("Este é o saldo que sonho todo os dias R$" + y.saldo); 
               System.out.println("Este é o meu saldo atual R$:" +p.saldo);

      }
 

}
