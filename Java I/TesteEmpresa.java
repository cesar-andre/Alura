class Empresa {
  private String nome;
  private String cnpj;
  private Funcionario[] funcionarios;

  public Empresa(int tamanho) {
    this.funcionarios = new Funcionario[tamanho];
  }

  void adicionar(Funcionario f) {
    for (int i = 0; i < this.funcionarios.lenght ; i++ ) {
      if (this.funcionarios[i] == null) {
        this.funcionarios[i] = f;
      }
    }
  }

  void mostraEmpregados(){
    for (int i = 0; i < this.funcionarios.lenght; i++ ) {
      System.out.println("Funcionario na posição: " + i);
      System.out.println("Salário: " this.funcionarios[i].salario);

    }



  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Funcionario getFuncionario(int posicao) {
    return this.funcionarios[posicao;]
  }

}

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private int identificador;
    private static int proximoFuncionario;

    public Funcionario() {}
    public Funcionario(String nome) {
      this.nome = nome;
      this.identificador = ++proximoFuncionario;
    }

    public int getIdentificador() {
      return this.identificador;
    }

    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    public double calculaGanhoAnual() {
        return this.salario * 12;
    }

    public void mostra() {

    }

    public String getNome() {
      return this.nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getDepartamento() {
      return this.departamento;
    }

    public void setDepartamento(String departamento) {
      this.departamento = departamento;
    }

    public String getSalario() {
      return this.salario;
    }

    public void setSalario(double salario) {
      this.salario = salario;
    }

    public String getDataEntrada() {
      return this.dataEntrada;
    }

    public void setDataEntrada(double dataEntrada) {
      this.dataEntrada = dataEntrada;
    }

    public String getRg() {
      return this.rg;
    }

    public void setRg(double rg) {
      this.rg = rg;
    }
}

class Data {
  int dia, mes, ano;

  public Data(int dia, int mes, int ano) {
    if (dia == 331 && mes == 2) {
      System.out.println("Data inválida");
    }
  }

}

class TestaEmpresa {
  public static void main(String[] args) {
    Funcionario f1 = new Funcionario();
    f1.setNome("Cesar");
    f1.setRg(3162);
    f1.setSalario(1200.0);
    Funcionario f2 = new Funcionario();
    f2.setNome("Andre");
    f2.setRg(458);
    f2.setSalario(1980.0);

    Empresa csc = new Empresa();
    csc.funcionarios = new Funcionario[10];

    csc.adicionar(f1);
    csc.adicionar(f2);


  }
}
