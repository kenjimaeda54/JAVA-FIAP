class Main {
       
      public static void main(String[] args){
          
              Aeroporto ae= new Aeroporto();
          
              ae.cor= "Bege";
              ae.porte= "pequenos aviões";
              ae.ano=  1900;
              ae.esfera= "publica";
              ae.localizacao = "Rua das Magia,Bairro Canavara";
              ae.estacionamento= "Possui estacionamento";
              System.out.println("O aeroporto fica  "+ae.localizacao);
              System.out.println("Ano:"+ae.ano+"\nEsfera:"+ae.esfera+"\nPorte:"+ae.porte+"\nEstacionamento:"+ae.estacionamento);
                   
              Aeroporto ae1 = new Aeroporto();
              
              ae1.cor= "Marrom";
              ae1.porte= "grandes aviões";
              ae1.ano=  2010;
              ae1.esfera= "privada";
              ae1.localizacao = "Rua dos Bobos,Bairro Tatu";
              ae1.estacionamento= "Possui estacionamento";
              System.out.println("\nO aeroporto fica  "+ae1.localizacao);
              System.out.println("Ano:"+ae1.ano+"\nEsfera:"+ae1.esfera+"\nPorte:"+ae1.porte+"\nEstacionamento:"+ae1.estacionamento);;
     
              Aeroporto ae2 = new Aeroporto();
             
              ae2.cor= "Azul";
              ae2.porte= "medio aviões";
              ae2.ano=  2000;
              ae2.esfera= "publica";
              ae2.localizacao = "Rua das Mortes,Bairro Cemiterio";
              ae2.estacionamento= "Não possui ";
              System.out.println("\nO aeroporto fica  "+ae2.localizacao);
              System.out.println("Ano:"+ae2.ano+"\nEsfera:"+ae2.esfera+"\nPorte:"+ae2.porte+"\nEstacionamento:"+ae2.estacionamento);;
     
         
      }
 

}
