class Main {
       
      public static void main(String[] args){
              Carro  c= new Carro();
              c.cor= "Azul";
              c.modelo= "Novo Onix";
              c.ano=  2020;
              c.marca= "Chevrolet";
              c.direcao = "automatico";
              c.combustivel= "flex";
              c.portas = 4;
              System.out.println("Meu carro é "+c.marca);
              System.out.println("Ano:"+c.ano+"\nModelo:"+c.modelo+"\nDireção:"+c.direcao+"\nCombustivel:"+c.combustivel+
              "\nPortas:"+c.portas);
              
              Carro  c1= new Carro();
              c1.cor= "Preto";
              c1.modelo= "Captiva";
              c1.ano=  2018;
              c1.marca= "Chevrolet";
              c1.direcao = "semi-automatico";
              c1.combustivel= "gasolina";
              c1.portas = 4;
              System.out.println("\nMeu carro é "+c1.marca);
              System.out.println("Ano:"+c1.ano+"\nModelo:"+c1.modelo+"\nDireção:"+c1.direcao+"\nCombustivel:"+c1.combustivel+
              "\nPortas:"+c1.portas);
              
              Carro  c2= new Carro();          
              c2.cor= "Laranja";
              c2.modelo= "Mustang";
              c2.ano=  2021;
              c2.marca= "Ford";
              c2.direcao = "manual";
              c2.combustivel= "alcool";
              c2.portas = 2;
              System.out.println("\nMeu carro é "+c2.marca);
              System.out.println("Ano:"+c2.ano+"\nModelo:"+c2.modelo+"\nDireção:"+c2.direcao+"\nCombustivel:"+c2.combustivel+
              "\nPortas:"+c2.portas);
              
              
              
                   
      }
 

}
