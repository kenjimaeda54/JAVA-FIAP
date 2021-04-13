class Main {
       
      public static void main(String[] args){
          
              Funcionario p= new Funcionario();
              
              p.apelido = "Araujo";
              p.rg = 151554;
              p.profissao = "Doutor";
              p.salario = 18000.0;
              p.departamento= "Sala Medica";
            
           
              p.Aumento( 520 );
   
              
              double valorNovo =  p.ganhoAnual();
              
             System.out.println(p.mostrar())

      }
 

}
