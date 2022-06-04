import java.util.ArrayList;
import java.util.List;

public class Cursos {
	//Criar as listas para armazenar os dados do Curso
	
	List<String> turmas = new ArrayList<>();
	List<String> horario = new ArrayList<>();
	List<String> dataInicio = new ArrayList<>();
	List<String> turmasRelativas = new ArrayList<>();
	
	//Preenche as listas com os dados dos cursos (precisa ser melhorado)
	
	public void registroCursos() {
		
		turmas.add("turma1");
		turmas.add("turma2");
		turmas.add("turma3");
		
		horario.add("Manhã");
		horario.add("Tarde");
		horario.add("Noite");
		
		dataInicio.add("01/01/2023");
		dataInicio.add("01/02/2023");
		dataInicio.add("01/03/2023");
		
	}
		
		//Apresenta os dados dos cursos para o usuário
		
		public void mostraInforme(int i) {
			
			System.out.println("---------- Informações do Curso ----------");
			
			System.out.println("Turma: " + turmas.get(i));
			System.out.println("Horário: " + horario.get(i));
			System.out.println("Data de Inicio: " + dataInicio.get(i));
			
			System.out.println("------------------------------------------");
			
	}
	
}
