class Main {
       
      public static void main(String[] args){
          
              Apartamento  ap= new Apartamento();
          
              ap.cor= "Bege";
              ap.comodos= 7;
              ap.ano=  2000;
              ap.andar= 3;
              ap.localizacao = "Rua das Fantasias,Bairro Joao Pedro";
              ap.estacionamento= "Possui estacionamento";
              System.out.println("Meu apartamento fica em  "+ap.localizacao);
              System.out.println("Ano:"+ap.ano+"\nAndar:"+ap.andar+"\nComodos:"+ap.comodos+"\nEstacionamento:"+ap.estacionamento);
                   
              Apartamento ap1 = new Apartamento();
              
              ap1.cor= "Marrom";
              ap1.comodos= 10;
              ap1.ano=  1198;
              ap1.andar= 4;
              ap1.localizacao = "Rua das Mentiras,Bairro Joao Vitor";
              ap1.estacionamento= "Não possui";
              System.out.println("\nMeu apartamento fica em  "+ap1.localizacao);
              System.out.println("Ano:"+ap1.ano+"\nAndar:"+ap1.andar+"\nComodos:"+ap1.comodos+"\nEstacionamento:"+ap1.estacionamento);
     
              Apartamento ap2 = new Apartamento();
              
              ap2.cor= "Cinza";
              ap2.comodos= 5;
              ap2.ano=  1995;
              ap2.andar= 8;
              ap2.localizacao = "Rua das Brejas,Bairro Barzinho";
              ap2.estacionamento= "Não possui";
              System.out.println("\nMeu apartamento fica em  "+ap2.localizacao);
              System.out.println("Ano:"+ap2.ano+"\nAndar:"+ap2.andar+"\nComodos:"+ap2.comodos+"\nEstacionamento:"+ap2.estacionamento);
         
      }
 

}
