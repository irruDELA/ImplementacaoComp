public class Pessoa {
    private String nome;
    private String dataDeNascimento;
     
     public Pessoa (String nome, String dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
     }

     public String getNome() {
        return nome;
     }
     
      public int dataDeNascimento() {
          return (2023- Integer.parseInt(dataDeNascimento));

      }
}