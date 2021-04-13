class Main {
       
      public static void main(String[] args){
          
              Pessoa  p= new Pessoa();
              
              p.apelido = "Joao";
              p.cpf = 951516;
              p.rg = 2625151;
              p.profissao = "Front end";
              
              
              
              System.out.println("Meu nome é "+p.apelido);
              System.out.println("CPF:"+p.cpf+"\nRG:"+p.rg+"\nProfissão:"+p.profissao);
              
              Pessoa p1= new Pessoa();     
                   
              p1.apelido = "Pedro";
              p1.cpf = 5154861;
              p1.rg =  7156156;
              p1.profissao = "Back End";
              
              System.out.println("\nMeu nome é "+p1.apelido);
              System.out.println("CPF:"+p1.cpf+"\nRG:"+p1.rg+"\nProfissão:"+p1.profissao);
              
              
              Pessoa p2= new Pessoa();
              
              p2.apelido = "Beatriz";
              p2.cpf = 95515;
              p2.rg = 2625481;
              p2.profissao = "Full stack";
              
              System.out.println("\nMeu nome é "+p2.apelido);
              System.out.println("CPF:"+p2.cpf+"\nRG:"+p2.rg+"\nProfissão:"+p2.profissao);

      }
 

}
