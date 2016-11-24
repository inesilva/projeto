/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Scanner;

/**
 *
 * @author ines_
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.printf("************* GESTOR DE EXAMES *************\n");
        System.out.printf("Selecione o que pretende fazer:\n");
        System.out.printf("[1]  - Criar exame\n");
        System.out.printf("[2]  - Associar docente\n");
        System.out.printf("[3]  - Inscrever aluno\n");
        System.out.printf("[4]  - Associar vigilantes\n");
        System.out.printf("[5]  - Listar exames\n");
        System.out.printf("[6]  - Lançar notas\n");
        System.out.printf("[7]  - Listar alunos inscritos\n");
        System.out.printf("[8]  - Listar exames em que um aluno está inscrito\n");
        System.out.printf("[9]  - Reservar sala\n");
        System.out.printf("[10] - Listar notas de um exame\n");
        System.out.printf("[11] - Listar exames em que um funcionário está envolvido\n");
        System.out.printf("[12] - Listar funcionários associados a um exame\n");
        System.out.printf("[0]  - Sair\n");
        
        int escolha;
        Scanner sc = new Scanner(System.in);
        escolha = sc.nextInt();
        Curso LEI = new Curso();
        Aluno a1 = new Aluno("Francisco","fran@uc.pt",2015232998,LEI,2015,"normal");
        switch(escolha){
            case 1: //criarExame();
            case 2: //associarDocente();
            case 3: //inscreverAluno();
            case 4: //associarVigilantes();
            case 5: //
        }
        
    
    }   
    
    
}   

class Pessoa{
    String nome;
    String email;
    Pessoa(String n, String e){
        this.nome=n;
        this.email=e;
    }
}

class Aluno extends Pessoa{
    int nrAluno;
    Curso curso;
    int anoMatricula;
    String regime;
    
    Aluno(String nome, String email, int nrAluno, Curso curso, int aM,String regime){
        super(nome,email);
        this.nrAluno=nrAluno;
        this.curso=curso;
        this.anoMatricula=aM;
        this.regime=regime;
    }
    public int getNrAluno(){
        return this.nrAluno;
    }
    public int getAnoMatricula(){
        return this.anoMatricula;
    }
    Curso getCurso(){
        return this.curso;
    }
    String getRegime(){
        return this.regime;
    }
    
}

class Funcionario extends Pessoa{
    int nrMecanog;
    String categoria;

    Funcionario(String nome, String email, int nrM,String categoria) {
        super(nome,email);
        this.nrMecanog = nrM;
        this.categoria = categoria;
    }
}

class Docente extends Funcionario{
    String areaInves;

    Docente(String nome, String email, int nrM, String categoria, String areaIn) {
        super(nome, email, nrM, categoria);
        this.areaInves = areaIn;
    }   
}

class NaoDocente extends Funcionario{
    String cargo;

    NaoDocente(String nome, String email, int nrM, String categoria, String cargo) {
        super(nome, email, nrM, categoria);
        this.cargo = cargo;
    }
}

class Departamento{
    
}

class Disciplina{
   String nome;
}

class Exame{
    Data data;
    int duracao;
    Sala sala;
    Docente responsavel;
}

class Nota extends Exame{
    Aluno aluno;
    int nota;
    Exame exame;
}

class Data{
    int dia;
    int mes;
    int ano;
    int hora;
    Data(int d, int m, int a, int h){
        this.dia=d;
        this.mes=m;
        this.ano=a;
        this.hora=h;
    }
}

class Sala{
    int nr;
    Sala(int nr){
        this.nr=nr;
    }
}

class Curso{
    String nome;
    int duracao;
    String grau;
    Curso(String n, int d, String g){
        this.nome=n;
        this.duracao=d;
        this.grau=g;
    }
}