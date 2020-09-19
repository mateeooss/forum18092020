package adsis4sem2020;

public class Pet {
   private String nome;
   private Pedigree pedigree;
   
   public Pet(String nome){
	   this.nome=nome;
   }
   
   public Pet(String nome, Pedigree pedigree) {
	   this.nome=nome;
	   this.pedigree=pedigree;
   }
   
   public void setPedigree(Pedigree pedigree) {
		this.pedigree=pedigree;
   }
   

}
