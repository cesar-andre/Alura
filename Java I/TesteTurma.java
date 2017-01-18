class Turma{
  Aluno[] alunos;

  void imprimeNotas() {
    for (int i = 0; i < this.alunos.length; i++) {
      if (this.alunos[i] == null) continue;
      System.out.println(this.alunos[i].nota);
    }
  }
}

class Aluno {
  String nome;
  int nota;
}

class TesteTurma {
  public static void main(String[] args) {
    Turma fj11 = new Turma();
    fj11.alunos = new Aluno[10];

    fj11.alunos[0] = new Aluno();
    fj11.alunos[0].nome = "Cesar";
    fj11.alunos[0].nota = 9;
    fj11.alunos[1] = new Aluno();
    fj11.alunos[1].nome = "André";
    fj11.alunos[1].nota = 5;
    fj11.alunos[2] = new Aluno();
    fj11.alunos[2].nome = "Adriano";
    fj11.alunos[2].nota = 6;

    fj11.imprimeNotas();

  }
}
