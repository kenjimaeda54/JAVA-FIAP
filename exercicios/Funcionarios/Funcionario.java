class Funcionario{

  int cpf;
  String apelido;
  int rg;
  String profissao;
  double salario;
  String departamento;

 
   void Aumento( double aumento ){
        this.salario = this.salario + aumento;
       System.out.println("Aumento feito com sucesso R$" +aumento);
     }
     
    double ganhoAnual () {
        double ganhoAnual = this.salario * 12;
        return ganhoAnual;
       }   
       
     void mostrar( ){
       
	System.out.println("Nome do funcionario: "+this.apelido+" Salario antigo R$:"+this.salario+"ganho anual anterior"+this.salario * 12);
	System.out.println("Salario atual R$:"+"ganho anual atual R$ "+this.ganhoAnual());	
		  	   
   }   	
  
}
